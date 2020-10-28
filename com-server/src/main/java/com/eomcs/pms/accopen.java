package com.eomcs.pms;

import java.util.Arrays;

public class accopen {
	public static void main(String args[]) throws Exception{
		  int[] array = new int[14];
	       for (int i = 1; i < 14 ; i++) {
	    	   array[i] = (int)((Math.random()*100)/10);;
	    	   Thread.sleep(100);
	       }
	       System.out.println(Arrays.toString(array));
	       System.out.printf("%s%s%s-%s%s%s%s%s%s-%s%s%s%s",
	    		   array[0],
	    		   	array[1],
	    			array[2],
	    			array[3],
	    			array[4],
	    			array[5],
	    			array[6],
	    			array[7],
	    			array[8],
	    		   array[9],
	    			array[10],
	    			array[11],
	    			array[12]);
	       
	       //	       System.out.println(array);
//		for (int b = 0;b <1000; b++) {
//		
//		b=(int)((Math.random()*100)/10);
//		System.out.println(b);
//	}
	}
}
