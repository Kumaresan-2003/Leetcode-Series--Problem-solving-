package com.handson;

import java.util.*;

public class Intersection {
     public static void main(String[] args) {
    	 int [] nums1= {1,2,2,1};
    	 int [] nums2= {2,2};
    	 Set<Integer> st=new HashSet<>();
    	 List<Integer> ls=new ArrayList<>();
    	 
    	 for(int i=0;i<nums1.length;i++) {
    		 st.add(nums1[i]);
    	 }
    	 
    	 for(int a:nums2) {
    		 if(st.contains(a)) {
    			 ls.add(a);
    			 st.remove(a);
    		 }
    	 }
    	 
     }
}
