package com.htc.compositmanagementsystem.aggregrateservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.compositmanagementsystem.entity.AggregateClass;

@RequestMapping("/api")
public interface AggregrateService {

	@GetMapping(value="/doctor-agg/{doctorId}",produces="application/json")
 AggregateClass getDoctorById(@PathVariable Long doctorId);
}
