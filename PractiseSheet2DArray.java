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


public static void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;

        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }






 public static void diagonal(int matrix[][]) { // 42) diagonal sum
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



 static void dfs(int i, int j, char grid[][],int n,int m){     //47) number of islands
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



    
     public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;  // start from top-right

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--; // move left
            }  else {
                i++; // move down
            }
        }

        return false; // not found
    }


    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Initialize result matrix
        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    
     public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }




   




    
        

    public static void main(String[] args) {
       
 
        int[][]mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int [][] mat2 ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = multiplyMatrices(mat, mat2);
        System.out.println("Matrix Multiplication Result:");
        printMatrix(result);
        
       // System.out.println(searchMatrix(mat, 8));
        // System.out.println("original matrix is:");
        // for (int i = 0; i < mat.length; i++) {
        //     System.out.println(Arrays.toString(mat[i]));
        // }

       
        // rotate90Clockwise(mat);
        // System.out.println("Matrix after 90 degree rotation:");
        // for (int i = 0; i < mat.length; i++) {
        //     System.out.println(Arrays.toString(mat[i]));
        // }
    


       
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
