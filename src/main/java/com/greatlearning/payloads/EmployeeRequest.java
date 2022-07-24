package com.greatlearning.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeRequest {
	    @NotBlank
	    @NotNull
	    private String firstname;
	    @NotBlank
	    @NotNull
	    private String lastname;
	    @NotBlank
	    @NotNull
	   
	    private String email;
	    @NotBlank
	    @NotNull
	    

	    public String getFirstname() {
	        return firstname;
	    }
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public String getLastname() {
	        return lastname;
	    }
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	  
	    
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	   
	  

}
