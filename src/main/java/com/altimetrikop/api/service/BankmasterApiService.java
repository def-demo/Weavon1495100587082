package com.altimetrikop.api.service;

import com.altimetrikop.models.Bankmaster;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface BankmasterApiService {
  
      List<Bankmaster> findAllBankmaster()
      throws NotFoundException;
  
      Bankmaster updateBankmaster(Bankmaster bankmaster)
      throws NotFoundException;
  
      Bankmaster addBankmaster(Bankmaster bankmaster)
      throws NotFoundException;
  
      Bankmaster findByIdBankmaster(Integer id)
      throws NotFoundException;
  
      void deleteBankmaster(Integer id)
      throws NotFoundException;
  
}

