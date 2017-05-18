package com.altimetrikop.models.repository;

import com.altimetrikop.models.*;

import com.altimetrikop.models.Routingrule;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ExchangeconditionRepository extends JpaRepository<Exchangecondition, Integer>{

}



