import java.util.Arrays;

public class Test {
    public static void  findMinMax(int arr[]){
         int smallest = Integer.MAX_VALUE;
         int largest = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
          if(smallest > arr[i]){
             smallest = arr[i];
          } 
         }
         for(int i=0;i<arr.length;i++){
          if(largest < arr[i]){
             largest = arr[i];
          } 
         }

         System.out.println(smallest);
         System.out.println(largest);     
    }

    public static void reversInPlace(int arr[]){
        int first =0,last = arr.length-1;

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
             first++;
             last--;
        }
       

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void maxMin(int arr[],int k){
        Arrays.sort(arr);
    int kthSmallest = arr[k-1];
    int kthLargest = arr[arr.length -k];

    System.out.println(kthLargest);
    System.out.println(kthSmallest);

       }


public static void dutchNational(int arr[]){
 int low =0,mid =0,high = arr.length-1;
 while (mid< high) {
    if(arr[mid]== 0){
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        low++;
        mid++;
    }
    else if(arr[mid] == 1){
        mid++;
    }
    else{
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp; 
        high--; 
    }
 }
 for(int i=0;i<arr.length;i++)
 System.out.println(arr[i]);
}


public static void positiveNegative(int arr[]){
    for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
        if(arr[i] > arr[j]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       }
    }
    }
    int[] temp = new int[arr.length];
    int index =0;
    for(int i=0;i<arr.length;i++){
    if(arr[i] < 0){
        temp[index++] = arr[i];
    }
    }

    for(int i=0;i<arr.length;i++){
    if(arr[i] >= 0){
        temp[index++] = arr[i];
    }
    }
    for(int i=0;i<temp.length;i++){
        System.out.println(temp[i]);
    }  
}




public static void unionIntersectionArray(int arr1[],int arr2[]){
   for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
        if(arr1[i] == arr2[j]){
            System.out.println(arr1[i]);
        }
    }
}

int max = 0;
    for (int val : arr1) max = Math.max(max, val);
    for (int val : arr2) max = Math.max(max, val);

    boolean[] found = new boolean[max + 1];
  System.out.println("union");  
for(int i=0;i<arr1.length;i++){
   if(!found[arr1[i]]){
    System.out.println(arr1[i]);
    found[arr1[i]] = true;
   }
    for(int j=0;j<arr2.length;j++){
   if(!found[arr2[j]]){
     System.out.println(arr2[j]);
    found[arr2[j]] = true;
   }
}
}

}

public static void cyclicRotateByOne(int arr[]){
    int n = arr.length;
    int last = arr[n-1];
    for(int i=n-1;i>0;i--){
        arr[i] = arr[i-1];
    }
    arr[0] = last;
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void kadaneAlgorithm(int arr[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0;i<arr.length;i++){
        cs += arr[i];
        if(cs < 0){
            cs =0;
        }
        ms = Math.max(cs, ms);
        

    }
    System.out.println("Maximum Subarray Sum: " + ms);
}

public static void leadersInArray(int arr[]){
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
            System.out.println(curr);
        }

    }
   
}





        
    

    public static void main(String[] args) {
        int arr1[] ={5,1,2,3,4};
       leadersInArray(arr1);
        //unionIntersectionArray(arr1, arr2);
        
        //maxMin(arr, 2);     //1249
        //findMinMax(arr);
        //reversInPlace(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
