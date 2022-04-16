package com.codingdojo.abstractart;

public class Sculpture extends Art {

	private String material;

	/**
	 * @param title
	 * @param author
	 * @param description
	 * @param material
	 */
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		// The following code is copied from the platform for learning reference
		String result = "";
		result += "Title:       " + getTitle() + "\n";
		result += "Author:      " + getAuthor() + "\n";
		result += "Description: " + getDescription() + "\n";
		result += "Material:    " + material + "\n";
		System.out.println(result);
		
	}
	

}
