package com.House.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.House.entity.house;
import com.House.entity.owner;
import com.House.entity.renter;
import com.House.external.service.ownerService;
import com.House.external.service.renterService;
import com.House.repo.houseRepo;
import com.House.service.houseService;

@Service
public class houseImpl implements houseService {
	
	@Autowired
	private houseRepo HouseRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ownerService OwnerService;
	
	@Autowired
	private renterService RenterService;
	
	
	
	
	private Logger logger= LoggerFactory.getLogger(houseImpl.class);

	@Override
	public house createInfo(house House) {
		
		return HouseRepo.save(House);
	}

	@Override
	public List<house> getAllInfoOfHouse() {
		List<house> getAllHouse= HouseRepo.findAll();
		
		for(house h: getAllHouse)
		{
			
			List<owner> Owners=OwnerService.getOwner(h.getHouseId());
			
			List<owner> ownerWithRenters= Owners.stream().map(ow -> {
				
				ResponseEntity<renter> rEntity = restTemplate.getForEntity("http://RENTER-SERVICE/renter/renterid/"+ow.getRenterId(), renter.class);
				
				if(rEntity != null)
				{
					renter R=rEntity.getBody();
					ow.setRenter(R);
				}
				
				return ow;
				
			}).collect(Collectors.toList());
			
			h.setOwner(ownerWithRenters);
		}
		return  getAllHouse;
	}

	//communicating house service,owner service and renter serive. all are communicating by resttemplate
//	@Override
//	public house getByHouseId(String houseId) {
//		house House=HouseRepo.findById(houseId).orElseThrow(null);
	
//		
//		//http://localhost:4002/owner/houseId/64a01d9095937b4344abd5c2 --->owner by house id
//		owner[] OwnerData=restTemplate.getForObject("http://OWNER-SERVICE/owner/houseId/"+House.getHouseId(),owner[].class);
//		logger.info("{} ",OwnerData);
//		List<owner> owners=Arrays.stream(OwnerData).toList();
//		
//		List<owner> ownerList=owners.stream().map(ownerdata -> {
//			//http://localhost:4003/renter/renterid/104 -->renter by renter id
//			ResponseEntity<renter> renterEntity=restTemplate.getForEntity("http://RENTER-SERVICE/renter/renterid/"+ownerdata.getRenterId(), renter.class);
//			
//			renter r= renterEntity.getBody();
//			ownerdata.setRenter(r);
//			
//			
//			return ownerdata;
//			
//		}).collect(Collectors.toList());
//		
//		House.setOwner(ownerList);
//		return House;
//	}

	
	
	//communicating house and owner by resttemplate (owner and renter are communicating by resttemplate).
//	@Override
//	public house getByHouseId(String houseId) {
//		house House=HouseRepo.findById(houseId).orElseThrow(null);
//		
//		//http://localhost:4002/owner/houseId/64a01d9095937b4344abd5c2 --->owner by house id
//		List<owner> owners= OwnerService.getOwner(House.getHouseId());
//		
//		List<owner> ownerList=owners.stream().map(ownerdata -> {
//			//http://localhost:4003/renter/renterid/104 -->renter by renter id
//			ResponseEntity<renter> renterEntity=restTemplate.getForEntity("http://RENTER-SERVICE/renter/renterid/"+ownerdata.getRenterId(), renter.class);
//			
//			if(renterEntity != null)
//			{
//				renter r= renterEntity.getBody();
//				ownerdata.setRenter(r);
//			}
//			
//			
//			return ownerdata;
//			
//		}).collect(Collectors.toList());
//		
//		House.setOwner(ownerList);
//		return House;
//	}
	
	//communicating house and owner by feign client.owner and renter by feign client
	@Override
	public house getByHouseId(String houseId) {
		house House=HouseRepo.findById(houseId).orElseThrow(null);
		
		//http://localhost:4002/owner/houseId/64a01d9095937b4344abd5c2 --->owner by house id
		List<owner> owners= OwnerService.getOwner(House.getHouseId());
		
		List<owner> ownerList=owners.stream().map(ownerdata -> {
			//http://localhost:4003/renter/renterid/104 -->renter by renter id
			//ResponseEntity<renter> renterEntity=restTemplate.getForEntity("http://RENTER-SERVICE/renter/renterid/"+ownerdata.getRenterId(), renter.class);
			renter renterEntity= RenterService.getRenterById(ownerdata.getRenterId());
			ownerdata.setRenter(renterEntity);
			return ownerdata;
			
		}).collect(Collectors.toList());
		
		House.setOwner(ownerList);
		return House;
	}


}
