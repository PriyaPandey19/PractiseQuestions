import java.util.*;

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
    }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    
}








public static boolean checkAnagram(String s1,String s2){   //25 )to check if two strings are anagrams of each other
    if(s1.length() != s2.length()){
        return false;
    }
 
    int[] count= new int[26];
    for(int i=0;i<s1.length();i++){
     count[s1.charAt(i) - 'a']++;
     count[s2.charAt(i) - 'a']--;
    }
    for(int c: count){
        if( c!= 0){
            return false;
        }
    }
    return true;
}







public static void printPermutation(String str, String ans){   //24) find permutation
    if(str.length() == 0){
        System.out.println(ans +" ");
        return;
    }
    for(int i=0;i< str.length();i++){
     char curr = str.charAt(i);
     String ros = str.substring(0, i) + str.substring(i+1);

     printPermutation(ros, ans+curr);

    }
}





  public static void removeDuplicate(String str){   //23) remove duplicate 
    for(int i=0;i<str.length();i++){
     boolean flag = true;
     for(int j=0;j<i;j++){
    if(str.charAt(i)== str.charAt(j) && i!= j){
        flag = false;
        break;
    }
     }
     if(flag){
        System.out.print(str.charAt(i));
     }
  }
  }






    public static String compress(String str){              //31) to compress the string
        String newStr ="";

       for(int i=0;i<str.length();i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count >= 1){
            newStr += count.toString();
        }
           }
           return newStr;
    }






    public static String longestCommonPrefix(String[] str){      //27)longest common prefix
        if(str == null || str.length == 0)
          return "";

          //start with th first string
          String prefix = str[0];

          for(int i=1;i<str.length;i++){
            //reduce prefix until it match the current string
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty())
                return "";
            }
          }
          return prefix;
    }






public static int subStringSearch(String haystack, String needle){     //29) to check substring exists or not in haystack means in  main string
    if(needle.length() == 0){
        return 0;
    }
        int hlength = haystack.length();
        int nlength = needle.length();    
    for(int i=0;i<=hlength-nlength;i++){
    int j;
    for(j=0;j<nlength;j++){
        if(haystack.charAt(i+j) != needle.charAt(j)){
            break;
        }
    } 
    if(j == nlength){
        return i;
    }   
    }
    return -1;
}






public static int stringToInt(String str){    //28) string number to integer number
    int result =0;
    int i =0;
    boolean isNegative = false;

    if(str.charAt(0) == '-'){
        isNegative = true;
        i++;
    }
    else if(str.charAt(0) == '+'){
        i++;
    }

    while (i<str.length()) {
      char c = str.charAt(i);
      
      result = result * 10 +(c-'0');
      i++;
    }
    return isNegative? -result : result;
}







