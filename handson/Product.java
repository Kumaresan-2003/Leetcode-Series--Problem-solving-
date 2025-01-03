package com.handson;

public class Product {
	    public static int[] productExceptSelf(int[] nums) {
	        int mup=1;
	        for(int a:nums){
	            mup*=a;
	        }
	        int [] temp=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0){
	                temp[i]=mup;
	            }
	            else{
	            int a=(int)(mup/nums[i]);
	            temp[i]=a;
	            }
	        }
	        return temp;
	    }
	    public static void in(String[] args) {
	    	int nums[]= {1,2,3,4};
	    	int [] res=productExceptSelf(nums);
	    	for(int a:res) {
	    		System.out.print(a+" ");
	    	}
	    	
	    }
	
}
