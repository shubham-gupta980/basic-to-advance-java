                                                        // problem1 ---> Linear Search
// public class array_adv_ques {
//     public static int linearSearch(int arr[], int key) {
//     for(int i=0; i<arr.length; i++) {
//         if (arr[i] == key) {
//             return i;
//         }
//     }
//     return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         int key = 1;
//         linearSearch(arr, key);
//         // int index = linearSearch(arr , key);
//         // if (index == -1) {
//         if (linearSearch(arr, key) == -1) {
//             System.out.println("Element is not found");
//         }
//         else {
//             System.out.println("Element is found");
//         }
//     }
// }

// public class array_adv_ques {
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,78,10};
//         int key = 12;
//         for (int i=0; i<arr.length; i++) {
//             if(arr[i] == key) {
//                 System.out.println("Element is found at index " +i);
//                 break;
//             }
//             else {
//                 System.out.println("Element is not found");
//                 break;
//             }
//         }
//     }
// }

                                                        // problem 2 ---> Binary Search 

// public class array_adv_ques {
//     public static int binarySearch(int arr[], int key) {
//         int start = 0;
//         int end = arr.length-1;
//         while(start <= end) {
//             int mid = (start+end)/2;
//             if (arr[mid] == key) {
//                 return mid;
//             }
//             if (arr[mid] < key) {
//                 start = mid+1;
//             }
//             else {
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         int key = 7;
//         System.out.println("Index for a key is " +(binarySearch(arr, key)));
//     }
// }

                                                        // problem 3 ---> pairs in array
// public class array_adv_ques {
//     public static void printPair(int num[]) {
//         for (int i=0; i<num.length; i++) {
//             for(int j=i+1; j<num.length; j++) {
//                 System.out.print("(" + num[i] + "," + num[j] +")" +" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10};
//         printPair(num);
//     }
// }
    
                                                    //  problem 4 ---> subarray 
// public class array_adv_ques {
//     public static void subArray(int arr[]) {
//         for (int i=0; i<arr.length; i++) {
//             int start = i;
//             for (int j=i; j<arr.length; j++) {
//                 int end = j;
//                 for (int k=start; k<=end; k++) {
//                     System.out.print(arr[k] +" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,7};
//         subArray(arr);
//     }
// }


                                                           // Max subarray and Min subarray
// public class array_adv_ques {
//     public static void maxSubarray_minSubarray(int num[]) {
//         // int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i=0; i<num.length; i++) {
//             int start = i;
//             for (int j=i; j<num.length; j++) {
//                 int end = j;
//                 int currSum = 0;
//                 for (int k=start; k<=end; k++) {
//                     currSum += num[k];
//                     // System.out.println(num[k] +" ");
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Max num "+ maxSum);
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10};
//         maxSubarray_minSubarray(num);
//     }
// }

                                                            // remove an array 

// import java.util.Arrays;  
// public class array_adv_ques {
//     public static void main (String[] args) {
//         int arr[] = {11,22,33,44,55,66,77};
//         int removeIndex = 3;
//         System.out.println("Original array: " + Arrays.toString(arr));
//         for(int i=removeIndex; i<arr.length-1; i++) {
//             arr[i] = arr[i+1];
//         }
//         System.out.println("After array: " +Arrays.toString(arr));
//     }
// }

                                                           // Insert an array by specific position 
// import java.util.Arrays;                                                           
// public class array_adv_ques {
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,1,7,8,9};
//         int positionIndex = 4;
//         int newNumber = 10;
//         for(int i=arr.length-1; i > positionIndex; i++) {
//             arr[i] = arr[i-1];
//         }
//         arr[positionIndex] = newNumber;
//         System.out.println("Arrays are : "+(Arrays.toString(arr)));
//     }
// }

                                                            // Reverse and array
// import java.util.Arrays;
// public class array_adv_ques {
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,7,8};
//         int l = arr.length;
//         int n = l/2;
//         for(int i=0; i<n; i++) {
//             int temp = arr[i];
//             arr[i] = arr[l-i-1];
//             arr[l-i-1] = temp;
//         }
//         System.out.println("Reverse array is "+Arrays.toString(arr));
//     }
// }

                                                            // Duplicate value find
// import java.util.Arrays;
// public class array_adv_ques {
//     public static void main(String[] args){
//         int arr[] = {2,2,3,4,5,5,6,7,8,8};
//         for(int i=0; i<arr.length; i++) {
//             for(int j=i+1; j<arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.println("Duplicate value "+arr[j] +" ");
//                 } 
//             }
//         }
//     }
// }

                                                              // Common element between two element
// public class array_adv_ques {
//     public static void main(String[] args) {
//         int arr1[] = {1,3,5,6,9,4};
//         int arr2[] = {2,4,6,8,9,1};
//         for (int i=0; i<arr1.length; i++) {
//             for (int j=0; j<arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     System.out.println("Common elements are: "+arr2[j]);
//                 }
//             }
//         }
//     }
// }
