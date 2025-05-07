public class PractiseSheet1{

    public static void getLargest(int numbers[]){    //get largest and smallest value
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

    public static void reveseArray(int arr[]){    //reverse array
        int first =0,last = arr.length-1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        
    }

    public static void main(String args[]){
     int numbers[] ={1,2,3,4,5};
     reveseArray(numbers);
     for(int i=0;i<numbers.length;i++){
      System.out.println(numbers[i]);
     }
  
    }
}