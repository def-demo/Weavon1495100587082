package com.altimetrikop.api.service;

import com.altimetrikop.models.Rulecriteria;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface RulecriteriaApiService {
  
      List<Rulecriteria> findAllRulecriteria()
      throws NotFoundException;
  
      Rulecriteria updateRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria addRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria findByIdRulecriteria(Integer id)
      throws NotFoundException;
  
      void deleteRulecriteria(Integer id)
      throws NotFoundException;
  
}

