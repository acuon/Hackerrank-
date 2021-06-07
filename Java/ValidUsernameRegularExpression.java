//https://www.hackerrank.com/challenges/valid-username-checker/problem


import java.util.Scanner;
class UsernameValidator {
    
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
  //[a-zA-Z] --> first character
  //[\\w] --> remaing characters 
  //[\\w] --> non-word character --> underscore and numbers
  //^ --> start         $ --> end
  //password length should not be less than 8 and greater than 30
  
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
