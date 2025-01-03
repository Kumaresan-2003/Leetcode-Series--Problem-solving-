public class CountWords {
   public static void main(String[] args) {
      // METHOD 1
      static void Method1(){
      String msg = "Tutorials Point Welcomes You!!";
      System.out.println("The given String is: " + msg);
      // initial count of the words
      int total = 1;
      // for loop to count the number of words
      for (int i = 0; i < msg.length(); i++) {
         // checking if current character is space or not
         if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
            total++; // incrementing the word count 
         }
      }
      // printing the result
      System.out.println("Number of words in the given string: " +  total);
      }

      // MEthod 2
      Static void Method2(){
    String msg = "Tutorials Point Welcomes You!! ";
      System.out.println("The given String is: " + msg);
      // To Split the string into words
      String[] arrayStr = msg.split("\\s+");
      // To Count the number of words
      int totalWord = arrayStr.length;
      // printing the result
      System.out.println("Number of words in the given string: " + totalWord);
      }
     
   }
}