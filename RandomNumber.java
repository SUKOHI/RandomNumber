package com.sukohi.lib;

public class RandomNumber {

	public static int get(int min, int max) {   
  	  
    	return (int) Math.floor(Math.random()*(max-min+1))+min;
        
    }
	
}

/***Sample

	RandomNumber.getRandom(0, 100);

***/
