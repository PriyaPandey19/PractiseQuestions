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
  int n = arr1.length+ arr2.length;
  int temp[] = new int[n]; int index =0;
  for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
    if(arr1[i] == arr2[j]){
      temp[index++] = arr1[i];
    }
    } 
  }
  for(int i=0;i<temp.length;i++){
    System.out.println(temp[i]);
  }
}


       

        
    

    public static void main(String[] args) {
        int arr1[] ={2,3,4,6,1};
        int arr2[] = {6,2,3,4,5};
        unionIntersectionArray(arr1, arr2);
        
        //maxMin(arr, 2);     //1249
        //findMinMax(arr);
        //reversInPlace(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
