import java.util.Arrays;

public class PractiseSheetString {


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


public static boolean checkAnagram(String s1,String s2){   //25 )to check if two strings are anagrams of each other
    if(s1.length() != s2.length()){
        return false;
    }
    char ch1[] = s1.toCharArray();
    Arrays.sort(ch1);

    char ch2[] = s2.toCharArray();
    Arrays.sort(ch2);

    return Arrays.equals(ch1, ch2);
}




public static void printPermutation(String str, String ans){
    if(str.length() == 0){
        System.out.println(ans +" ");
        return;
    }
    for(int i=0;i< str.length();i++){
     char curr = str.charAt(i);
     String ros = str.substring(0, i) + str.substring(i+1);

     printPermutation(ros, ans);

    }
}




 public static void main(String args[]){
    String str1 = "aab";
    String str2 = "listen";
   //System.out.println(checkAnagram(str1, str2));
  printPermutation(str1, "");
  
 }    
}
