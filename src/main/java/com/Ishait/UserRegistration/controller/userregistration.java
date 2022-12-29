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
	
	@GetMapping("/update")
	public String update()
	{
		return "Successfullyupdate";
	}

	@PostMapping("/Updatuser")
	public String Updateuser(Userregister user,Model model )
	{
		Userregister updateuser = userService.Updateuser(user);
		if(updateuser!=null)
		return "Updatedsucces";
		else {
			return "fail";
		}
	}
	
	@GetMapping("/Delete/{id}")
	public String Deleteuser(@PathVariable int id)
	{
		boolean deleteuserbyid = userService.Deleteuserbyid(id);
		if(deleteuserbyid)
		return  "Succesfuldelete";
		else {
			return"Faildelete";
		}
	}
	
	@GetMapping("/Deleteall")
	public String Deleteall()
	{
		boolean deletealluser = userService.Deletealluser();
		if (deletealluser) {
			return "Succesfuldelete";
		}
		else {
			return"Faildelete";
		}
	}
}
