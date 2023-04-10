package com.revature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getdata")
public class QcController {
	@Autowired
	QcDataInterface qcin;
	
	@GetMapping("/student")
	public List<Student> getdetatis(){
		return qcin.findAll();
	}
}
