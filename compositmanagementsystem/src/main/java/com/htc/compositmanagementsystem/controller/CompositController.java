package com.htc.compositmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.htc.compositmanagementsystem.aggregrateservice.AggregrateService;
import com.htc.compositmanagementsystem.entity.AggregateClass;
import com.htc.compositmanagementsystem.entity.Appointment;
import com.htc.compositmanagementsystem.entity.Doctor;
import com.htc.compositmanagementsystem.externalservices.AppointmentService;
import com.htc.compositmanagementsystem.externalservices.DoctorService;


@RestController
public class CompositController {
@Autowired	
DoctorService agservice;
@Autowired
AppointmentService apservice;
@Autowired
AggregrateService aservice;

@GetMapping("/doc-aggregate/{doctorId}")
Doctor getDoctorbyId(@PathVariable Long doctorId)
{
	 Doctor doctor=null;
	doctor=agservice.getDoctorById(doctorId);
	return doctor;
	
}
@GetMapping("/appointments/{doctorId}")
  Appointment getAppointmentBydocId(@PathVariable Long doctorId)
{
	Appointment appointment=null;
	appointment=apservice.getAppointmentBydoctorId(doctorId);
	return appointment;
	
}
@GetMapping("/aggregatedata/{doctorId}")
AggregateClass getAggregateDetails(@PathVariable Long doctorId)
{
	AggregateClass aggregateclass=null;
	aggregateclass=aservice.getAggergateInfoById(doctorId);
	return aggregateclass;
	
}


	
}
