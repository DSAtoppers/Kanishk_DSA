package sept1121;

public class Code1572 {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        int i=0,j=0;

        while(i<n){
            sum+=mat[i][j];
            i++;
            j++;
        }

        i=0;
        j=n-1;

        while(i<n) {
            if(i!=j){
                sum+=mat[i][j];
            }
            i++;
            j--;
        }

        return sum;
    }


    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

        System.out.println(diagonalSum(arr));
    }
}
