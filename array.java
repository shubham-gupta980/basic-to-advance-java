// import java.util.Arrays;
// public class array {
//     public static void main(String[] args) {
//         int arr[] = {22,44,66,88,100};
//         // System.out.println(Arrays.toString(arr));
//         for (int element : arr) {
//             System.out.println(element);
//         }
//     }
// }

// public class array {
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         arr[0] = 3;
//         arr[1] = 2;
//         arr[2] = 10;
//         arr[4] = 15;
//         System.out.println(arr[0]);
//     }
// }


// public class array {
//     public static void main(String[] args) {
//         float sum = 0;
//         float arr[] = {22,44,66,99};
//         for (int i=0; i<arr.length; i++) {
//             sum = sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }

// public class array {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         int usrnum = 7;
//         boolean found = false;
//         for (int i=0; i<arr.length; i++){ 
//             if (arr[i] == usrnum) {
//                 System.out.println("number is found at index " +i);
//                 found = true;
//                 break;
//             }
//         }
//         if(!found) { 
//             System.out.println("number is not found");
//         }
//     }
// }


// public class array {
//     public static void main(String[] args) {
//         int arr1[][] = {{1,2,3},
//                         {4,5,6},
//                         {7,8,9}};

//         int arr2[][] = {{2,3,4},
//                         {5,3,7},
//                         {7,4,6}};

//         int result[][] = {{0,0,0},
//                           {0,0,0},
//                           {0,0,0}};

//         for(int i=0; i<arr1.length; i++) {
//             for(int j=0; j<arr2.length; j++) {
//                 result[i][j] = arr1[i][j] + arr2[i][j];
//                 System.out.print(result[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class array {
//     public static void main(String[] args) {
//         int arr[] = {22,33,44,55,66,77};
//         int max = 0;
//         for (int i=0; i<arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("The maximum number of array is "+max);
//     }
// }


// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of element in array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the element of array");
//         for (int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int min = arr[0];

//         for (int i=1; i<n; i++) {
//             if (arr[i] < min ){
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);
//     }
// }

// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of rows: ");
//         int rows = sc.nextInt();
//         System.out.println("Enter the size of column: ");
//         int column = sc.nextInt();

//         int matrix1[][] = new int [rows][column];
//         int matrix2[][] = new int [rows][column];
//         int result[][] = new int[rows][column];

//         System.out.println("Enter the element of first matrix: ");
//         for (int i=0; i<rows; i++) {
//             for(int j=0; j<column; j++) {
//             matrix1[i][j] = sc.nextInt();
//             }
//             // System.out.println();
//         }

//         System.out.println("Enter the element of second matrix: ");
//         for (int i=0; i<rows; i++) {
//             for(int j=0; j<column; j++) {
//             matrix2[i][j] = sc.nextInt();
//             }
//             // System.out.println();
//         }

//         System.out.println("Resultant matrix of addition: ");
//         for (int i=0; i<rows;i++) {
//             for(int j=0; j<column; j++) {
//              result[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }

//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<column; j++) {
//                 System.out.print(result[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the element of column: ");
        int column = sc.nextInt();

        System.out.println("Matrix is ..........");
        int mat[][] = new int[rows][column];
        for (int i=0; i<rows; i++)  {
            for (int j=0; j<column; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to check its location");
        int x = sc.nextInt();
        for (int i=0; i<rows; i++) {
            for (int j=0; j<column; j++) {
                if (mat[i][j] == x) {
                    System.out.println("X is found at location ("+i+" , "+j+")");
                }
            }
        }
    }
}

