package com.PortfolioService.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PortFolio {
	@MongoId
	 private String tradeAccountNo;
     private Double balance;
     private String linkedBankAccount;
     private Map<String,Integer> portfolio;

}
