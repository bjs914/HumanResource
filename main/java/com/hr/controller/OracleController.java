package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hr.dto.DTO;
import com.hr.service.OracleService;

@Controller
public class OracleController {
	
	@Autowired
	OracleService oracleService;
	
	@RequestMapping(value="/oracle", method=RequestMethod.GET)
	public String insert(@ModelAttribute("newMemo") DTO dto, Model model) {
		try {
			oracleService.insert(dto);
		} catch (DataAccessException e) {
			return "oracle";
		}
		return "oracle";
	}
	
}
