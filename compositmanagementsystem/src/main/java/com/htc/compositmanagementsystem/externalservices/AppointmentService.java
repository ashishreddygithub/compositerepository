package com.htc.compositmanagementsystem.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.compositmanagementsystem.entity.Appointment;

@Service	
@FeignClient(url = "http://localhost:63122",name="appointmentmanagement")
public interface AppointmentService {
	@GetMapping("/recommendation/search/findBydoctorId")
	CollectionModel<Appointment> getRecommendationByProductId(@RequestParam("doctorId") Long doctorId);

}
