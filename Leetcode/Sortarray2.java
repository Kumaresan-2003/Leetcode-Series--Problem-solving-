import java.util.*;

public class Main {
static void ans(int [] arr){
  int i=0;
  int j=arr.length-1;
  while(i<j){
    if(arr[i]%2 > arr[j]%2){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    if(arr[i]%2==0){
      i++;
    }
    if(arr[j]%2==1){
      j--;
    }
    for(int k:arr){
      System.out.print(k+" ");
    }
  }
}
  
  
    public static void main(String[] args) {
     int [] nums={3,1,2,4};
     ans(nums);
     }
}
