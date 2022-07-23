package com.PortfolioService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PortfolioService.model.PortFolio;
import com.PortfolioService.service.PortFolioService;
@RestController
@RequestMapping("/portFolio")
public class PortFolioController {
	
	
	@Autowired
	PortFolioService portFolioService;
	
	
	@PostMapping("/post")
	private ResponseEntity<PortFolio> postportfolio(@RequestBody PortFolio PortFolio){
		PortFolio portFolio1=portFolioService.postportfolio(PortFolio);
		return new ResponseEntity<PortFolio>(portFolio1,HttpStatus.OK);
	}
	@GetMapping("/get")
	private ResponseEntity<List<PortFolio>> getallportfolio(){
		List<PortFolio> port=portFolioService.getallportFolio();
		return new ResponseEntity<List<PortFolio>>(port, HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{tradeAccountNo}")
	private ResponseEntity<PortFolio>getBytradeAccountportNoportfolio(@PathVariable String tradeAccountNo){
		Optional<PortFolio> port=portFolioService.getBytradeAccountNoportfolio(tradeAccountNo);
		PortFolio port1=port.get();
		return new ResponseEntity<PortFolio>(port1,HttpStatus.OK);
	}
	
	@PutMapping("/put/{tradeAccountNo}")
	private ResponseEntity<PortFolio>updateportfoliodata(@PathVariable String tradeAccountNo,@RequestBody PortFolio portFolio){
		PortFolio port=portFolioService.updateportFoliodata(portFolio,tradeAccountNo);
		return new ResponseEntity<PortFolio>(port,HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{tradeAccountNo}")
	private ResponseEntity<String>deletBytradeAccountNo(@PathVariable String tradeAccountNo){
		portFolioService.deletBytradeAccountNo(tradeAccountNo);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
