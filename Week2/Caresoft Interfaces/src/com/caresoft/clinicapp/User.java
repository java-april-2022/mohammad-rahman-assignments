package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
	
    public User(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
    
    
    
    
}
