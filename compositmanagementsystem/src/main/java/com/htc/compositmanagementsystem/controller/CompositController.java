package com.htc.compositmanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

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
public class CompositController  implements AggregrateService{
@Autowired	
DoctorService docservice;
@Autowired
AppointmentService apointservice;

@GetMapping("/doctors/{doctorId}")
Doctor getDoctorbyId(@PathVariable Long doctorId)
{
	Doctor doctor=null;
	doctor=docservice.getDoctorById(doctorId);
	return doctor;
	
}

@Override
public AggregateClass getDoctorById(Long doctorId) {
	// TODO Auto-generated method stub
	
	AggregateClass aggclss=  new AggregateClass();
	Doctor doc = new Doctor();
	
	doc =docservice.getDoctorById(doctorId);
	aggclss.setDoctorId(doc.getDoctorId());
	aggclss.setDoctorName(doc.getDoctorName());
	aggclss.setExperince(doc.getExperince());
	aggclss.setPhoneNumber(doc.getPhoneNumber());
	aggclss.setSpecilization(doc.getSpecilization());
	List<Appointment> recommendations=new ArrayList<>();
	recommendations.addAll(apointservice.getRecommendationByProductId(doctorId).getContent());
	
	
	aggclss.setAppointments(recommendations);
	
	
	return null;
}
	
}
