package com.hr.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hr.dto.DTO;
import com.hr.repository.OracleRepository;

@Repository
public class OracleRepositoryImpl implements OracleRepository{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void insert(DTO dto) {
		String SQL="INSERT INTO test(name,password) values(:name, :password)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", dto.getName());
		params.put("password",dto.getPassword());
		jdbcTemplate.update(SQL, params);
	}
	
}
