package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.scholarInfo;

@Repository
public interface scholarRepo extends JpaRepository<scholarInfo, Long>{

}
