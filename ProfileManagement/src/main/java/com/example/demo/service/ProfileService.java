package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepo;

@Service
public class ProfileService {

	@Autowired
	ProfileRepo profileRepo;
	
	
	public List<Profile> getallProfiles(){
		return profileRepo.findAll();
	}
	
	public Optional<Profile>getByid(int id){
		return profileRepo.findById(id);
	}
	
	public void createProfile(Profile obj) {
		profileRepo.save(obj);
	}
	
	public void updateProfile(Profile obj1) {
		profileRepo.save(obj1);
	}
	
	
}
