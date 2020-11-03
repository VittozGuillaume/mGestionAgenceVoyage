package com.mvol.microservicevol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvol.microservicevol.entity.Vol;

@Repository
public interface IVolRepository extends JpaRepository<Vol, Integer> {

}
