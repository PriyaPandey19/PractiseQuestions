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



    
        

    public static void main(String[] args) {
        int m =3,n =3;
        int mat[][] ={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
         System.out.println("original matrix");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        diagonal(mat);
       
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
