package com.htc.compositmanagementsystem.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.compositmanagementsystem.entity.Doctor;

@Service	
@FeignClient(url = "http://localhost:64652",name="doctormanagement")
public interface DoctorService {
	@GetMapping("/api/doctors/{doctorId}")
	Doctor getDoctorById(@PathVariable("doctorId") Long doctorId);


}
