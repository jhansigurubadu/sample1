public class TwoDimensional {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        arr[0][0]=10;
        arr[0][1]=11;
        arr[0][2]=22;
        arr[1][0]=33;
        arr[1][1]=44;
        arr[1][2]=55;
        arr[2][0]=66;
        arr[2][1]=77;
        arr[2][2]=88;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();

            }

        }
    }

