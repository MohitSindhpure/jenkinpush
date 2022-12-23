package com.Ishait.UserRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ishait.UserRegistration.Model.Userregister;
import com.Ishait.UserRegistration.Repository.userRepo;
import com.Ishait.UserRegistration.Service.userService;

@Controller
public class userregistration {
	
	@Autowired
	private userService userService;
	
	@GetMapping("/Register")
	public String register()
	{
		return "Registration";
	}
	
	@PostMapping("/Saveuser")
	public String saveuser(Userregister userinfo,Model model)
	{
		System.out.println(userinfo);
		model.addAttribute("USER",userinfo);
		Userregister savedata = userService.savedata(userinfo);
		if(savedata!=null) {
			return"Sucesspage";
		}
		return "failpage";
	}
	
	@GetMapping("/loginform")
	public String loginuser()
	{
		return "loginuser";
	}
	
	@PostMapping("/savelogin")
	public String login(Userregister userinfo) {
		boolean logindata = userService.logindata(userinfo);
		if(logindata==true) {
			return "loginsuccess";
		}
		return "loginfail";
	}
	
	@GetMapping("/getdata")
	public String getdata(Model model)
	{
		List<Userregister> getalluser = userService.getalluser();
		model.addAttribute("DATA", getalluser);
		return"getdata";
	}
	
	@GetMapping("/getbyid/{id}")
	public String getbyid(@PathVariable int id,Model model)
	{
		Userregister findbyid = userService.Findbyid(id);
		model.addAttribute("USER", findbyid);
		return "Byid";
	}

}
