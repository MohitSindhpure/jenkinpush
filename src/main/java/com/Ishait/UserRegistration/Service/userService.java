package com.Ishait.UserRegistration.Service;

import java.util.List;

import com.Ishait.UserRegistration.Model.Userregister;




public interface userService {
	
	public Userregister savedata(Userregister user);
	
	public boolean logindata(Userregister user);
	
	public List<Userregister> getalluser();
	
	public Userregister Findbyid(int id);

}
