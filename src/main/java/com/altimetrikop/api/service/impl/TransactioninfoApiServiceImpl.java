package com.altimetrikop.api.service.impl;

import com.altimetrikop.api.service.*;
import com.altimetrikop.models.*;
import org.springframework.stereotype.Service;
import com.altimetrikop.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrikop.models.Transactioninfo;


import java.util.List;
import com.altimetrik.op.exception.NotFoundException;


@Service
@Transactional
public class TransactioninfoApiServiceImpl implements TransactioninfoApiService {
		  	  
	  @Autowired
	
  	  private TransactioninfoRepository  transactioninfoRepository ;
	   
  
  
				
			
      @Override
      public List<Transactioninfo> findAllTransactioninfo()
      throws NotFoundException {
      
        
  		
  		
  			return transactioninfoRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo updateTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException {
      
         
        	return transactioninfoRepository.save(transactioninfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo addTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException {
      
         
        	return transactioninfoRepository.save(transactioninfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo findByIdTransactioninfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return transactioninfoRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTransactioninfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

