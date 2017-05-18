package com.altimetrikop.api.service.impl;

import com.altimetrikop.api.service.*;
import com.altimetrikop.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikop.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikop.models.Exchangecondition;


import java.util.List;
import com.altimetrik.op.exception.NotFoundException;


@Service
@Transactional
public class ExchangeconditionApiServiceImpl implements ExchangeconditionApiService {
		  	  
	  @Autowired
	
  	  private ExchangeconditionRepository  exchangeconditionRepository ;
	   
  
  
				
			
      @Override
      public List<Exchangecondition> findAllExchangecondition()
      throws NotFoundException {
      
        
  		
  		
  			return exchangeconditionRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition updateExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException {
      
         
        	return exchangeconditionRepository.save(exchangecondition);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition addExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException {
      
         
        	return exchangeconditionRepository.save(exchangecondition);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition findByIdExchangecondition(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return exchangeconditionRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteExchangecondition(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

