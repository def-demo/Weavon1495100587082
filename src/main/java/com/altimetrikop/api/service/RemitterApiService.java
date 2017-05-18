package com.altimetrikop.api.service;

import com.altimetrikop.models.Remitter;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface RemitterApiService {
  
      List<Remitter> findAllRemitter()
      throws NotFoundException;
  
      Remitter updateRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter addRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter findByIdRemitter(Long id)
      throws NotFoundException;
  
      void deleteRemitter(Long id)
      throws NotFoundException;
  
}

