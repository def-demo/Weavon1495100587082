package com.altimetrikop.api.service;

import com.altimetrikop.models.Routingrule;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface RoutingruleApiService {
  
      List<Routingrule> findAllRoutingrule()
      throws NotFoundException;
  
      Routingrule updateRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule addRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule findByIdRoutingrule(Integer id)
      throws NotFoundException;
  
      void deleteRoutingrule(Integer id)
      throws NotFoundException;
  
}

