package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dto.DTO;
import com.hr.repository.OracleRepository;
import com.hr.service.OracleService;

@Service
public class OracleServiceImpl implements OracleService{
	@Autowired
	OracleRepository oracleRepository;
	
	@Override
	public void insert(DTO dto) {
	oracleRepository.insert(dto);
		
	}
	
}
