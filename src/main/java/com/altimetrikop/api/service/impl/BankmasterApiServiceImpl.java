package com.altimetrikop.api.service.impl;

import com.altimetrikop.api.service.*;
import com.altimetrikop.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikop.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikop.models.Bankmaster;


import java.util.List;
import com.altimetrik.op.exception.NotFoundException;


@Service
@Transactional
public class BankmasterApiServiceImpl implements BankmasterApiService {
		  	  
	  @Autowired
	
  	  private BankmasterRepository  bankmasterRepository ;
	   
  
  
				
			
      @Override
      public List<Bankmaster> findAllBankmaster()
      throws NotFoundException {
      
        
  		
  		
  			return bankmasterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster updateBankmaster(Bankmaster bankmaster)
      throws NotFoundException {
      
         
        	return bankmasterRepository.save(bankmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster addBankmaster(Bankmaster bankmaster)
      throws NotFoundException {
      
         
        	return bankmasterRepository.save(bankmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster findByIdBankmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return bankmasterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBankmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

