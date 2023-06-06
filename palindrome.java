//5. Palindrome Check

public class palindrome {
    public static void main(String[] args) {
        String original = "racecar"; 
        String reversed = "";

    //Process
    // implement for loop to get letters start from the last in original string
    // and add it to reversed string
    for (int i = original.length() - 1; i >= 0; i--) {
        reversed += original.charAt(i);
      }
  
      boolean isPalindrome = true;
  
      // implement for loop to check if the letters of original and reversed are not the same
      for (int i = 0; i < original.length(); i++) {
        if (original.charAt(i) != reversed.charAt(i)) { //condition using if
          isPalindrome = false;
        }
      }
  
      // prints the ouput whether the original string is a palindrome or not
      System.out.println("---------------------------------------------");
      System.out.println("Palindrome Checker");
      System.out.println("---------------------------------------------");
      System.out.println("Word: racecar");
      System.out.println("---------------------------------------------");
      if (isPalindrome) {
        System.out.println("The word " + '"' + original + '"' + " is a palindrome!");
      } else {
        System.out.println("The word " + '"' + original + '"' + " is not a palindrome!");
      }
      System.out.println("---------------------------------------------");
    }
}
