package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {

//... imports class definition...
    
    
	/***************************************************************************************************/
	// Inside class:
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();
    
    
    
    
    /***************************************************************************************************/
    // TO DO: Implement a constructor that takes an ID and a role
    /**
     * @param id
     * @param role
     */
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role;
    }
 
    
    
    
    
    /***************************************************************************************************/
    // TO DO: Implement HIPAACompliantUser!
    
    @Override
    public boolean assignPin(int pin) {
    	// TODO Auto-generated method stub
    	if(String.valueOf(pin).length() == 6) {
    		this.pin = pin;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	// TODO Auto-generated method stub
    	if(this.id == confirmedAuthID) {
    		return true;
    	}
    	else {
    		this.authIncident();
    		return false;    		
    	}
    }
    
    public void newIncident(String notes) {
    	String report = String.format(
    			"Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
    			new Date(), this.id, notes
    			);
    	securityIncidents.add(report);
    }
    public void authIncident() {
    	String report = String.format(
    			"Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
    			new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
    			);
    	securityIncidents.add(report);
    }


    

    
    /***************************************************************************************************/
    // TO DO: Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.securityIncidents;
	}




	/***************************************************************************************************/
	// TO DO: Setters & Getters

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}





	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}





	/**
	 * @return the securityIncidents
	 */
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}





	/**
	 * @param securityIncidents the securityIncidents to set
	 */
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    
    
    
    

	
	
	
	
	
}
