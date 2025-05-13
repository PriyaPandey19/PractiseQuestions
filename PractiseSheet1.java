import java.util.*;

public class PractiseSheet1{

    public static void getLargest(int numbers[]){    //1) get max and min  value
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            else{
                smallest = numbers[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }











    public static void reveseArray(int arr[]){    //2)   reverse array at their position
        int first =0,last = arr.length-1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }  
    }



    
    public static void SortArray(int arr[]){           //3) 0s 1s 2s in array
    int size = arr.length;
    Arrays.sort(arr);

    for(int i=0;i<size;i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
}

 
public static void NegativeArrays(int arr[]){   
    Arrays.sort(arr);                                       //4) move all the negative numbers to starting
    int [] temp = new int[arr.length];
    int index =0;
    
    for(int i=0;i<arr.length;i++){ //negatives
        if(arr[i] < 0){
            temp[index++] = arr[i];
        }
    }

    for(int i=0;i<arr.length;i++){
      if(arr[i] >= 0){
        temp[index++] = arr[i];
      }
    }

    for(int i=0;i<arr.length;i++){
        arr[i] = temp[i];
    }  
}





 public static void kadanes(int numbers[]){         // 8)kadane's algorithm to find max subarray sum
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs =0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum  is: "+ ms);
    }






    public static void SubArrayMul(int numbers[]){     //20) max subarray product only for positive     
        int ms = Integer.MIN_VALUE;
        int cs =1;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]> 0){
                cs = cs * numbers[i];
                 ms = Math.max(cs,ms);
            }
            else{
                cs =1;
            }
        }
        System.out.println("our max subarray is: "+ ms);
    }


    public static int SortedArrayIntersection(int arr1[], int arr2[]) {   //17) to find intesection of two sorted array
       ArrayList<Integer> ar = new ArrayList<Integer>();
      //adding
      int i=0;
      while (i<= arr1.length-1) {
        ar.add(arr1[i]);
        i++;
      }
      //checking
      int j =0;
      while(j <= arr2.length-1){
        if(ar.contains(arr2[j])){
            return arr2[j];
        }
        j++;
      }
      return -1;
    }






    public static void PairSum(int arr[], int target){      // find pair sum in sorted array
    int left =0;
    int right = arr.length-1;
    
    while(left < right){
        int sum = arr[left] + arr[right];
        if(sum == target){
            System.out.println("Pair found: " +"("+ arr[left] + "," + arr[right]+")");
            return;
        }
        else if(sum < target){
            left++;
        }
        else{
            right--;
        }
    }
   
    }
    public static void main(String args[]){
     int arr1[] ={1,2,3,4,7,8,9};
        int target = 10;
     int arr2[] ={1,2,3,4,5};
     
    PairSum(arr1,target);
    }
}