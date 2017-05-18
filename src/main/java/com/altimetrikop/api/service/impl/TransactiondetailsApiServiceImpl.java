package com.altimetrikop.api.service.impl;

import com.altimetrikop.api.service.*;
import com.altimetrikop.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikop.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikop.models.Transactiondetails;


import java.util.List;
import com.altimetrik.op.exception.NotFoundException;


@Service
@Transactional
public class TransactiondetailsApiServiceImpl implements TransactiondetailsApiService {
		  	  
	  @Autowired
	
  	  private TransactiondetailsRepository  transactiondetailsRepository ;
	   
  
  
				
			
      @Override
      public List<Transactiondetails> findAllTransactiondetails()
      throws NotFoundException {
      
        
  		
  		
  			return transactiondetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactiondetails updateTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException {
      
         
        	return transactiondetailsRepository.save(transactiondetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactiondetails addTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException {
      
         
        	return transactiondetailsRepository.save(transactiondetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactiondetails findByIdTransactiondetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return transactiondetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTransactiondetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
