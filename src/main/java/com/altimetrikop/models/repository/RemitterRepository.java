package com.altimetrikop.models.repository;

import com.altimetrikop.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RemitterRepository extends JpaRepository<Remitter, Long>{

}



