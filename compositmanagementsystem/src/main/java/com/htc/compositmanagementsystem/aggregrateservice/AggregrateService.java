package com.htc.compositmanagementsystem.aggregrateservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.htc.compositmanagementsystem.entity.AggregateClass;
import com.htc.compositmanagementsystem.entity.Appointment;
import com.htc.compositmanagementsystem.entity.Doctor;
import com.htc.compositmanagementsystem.externalservices.AppointmentService;
import com.htc.compositmanagementsystem.externalservices.DoctorService;

@Service
public class AggregrateService {
	@Autowired	
	DoctorService docservice;
	@Autowired
	AppointmentService apointservice;

	public AggregateClass getAggergateInfoById(Long doctorId) {
		// TODO Auto-generated method stub
		
		AggregateClass aggclss=  new AggregateClass();
		Doctor doc = new Doctor();
		
		doc =docservice.getDoctorById(doctorId);
		aggclss.setDoctorId(doc.getDoctorId());
		aggclss.setDoctorName(doc.getDoctorName());
		aggclss.setExperince(doc.getExperince());
		aggclss.setPhoneNumber(doc.getPhoneNumber());
		aggclss.setSpecilization(doc.getSpecilization());
		List<Appointment> appointments=new ArrayList<Appointment>();
		appointments.add(apointservice.getAppointmentBydoctorId(doctorId));
		
		
		aggclss.setAppointments(appointments);
		
		
		return aggclss;
	}
	
}
