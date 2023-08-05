package _02_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	// Papa Smurf wears a red hat, all the others are white.
	public String getHatColor() {
		if (name.equals("Papa")) {
			return "Red";
		}
		return "White";
	}

	// Smurfette is the only female Smurf.
	public String isGirlOrBoy() {
		if (name.equalsIgnoreCase("Smurfette")) {
			return "Girl";
		}
		return "Boy";
	}

}


