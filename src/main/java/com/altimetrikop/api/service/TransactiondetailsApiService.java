package com.altimetrikop.api.service;

import com.altimetrikop.models.Transactiondetails;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface TransactiondetailsApiService {
  
      List<Transactiondetails> findAllTransactiondetails()
      throws NotFoundException;
  
      Transactiondetails updateTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails addTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails findByIdTransactiondetails(String id)
      throws NotFoundException;
  
      void deleteTransactiondetails(String id)
      throws NotFoundException;
  
}

