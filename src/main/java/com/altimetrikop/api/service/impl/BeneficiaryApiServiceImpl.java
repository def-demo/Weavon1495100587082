package com.altimetrikop.api.service.impl;

import com.altimetrikop.api.service.*;
import com.altimetrikop.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikop.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikop.models.Beneficiary;


import java.util.List;
import com.altimetrik.op.exception.NotFoundException;


@Service
@Transactional
public class BeneficiaryApiServiceImpl implements BeneficiaryApiService {
		  	  
	  @Autowired
	
  	  private BeneficiaryRepository  beneficiaryRepository ;
	   
  
  
				
			
      @Override
      public List<Beneficiary> findAllBeneficiary()
      throws NotFoundException {
      
        
  		
  		
  			return beneficiaryRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Beneficiary updateBeneficiary(Beneficiary beneficiary)
      throws NotFoundException {
      
         
        	return beneficiaryRepository.save(beneficiary);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Beneficiary addBeneficiary(Beneficiary beneficiary)
      throws NotFoundException {
      
         
        	return beneficiaryRepository.save(beneficiary);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Beneficiary findByIdBeneficiary(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return beneficiaryRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBeneficiary(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

