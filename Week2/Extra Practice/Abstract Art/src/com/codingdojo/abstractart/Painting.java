package com.codingdojo.abstractart;

public class Painting extends Art {

	private String paintType;

	/**
	 * @param title
	 * @param author
	 * @param description
	 * @param paintType
	 */
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		// The following code is copied from the platform for learning reference
		String result = "";
		result += "Title:       " + getTitle() + "\n";
		result += "Author:      " + getAuthor() + "\n";
		result += "Description: " + getDescription() + "\n";
		result += "Paint Type:  " + paintType + "\n";
		System.out.println(result);
		
	}
	
	

}
