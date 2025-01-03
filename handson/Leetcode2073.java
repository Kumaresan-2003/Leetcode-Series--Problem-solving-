package com.handson;

public class Leetcode2073 {
	    public int timeRequiredToBuy(int[] ti, int k) {
	        int n=ti.length;
	        int t=0;
	        while(true){
	        for(int i=0;i<n;i++){
	            if(ti[i]>0){
	                ti[i]=ti[i]-1;
	                t++;
	            }
	            if(i==k && ti[i]==0){
	                return t;
	            }
	        }
	        }
	    }
}
