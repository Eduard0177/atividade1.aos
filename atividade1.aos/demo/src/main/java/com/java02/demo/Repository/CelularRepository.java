package com.java02.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.java02.demo.Model.Celular;

@Repository
public interface  CelularRepository extends JpaRepository<Celular,Long>{
    
}
