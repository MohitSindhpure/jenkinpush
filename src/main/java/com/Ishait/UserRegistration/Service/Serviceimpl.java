package com.Ishait.UserRegistration.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ishait.UserRegistration.Model.Userregister;

import com.Ishait.UserRegistration.Repository.userRepo;

@Service
public class Serviceimpl implements userService{

	@Autowired
	private userRepo userRepo;
	@Override
	public Userregister savedata(Userregister user) {
		Userregister save = userRepo.save(user);
		return save;
	}
	@Override
	public boolean logindata(Userregister user) {
		List<Userregister> findAll = userRepo.findAll();
		for(Userregister us1:findAll)
		{
			if(user.getUsername().equals(us1.getUsername())&& user.getPassword().equals(us1.getPassword()))
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Userregister> getalluser() {
		List<Userregister> findAll = userRepo.findAll();
		return findAll;
	}
	@Override
	public Userregister Findbyid(int id) {
		Userregister userregister = userRepo.findById(id).get();
		return userregister;
	}

	

}
