package com.altimetrikop.api.service;

import com.altimetrikop.models.Pmtinf;


import com.altimetrik.op.exception.NotFoundException;
import java.util.List;

public interface PmtinfApiService {
  
      List<Pmtinf> findAllPmtinf()
      throws NotFoundException;
  
      Pmtinf updatePmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf addPmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf findByIdPmtinf(Integer id)
      throws NotFoundException;
  
      void deletePmtinf(Integer id)
      throws NotFoundException;
  
}

