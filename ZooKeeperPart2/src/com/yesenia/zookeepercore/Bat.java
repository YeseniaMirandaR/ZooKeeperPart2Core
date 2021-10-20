package com.yesenia.zookeepercore;

public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(300);
	}
	public void attackTowns() {
		System.out.println("Ahhhhhhhh!!!");
		energyLevel -= 100;
	}
	public void eatHumans() {
		System.out.println("No kidding... just eating...");
		energyLevel += 25;
	}
	public void fly() {
		System.out.println("I believe I can fly.");
		energyLevel -= 50;
	}
}
