package com.Ishait.UserRegistration.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ishait.UserRegistration.Model.Userregister;


public interface userRepo extends JpaRepository<Userregister, Serializable> {

}
