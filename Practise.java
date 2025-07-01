 public class Practise{
 
 public static void findSubsets(String str, int i, String ans){     //find all possible subsets
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

         //yes choice
        findSubsets(str, i+1, ans+str.charAt(i));
        //no choice
        findSubsets(str, i+1, ans);
    }

    static int count =0;
    public static boolean isSafe(char board[][],int row,int col){   //helper function of n queen
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
              return false;
            }
        }

        //diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board[][],int row){   //n queen
        //base
        if(row == board.length){
            count++;
           // printBoard(board);
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] ='Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                nQueens(board, row+1);    //function call
                board[row][j] ='.';       //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("------------chess board-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }



     public static void changeArr(int arr[],int i,int val){    //travse the array and backtracking
        if(i == arr.length){
        printArr(arr);
         return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}




public static void countingSort(int arr[]){    //counting sort
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        largest = Math.max(largest,arr[i]);
    }

    int count[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }

    //sorting
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i] >0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
  }



  

  public static void modifiedbubbleSort(int arr[]){      // Optimized  bubble sort
    for(int turn =0;turn<arr.length-1;turn++){
       boolean swapped = false;
      for(int j =0;j<arr.length-1-turn;j++){

         if(arr[j] > arr[j+1]) {
           
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
             swapped = true;
         }
      }
      if(swapped == false){
        break;
      }
    }
  }





  public static void  quickSort(int arr[],int si,int ei){   //quick sort
      if(si >= ei){   //base case
        return;
      }
      int pidx = partition(arr, si,ei);
      quickSort(arr, si, pidx-1);   //left half
      quickSort(arr, pidx+1, ei);   //right half
    }

    public static int partition(int arr[],int si,int ei){
    int pivot = arr[ei];
    int i= si-1;   //to make place for els smaller than pivot

    for(int j=si;j<ei;j++){
        if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;                          //return index
    } 



    public static void main(String[] args) {
       int[] arr = {4, 2, 2, 8, 3, 3, 1};
    System.out.println("Original array:");
    printArr(arr);

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArr(arr);
}
 }
    

