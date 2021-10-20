package com.yesenia;

import com.yesenia.zookeepercore.Bat;

public class BatTest {
    public static void main( String args[] ){
    	Bat bat = new Bat(0);
    	bat.attackTowns();
    	bat.attackTowns();
    	bat.attackTowns();
    	
    	bat.eatHumans();
    	bat.eatHumans();
    	
    	bat.fly();
    	bat.fly();
    	
    	bat.displayEnergy();
    }
}
