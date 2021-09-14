package com.htc.compositmanagementsystem.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.compositmanagementsystem.entity.Appointment;


@Service	
@FeignClient(url = "http://localhost:63122",name="appointmentmanagement")
public interface AppointmentService {
	@GetMapping("/api/appointments/{doctorId}")
	Appointment getAppointmentBydoctorId(@PathVariable("doctorId") Long doctorId);

}
