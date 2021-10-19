public class Main {

    public static void main(String[] args) {

        int m = 4, n = 4,i1 = 0,j1 = 0, max = -9999, sum = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = -90 + (int) (Math.random() * 100);
                System.out.print(arr[i][j] + "\t");
                if(arr[i][j] > max){
                    max = arr[i][j];
                    i1=i;j1=j;
                }
            }
            System.out.println();
        }
        int j = j1;
        for (int i = i1; i < n; i++) {
            for (; j < m; j++) {
                if(arr[i][j] < 0) sum += arr[i][j];
            }
            j = 0;
        }
        System.out.println("Mах: "+max);
        System.out.println("Sum: " + sum);
    }
}

