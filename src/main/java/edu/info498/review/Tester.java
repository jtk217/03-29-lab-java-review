package edu.info498.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Husky husky = new Husky("Butts");
		husky.bark();

		husky.speak();

		GiftBox<Husky> gbh = new GiftBox<Husky>(husky);
		gbh.openGift();
	}
}