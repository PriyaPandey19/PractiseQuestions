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

 public static void diagonal(int matrix[][]){               //diagonal sum
        int sum =0;
         System.out.println("diagonl elements are ");
        for(int i =0;i<matrix.length;i++){      //0(n^2) approach 1
            for(int j =0;j<matrix[0].length;j++){
                if( i ==j|| i+j == matrix.length-1){   
                 System.out.print(matrix[i][j]+" ");
                }
                // else{
                //     System.out.println(" ");
                // } 
                }
                System.out.println();
            }
        }
    
        

    public static void main(String[] args) {
        int mat[][] ={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
    //  int ans[][]=Transpose(3, 3, mat); 
    //  for(int i=0;i<ans.length;i++){
    //     for(int j=0;j<ans[0].length;j++){
    //         System.out.print(ans[i][j] + " ");
    //     }
    //     System.out.println();
    //  }

     diagonal(mat);
    }
}
