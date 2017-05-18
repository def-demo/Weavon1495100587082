package com.altimetrikop.models.repository;

import com.altimetrikop.models.*;

import com.altimetrikop.models.Transactiondetails;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PmtinfRepository extends JpaRepository<Pmtinf, Integer>{

}



