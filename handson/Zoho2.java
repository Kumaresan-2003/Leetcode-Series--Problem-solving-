package com.handson;

import java.util.*;

import java.util.Scanner;

class RightAlignSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the screen length: ");
        int screenLength = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        int spacesToAdd = screenLength - sentence.length();
        int spaces = countSpaces(sentence);

        if (spaces == 0) {
            System.out.println(sentence + repeat("*", spacesToAdd)); 
        } else {
            int spacesPerSpace = spacesToAdd / spaces;
            int extraSpaces = spacesToAdd % spaces; 

            String modifiedSentence = "";
            for (int i = 0; i < sentence.length(); i++) {
                modifiedSentence += sentence.charAt(i);
                if (sentence.charAt(i) == ' ') {
                    modifiedSentence += repeat("*", spacesPerSpace);
                    if (extraSpaces > 0) {
                        modifiedSentence += "*";
                        extraSpaces--;
                    }
                }
            }
            System.out.println(modifiedSentence);
        }

        sc.close();
    }

    private static int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }

    private static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
public class Zoho2 {

  static int spaceCountHandler(String sentence) {
      int spaceCount = 0;
      for(int i = 0; i < sentence.length();i++ ) {
          if(sentence.charAt(i) == ' ') 
              spaceCount++;
      }
      return spaceCount;
  }
  
  static String addSpaceHandler(String sentence, int addSpaceValue, int remainingCount, int spaceCount) {
      
	  int sentenceLen = sentence.length();
      String temp = "";
      
      int spaceVal = addSpaceValue;
      int flag = spaceCount;
      
      for(int i = 0; i < sentenceLen;i++) {
      //  System.out.println(flag)
          if(sentence.charAt(i)!=' ')
              temp += sentence.charAt(i)+"";
          
          else if(sentence.charAt(i) == ' ') {
              if(remainingCount%spaceCount != 0 && flag == spaceCount) {
                  spaceVal++;
              } else spaceVal = addSpaceValue;
              
              for(int j = 0;j <= spaceVal; j++) {
                  temp  = temp + "*";
              }
              flag--;
          }
      }
      return temp;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String sentence = "Today is wednesda";
      int screenLength = 20;
      // System.out.println(sentence + " " + screenLength);
      int spaceCount = spaceCountHandler(sentence);
      System.out.println(spaceCount);
      int remainingCount = screenLength - sentence.length();
      System.out.println(remainingCount);

      int addSpaceValue = (remainingCount)/ spaceCount;
      System.out.println(addSpaceValue);
      String newString = addSpaceHandler(sentence, addSpaceValue,remainingCount, spaceCount);
      System.out.println(newString);
      sc.close();
  }
}

//INPUT:
//Screen length = 20
//Sentence = Today is wednesda

//OUTPUT:
//Today***is**wednesda

//EXPLAINATION:
/*  first we need to find the number of space in the sentence.
  remaining screen length should be find by subtracting the screenLength - sentence.length()
  find the how many space need to add by (remainingScreenLength)/ spaceCount 
  when the addSpaceCount is odd the first space should add +1 than addSpaceValue and other place add normal.
*/