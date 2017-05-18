package com.altimetrikop.models.repository;

import com.altimetrikop.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

}



