package com.Micro.VaccinationCenter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Micro.VaccinationCenter.Entity.VaccinationCenter;
import com.Micro.VaccinationCenter.Model.Citizen;
import com.Micro.VaccinationCenter.Model.RequiredResponse;
import com.Micro.VaccinationCenter.Repos.CenterRepo;



@RestController
@RequestMapping("/vaccine")
public class VaccinationCenterController {
	@Autowired
	private CenterRepo center;
	@Autowired
	private RestTemplate restTemp;
	
	
	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vc){
		VaccinationCenter serde=center.save(vc);
		return new ResponseEntity<VaccinationCenter>(serde,HttpStatus.CREATED);
	}
	
	@GetMapping(path="/id{id}")
	public ResponseEntity<RequiredResponse> getcenter(@PathVariable ("id")Integer id){
		RequiredResponse reqp = new RequiredResponse();
		VaccinationCenter vc=center.findById(id).get();
		reqp.setCenter(vc);
		
		java.util.List<Citizen> listofcitizen=(java.util.List<Citizen>)restTemp.getForObject("localhost:8091/map/id"+id, List.class);
		reqp.setCitizens(listofcitizen);
		return new ResponseEntity<RequiredResponse>(reqp,HttpStatus.OK);
		
	}

}
