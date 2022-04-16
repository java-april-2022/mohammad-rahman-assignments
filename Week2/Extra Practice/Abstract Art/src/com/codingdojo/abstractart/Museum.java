package com.codingdojo.abstractart;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The following code is copied from the platform for learning reference
		
		
		// Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		
		// Create 3 instances of Painting
		museum.add(new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));
		museum.add(new Painting("Red Canna", "Georgia O'Keefe", "red flowers in a vase", "watercolor on paper"));
		museum.add(new Painting("Der Kuss", "Gustav Klimpt", "a couple embrace", "oil and gold leaf on canvas"));
		
		
		// Create 2 instances of Scupture
		museum.add(new Sculpture("Winged Victory of Samothrace", "unknown", "depicts the goddess Nike", "marble"));
		museum.add(new Sculpture("David", "Michelangelo", "depicts biblical figure David", "marble"));
		
		
		// Ninja Bonus: use the viewArt() method of all of the artworks in the museum in a random order
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}

		
	}

}
