package com.PortfolioService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.PortfolioService.model.PortFolio;
@Repository
public interface PortFolioRepository extends MongoRepository<PortFolio,String>{

}