public static boolean checkPalindrome(String str, int left, int right){
    while(left < right){
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}












public static boolean validPalindrome(String str){         //30) valid palindrome after removing at most one element
    int left =0,right = str.length()-1;
    while (left<right) {
     if(str.charAt(left) != str.charAt(right)){
        return checkPalindrome(str, left+1, right) || checkPalindrome(str, left, right-1);
     } 
     left++;
     right--;  
    }
    return true;
}












public static boolean isSubsequence(String str1, String str2){   //35) check if one string is a subsequence of another
    int i =0; 
    int j=0;
    while (i< str1.length() && j< str2.length()) {
        if(str1.charAt(i) == str2.charAt(j)){
            i++;
        }
        j++;
    }
    return i == str1.length();
}








public static boolean isSubstring(String combined, String s2){
    int n = combined.length();
    int m = s2.length();

    for(int i=0;i<= n-m ;i++){
        int j=0;
        while (j<m && combined.charAt(i+j) == s2.charAt(j)) {
          j++;  
        }
        if(j == m){
            return true;
        }
    }
    return false;
}

public static boolean  IsrotationOrNot(String s1, String s2){     //34) Check if a string is a rotation of another string
 if(s1.length() != s2.length() || s1.length() ==0){
    return false;
 }
 String combined = s1+ s1;
 return isSubstring(combined, s2);
}








public static String sortString(String str){     //group anagrams
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}
public static List<List<String>> grounpAnagrams(String[] s){    // 33 group anagram together 
   List<List<String>> result = new ArrayList<>();
   List<String> keys = new ArrayList<>();

   for(String str : s){
    String sorted = sortString(str);

    boolean found = false;

    for(int i=0;i<keys.size();i++){
        if(keys.get(i).equals(sorted)){
            result.get(i).add(str);
            found = true;
            break;
        }
    }
    if(!found){
        List<String> newGroup = new ArrayList<>();
        newGroup.add(str);
        result.add(newGroup);
        keys.add(sorted);
    }
   }
   return result;
}



public static void reverseWholeString(String str){  
    str = str.trim();                                            //reverse the whole string in line
    int end = str.length();    //end of string
     String newStr = "";     //new string
 
 
    for(int i= str.length()-1;i>=0;i--){
     if(str.charAt(i) == ' '|| i == 0){
     int start =(i == 0)? i: i+1;   
     for(int j= start ;j< end;j++){    //adding elements to new String
         newStr += str.charAt(j);
     }
     if(i != 0){
         newStr +=' ';    //adding extra space
     }
    end = i;
    //skip the multiple spaces
    while( i> 0 && str.charAt(i-1) == ' '){
        i--;
    }
     }
    }
    System.out.println(newStr);
 }









    


 public static void main(String args[]){
   

  String str = "my name is";
    System.out.println("Original String: " + str);
    System.out.print("Reversed String: ");
    reverseWholeString(str);
    // String s1 = "abca";
    // String s2 = "cdab";
    // System.out.println("String 1 is : abca");
    // System.out.println("String 2 is : cdab");
    // if(IsrotationOrNot(s1, s2)){
    //     System.out.println(s2 + " is a rotation of " + s1);
    // }
    // else{
    //    System.out.println(s2 + " is not  a rotation of " + s1);  
   // }
    // String str1 = "car is running";
    // String str2 = "running";
    // System.out.println("String 1 is : car is running");
    // System.out.println("String 2 is : running");
    // System.out.println(isSubsequence(str2, str1));
    // String[] s = {"eat","tea","tan","ate","nat","bat"};
    // System.out.println(grounpAnagrams(s));
    // String str4 = "-123";
    // String str = "racecar";
    // System.out.println("string is :"+str);
    // System.out.println(checkPalindrome(str, 0, str.length()-1));
   // System.out.println(stringToInt(str4));
    // String[] str ={"flower","fly","flow"};
    // String str1 = "aaabbbbccvdd";
   
    // String str2 = "MyHello";
    //  System.out.println("string is :"+str2);
    // String str3 ="Hello";
    // System.out.println("substring is :"+str3);
    // System.out.println(subStringSearch(str2, str3));
  // System.out.println(compress(str1)    );
//    System.out.print("Array is :"); 
//   for(int i=0;i<str.length;i++){
//     System.out.print(str[i]+" ");
//   }
//   System.out.println();
//     System.out.println(longestCommonPrefix(str));
    // System.out.println("String is: madam ");
    // isPalindromeOrNot("madam");
    // System.out.println("String is : mam");
    // printPermutation("mam", "");
   // String str1 = "abca";
   // System.out.println(IsrotationOrNot("abcd", "bdca"));
    // String str2 = "+123";
    // System.out.println(isSubsequence("priya", "priyanshi"));
    // System.out.println(stringToInt(str2));
    // System.out.println(validPalindrome(str1));
    //String str[] ={"interview","internet","internal"};
   //System.out.println(subStringSearch(str1, str2));  
   

//isPalindromeOrNot(str1);
  //System.out.println(compress(str2));
   //System.out.println(checkAnagram(str1, str2));
   
 
  
 }    
}
