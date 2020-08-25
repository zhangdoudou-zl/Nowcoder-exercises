public class Solution15 {
//一个只包含0和1的阵列，找到1的组的个数，每个组的定义是横向和纵向相邻的值都为1


    public static int method(int[][] matrix){
        int res = 0;
        if(matrix == null){
            return res;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    dfs(matrix,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    public static void dfs(int[][] matrix,int i,int j){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j]==0){
            return;
        }
        matrix[i][j]=0;
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j+1);
        dfs(matrix,i,j-1);
    }

    public static void main(String[] args) {
        int[][] array={{1,1,0,0,1},{1,0,0,1,0},{1,1,0,1,0},{0,0,1,0,0}};
        int method = method(array);
        System.out.println(method);

    }
}
