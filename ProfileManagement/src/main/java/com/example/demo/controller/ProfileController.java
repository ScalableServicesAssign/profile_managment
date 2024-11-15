package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profile;
import com.example.demo.service.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	@GetMapping("/all")
	public List<Profile> getallProfiles(){
		return profileService.getallProfiles();
	}
	
	@GetMapping("/id/{id}")
	public Optional<Profile>getByid(@PathVariable int id){
		return profileService.getByid(id);
	}
	
	@PostMapping("/create")
	public void createProfile(@RequestBody Profile obj) {
		profileService.createProfile(obj);
	}
	
	@PutMapping("/update")
	public void updateProfile(@RequestBody Profile obj1) {
		profileService.updateProfile(obj1);
	}
}
