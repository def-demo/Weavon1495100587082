package com.altimetrikop.models.repository;

import com.altimetrikop.models.*;

import com.altimetrikop.models.Pmtinf;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TransactioninfoRepository extends JpaRepository<Transactioninfo, Integer>{

}



