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
 
    char ch1[] = s1.toCharArray();
    Arrays.sort(ch1);

    char ch2[] = s2.toCharArray();
    Arrays.sort(ch2);

    return Arrays.equals(ch1, ch2);
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




    


 public static void main(String args[]){
   // String str1 = "abca";
    System.out.println(IsrotationOrNot("abcd", "bdca"));
    // String str2 = "+123";
    // System.out.println(isSubsequence("priya", "priyanshi"));
    // System.out.println(stringToInt(str2));
    // System.out.println(validPalindrome(str1));
    //String str[] ={"interview","internet","internal"};
   //System.out.println(subStringSearch(str1, str2));  
   //System.out.println(longestCommonPrefix(str));

//isPalindromeOrNot(str1);
  //System.out.println(compress(str2));
   //System.out.println(checkAnagram(str1, str2));
   
 
  
 }    
}
