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
    public static void main(String[] args) {
      int n = 4; // You can change n for different board sizes
    char[][] board = new char[n][n];
    // Initialize board with '.'
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            board[i][j] = '.';
        }
    }
    count = 0; // Reset count before solving
    nQueens(board, 0);
    System.out.println("Total solutions: " + count);

     
}
 }
    

