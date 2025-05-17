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



    
    public static void SortArray(int arr[]){           // 0s 1s 2s in array
    int size = arr.length;
    Arrays.sort(arr);

    for(int i=0;i<size;i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
}

 
public static void NegativeArrays(int arr[]){        //5) rearrange the array the negative and positive elements in array
     for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
           if(arr[i] > arr[j]){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
       }
     }                                      
    int [] temp = new int[arr.length];
    int index =0;
    
    for(int i=0;i<arr.length;i++){ //negatives
        if(arr[i] < 0){
            temp[index++] = arr[i];
        }
    }

    for(int i=0;i<arr.length;i++){//positive
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






    public static void PairSum(int arr[], int target){      //13) find pair sum in sorted array
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





    


    public static int trappedRainWater(int height[]){   //18)trapped rain water problem
  int n= height.length;

  //calculate left max boundary
  int leftmax[] = new int[n];
  leftmax[0] = height[0];
  for(int i=1;i<n;i++){
    leftmax[i] = Math.max(height[i],leftmax[i-1]);
  }

  //calculate right max
  int rightmax[] = new int[n];
  rightmax[n-1] = height[n-1];
  for(int i=n-2;i>=0;i--){
    rightmax[i] = Math.max(height[i],rightmax[i+1]);
  }
  int trappedwater =0;
  for(int i=0;i<n;i++){
    int waterLevel = Math.min(leftmax[i],rightmax[i]);
    //trapped water = wterLevel - height[i]
    trappedwater += waterLevel - height[i];
  }
  return trappedwater;
}



public static void Occurence(int numbers[]) {               //12) to find occurance of element
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            boolean counted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    counted = true;
                    break;
                }
            }
            if (counted)
                continue;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            System.out.println(numbers[i] + " ocuured " + count + " times ");
        }
    }


   public static void duplicate(int arr[]){                       // 16) to find duplicate element in array
    for(int i=0;i<arr.length;i++){
        for(int j=arr.length -1;j>i;j--){
            if(arr[i] == arr[j]){
                System.out.println("duplicate element is: " + arr[i]);
                break;
            }
        }
    }
   }







  
   public static int findMissing(int arr[]){         //15)find missing number in sorted array
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++){
        if(arr[i+1] != arr[i]+ 1){
            return arr[i]+1;
        }
     }
   for(int i=0;i<arr.length;i++){
        if(arr[i+1] != arr[i]+ 1){
            return arr[i]+1;
        }
     }
   
   return -1;
   }










   public static void alternatePositiveNegative(int arr[]){      // 11) rearrange the array in alternate positive and negative
    int n = arr.length;
    int temp[] = new int[n];
    int positionIdx = 0, negativeIdx = 1;

    for(int i=0;i< n;i++){
        if(arr[i] >= 0){
            if(positionIdx < n){
                temp[positionIdx] = arr[i];
                positionIdx += 2;
            }
        }
            else{
                if(negativeIdx < n){
                temp[negativeIdx] = arr[i];
                negativeIdx += 2;
                }
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }  
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();    
   }


   public static boolean isSortedAndRotated(int arr[]){          //  9) check if the array is sorted and rotated
    int n = arr.length;
    int count =0;

    for(int i=0;i<n;i++){
        if(arr[i] > arr[(i+1) % n]){
            count++;
        }
    }
    return count == 1;

   }


   public static void targetSubarraySum(int numbers[],int target){    //14) find target subarray sum
               
       // int ms = Integer.MIN_VALUE;
        int cs =0;
        int start =0;

        for(int i=0;i<numbers.length;i++){
            cs += numbers[i];
           
            while(cs > target && start <= i){
               cs -= numbers[start];
               start++;
            }

            if(cs == target){
                System.out.println("target subarray sum is: "+ target+" found between "+start+" and "+ i);
                return;
            }
        }    
    }

   
       public static void leaderarray(int arr[]){       //10) find leader in array
            for(int i=0;i<arr.length-1;i++){
                int curr = arr[i];
                boolean isLeader = true;
                for(int j=i+1;j<arr.length;j++){
                    if(curr < arr[j]){
                        isLeader = false;
                        break;
                    }
                }
                if(isLeader){
                    System.out.println(curr + " is a leader");
                }
            }
       }


 public static void unionIntersectionArray(int arr1[], int arr2[]){                    //6 ) union and intersection of array
   System.out.println("union of elelments ");
        for(int i=0;i<arr1.length;i++){
            for(int j= 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }  
        }
    System.out.println("intersection elelments ");
      for(int i=0;i<arr2.length;i++){
        boolean found = false;
        for(int j=0;j<arr1.length;j++){
            if(arr1[j] == arr2[i]){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(arr2[i]);
        }
      }    
        

        }

       

   
    public static void main(String args[]){
     int arr1[] ={1,2,3,4,6};
        int target = 10;
     int arr2[] ={1,2,3,4,5};



    //  for(int i=0;i<arr1.length;i++){
    //   System.out.print(arr2[i]+" ");
    //  }
    //   System.out.println();
    // //  System.out.println("missing element is "+findMissing(arr1));

  unionIntersectionArray(arr1, arr2); 
    
}
}