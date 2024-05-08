package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class

public class Types {

	@Id
    @GeneratedValue(strategy 
                    = GenerationType.AUTO) 
    int typeid;
	
  private String type;

  private String classifiedname;

	
	  public Integer getId() { return typeid; }
	  
	  public void setId(Integer id) { this.typeid = id; }
	 

  public String getName() {
    return type;
  }

  public void setName(String username) {
    this.type = username;
  }

  public String getEmail() {
    return classifiedname;
  }

  public void setEmail(String useremail) {
    this.classifiedname = useremail;
  }
}