package com.PortfolioService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PortfolioService.model.PortFolio;
import com.PortfolioService.repository.PortFolioRepository;
@Service
public class PortFolioService {
	
	@Autowired
	PortFolioRepository portFolioRepository;

	public PortFolio postportfolio(PortFolio portFolio) {
		PortFolio port=portFolioRepository.save(portFolio);
		return port;
	}

	public List<PortFolio> getallportFolio() {
		List<PortFolio> port=portFolioRepository.findAll();
		return port;
	}

	public Optional<PortFolio> getBytradeAccountNoportfolio(String tradeAccountNo) {
		Optional<PortFolio> port=portFolioRepository.findById(tradeAccountNo);
		return port;
	}

	public PortFolio updateportFoliodata(PortFolio portFolio, String tradeAccountNo) {
		Optional<PortFolio> port=portFolioRepository.findById(tradeAccountNo);
		PortFolio portFolio1=port.get();
		portFolio1.setTradeAccountNo(portFolio.getTradeAccountNo());
		portFolio1.setBalance(portFolio.getBalance());
		portFolio1.setLinkedBankAccount(portFolio.getLinkedBankAccount());
		portFolio1.setPortfolio(portFolio.getPortfolio());
		portFolioRepository.save(portFolio1);
		return portFolio1;
	}

	public void deletBytradeAccountNo(String tradeAccountNo) {
		portFolioRepository.deleteById(tradeAccountNo);
		
	}

}
