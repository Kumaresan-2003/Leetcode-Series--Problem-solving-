import java.util.*;

public class MergerSorted {
    static class Node{
      int data;
      Node next;
    }
    static Node newNode(int key){
      Node temp=new Node();
      temp.data=key;
      temp.next=null;
      return temp;
    }
    // to print the linkedList
    static void PrintList(Node node){
      while(node!=null){
        System.out.print(node.data+" ");
        node=node.next;
      }
    }
    // to merge linked PrintList
    static Node merge(Node h1,Node h2){
      if(h1==null){
        return h2;
      }
      if(h2==null){
        return h1;
      }
      if(h1.data <h2.data){
        h1.next=merge(h1.next,h2);
        return h1;
      }
      else{
        h2.next=merge(h1,h2.next);
        return h2;
      }
    }
    public static void main(String[] args) {
     Node head1=newNode(1);
     head1.next=newNode(2);
     head1.next.next=newNode(5);
     
     
     // 2 Linkedlist
     Node head2=newNode(0);
     head2.next=newNode(2);
     head2.next.next=newNode(4);
     
     Node mergehead=merge(head1,head2);
     PrintList(mergehead);
     
  }
}

