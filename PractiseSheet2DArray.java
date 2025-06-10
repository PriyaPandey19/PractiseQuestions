import java.util.Arrays;

public class PractiseSheet2DArray {
    


    public static int[][] Transpose(int m,int n,int matrix[][]){    // 36)Transpose of matrix
    int ans[][] = new int[n][m];

    for(int i=0;i<n;i++){
        for(int j =0;j<m;j++){
            ans[i][j] = matrix[j][i];
        }
    }
    return ans;
}






 public static void diagonal(int matrix[][]) { // diagonal sum
    int sum = 0;
    System.out.print("Diagonal elements are: ");
    for (int i = 0; i < matrix.length; i++) {
      
        System.out.print(matrix[i][i] + " ");
        sum += matrix[i][i];
       
        if (i != matrix.length - 1 - i) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
            sum += matrix[i][matrix.length - 1 - i];
        }
    }
    System.out.println();
    System.out.println("Sum of diagonal elements: " + sum);
}



 static void dfs(int i, int j, char grid[][],int n,int m){
        if(i<0 || j<0 || i == n|| j == m|| grid[i][j] == '0'){
            return;
        }
        grid[i][j] ='0';
        dfs(i+1,j,grid,n,m);
        dfs(i-1,j,grid,n,m);
        dfs(i,j+1,grid,n,m);
        dfs(i,j-1,grid,n,m);
    }
    public static int numIslands(char[][] grid) {
     int count=0;
     int n = grid.length;
     int m = grid[0].length;

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j] == '1'){
                count++;
                dfs(i,j,grid,n,m);
            }
        }
     } 
     return count;  
    }



    
        

    public static void main(String[] args) {
       
 

        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

       
        System.out.println("Number of islands: " + numIslands(grid));
    


       
        // int[][] transposed = Transpose(m, n, mat);
        // System.out.println("\nTransposed Matrix:");
        // for (int i = 0; i < transposed.length; i++) {
        //     System.out.println(Arrays.toString(transposed[i]));
        // }
    //  int ans[][]=Transpose(3, 3, mat); 
    //  for(int i=0;i<ans.length;i++){
    //     for(int j=0;j<ans[0].length;j++){
    //         System.out.print(ans[i][j] + " ");
    //     }
    //     System.out.println();
    //  }

     
    }
}
