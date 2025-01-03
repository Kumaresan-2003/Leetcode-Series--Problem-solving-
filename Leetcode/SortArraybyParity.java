import java.util.*;

public class Main {
static void ans(int [] arr){
  List<Integer> even =new ArrayList<>();
  List<Integer> odd =new ArrayList<>();
 
  int n=arr.length;
   int temp[]=new int[n];
  for(int i=0;i<n;i++){
    if(arr[i]%2==0){
      even.add(arr[i]);
    }
    else{
      odd.add(arr[i]);
    }
  }
  Collections.sort(even);
  //Collections.sort(odd);
  int i=0;
  while(i<even.size()){
    temp[i]=even.get(i);
    i++;
  }
  for(int o:odd){
    temp[i]=o;
    i++;
  }
  for(int j:temp){
    System.out.print(j+" ");
  }
}
  
  
    public static void main(String[] args) {
     int [] nums={3,1,2,4};
     ans(nums);
     }
}
