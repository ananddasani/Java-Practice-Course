public class matix_chain_multiplication {
    public static int solve(int []p,int i,int j ){
        //base condition
        if(i>=j){
            return 0;
        }
        int mn = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            int temp = solve(p,i,k)+solve(p,k+1,j)+ p[i-1]*p[k]*p[j];
            if(temp < mn){
                mn = temp;
            }
        }
        return mn;
    }
    //matix chain multiplication with the help of memoization
    public static int solve_memoized(int []p,int i,int j){
        int [][]t = new int[100][100];
        //initialized the array with -1
        for(int k = 0 ; k<100;k++){
            for(int l = 0 ;l<100 ;l++){
                t[k][l] = -1;
            }
        }
        if(i>=j){
            return 0;
        }
        if(t[i][j] != -1){
            return t[i][j];
        }
        int mn = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            int temp = solve_memoized(p,i,k)+solve_memoized(p,k+1,j) + p[i-1]*p[k]*p[j];
            if(temp < mn){
                mn = temp ;
            }
        }
        t[i][j] = mn;
        return t[i][j];
    }
    public static int solve_tab(int []p,int n ){
//        making the two 2d arrays for the tabulation method
        int [][]m = new int[n][n];
        int [][]s = new int[n][n];
        //initialized the array
        for(int k =0 ;k<n;k++){
            for(int l = 0 ;l<n;l++){
                m[k][k] = 0;
                s[k][l] = 0;
            }
        }
        int min = Integer.MAX_VALUE;

        for(int d = 1;d<n-1;d++){
            for(int i = 1;i<n-d;i++){
                int j = i + d;
                for(int k = i;k<=j-1;k++){
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(q < min){
                        min = q;
                        s[i][j] = k;
                    }

                }
                m[i][j]=min;
            }

        }
        return m[1][n-1];
    }
    public static void main(String args[]){
        int [] p ={1,2,3,4};
        int answer = solve_tab(p,p.length );
        System.out.println(answer);
    }
}
