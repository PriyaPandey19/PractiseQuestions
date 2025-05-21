public class PractiseSheet2DArray {


public static void reverseString(String str){   //21) reverse the string
    for(int i =str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
    System.out.println();
}



public static void isPalindromeOrNot(String str){     //22) is palindrome or not
    int n = str.length();
    boolean isPalindrome = true;

    for(int i=0;i<n/2;i++){
        if(str.charAt(i) != str.charAt(n-i-1)){
            isPalindrome = false;
            break;
        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
 public static void main(String args[]){
    String str = "mam";
   reverseString(str);
   isPalindromeOrNot(str);
  
  
 }    
}
