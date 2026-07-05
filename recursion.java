                                            // problem 1 ---> print n numbers 
// public class recursion {
//     static void Numbers(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         Numbers(n-1);
//     }
//     public static void main(String[] args) {
//         Numbers(5);
//     }
// }
     
                                            // problem 2 ---> sum of n natural numbers 
// public class recursion {
//     static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum = sum+i;
//             System.out.println(sum);
//             return;
//         }
//         sum +=i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }

                                        //    problem 3 ---> factorial of a number
// public class recursion {
//     static int fact(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }   
//         else{
//             return n*fact(n-1);
            
//         }
//      }
//     public static void main( String[] args) {
//         int result = fact(5);
//         System.out.println(result);
//     }
// }

                                            //   problem 4 ---> fibonacci series
// public class recursion {
//     static int fiboo(int n) {
//         if(n == 1 || n == 2) {
//             return n-1;
//         }
//         else {
//             return fiboo(n-1) + fiboo(n-2);
//         }
//     }
//     public static void main(String[] args) {
//         int result = fiboo(5);
//         System.out.println(result);
//     }
// }


                                            //    problem 5 ---> print fibonacci series
// public class resursion {
//     static void fib(int a, int b, int n) {
//         if (n == 0) {
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         fib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         int n = 7;
//         System.out.println(a);
//         System.out.println(b);
//         fib(a, b, n-2);
//     }
// }

                                                //    problem 6 ---> print x power x
// public class recursion {
//     static int power(int x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         else if (n == 0) {
//             return 1;
//         }
//         int pow1 = power(x,n-1);
//         int xPower = x*pow1;
//         return xPower;
//     }
//     public static void main(String[] args) {
//         int ans = power(2, 5);
//         System.out.println(ans);
//     }
// }

                                             //   problem 7 ---> check a string is a palingdromic or not using recursion
// public class recursion {
//     static boolean isPalingdrom(String str) {
//         if(str.length() <= 1){
//             return true;
//         }
//         char firstchar = str.charAt(0);
//         char lastchar = str.charAt(str.length()-1);
//         if (firstchar != lastchar) {
//             return false;
//         }
//         String remSubstring = str.substring(1,str.length()-1);
//         return isPalingdrom(remSubstring);
//     }
//     public static void main(String[] args) {
//         String Palingdrom1 = "racecar";
//         boolean isPalingdrom1 = isPalingdrom(Palingdrom1);
//         System.out.println(isPalingdrom1);
//     }
// }

                                                // problem 8 ---> reverse a string using recursion
// public class recursion {
//     static String isReverse(String str) {
//         if(str.isEmpty() || str.length() == 1) {
//             return str;
//         }
//         return isReverse(str.substring(1))+str.charAt(0);
//     }
//     public static void main(String[] args) {
//         String input = "Shubham";
//         String Reverse = isReverse(input);
//         System.out.println("Original String :"+input);
//         System.out.println("Reversed String :"+Reverse);
//     }
// }

                                            //   problem 9 ---> claculate GCD using recursion
// public class recursion {
//     static int GCD(int num1, int num2) {
//         if (num2 == 0) {
//             return num1;
//         }
//         int rem = num1%num2;
//         return GCD(num2,rem);
//     }
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;
//         System.out.println(GCD(num1, num2));
//     }
// }

                            //  problem 10 --->  sum of odd natural number in an array using recursion 
// public class recursion {
//     static int oddSum(int arr[], int index, int sum) {
//         if (index == arr.length) {
//             return sum;
//         }
//         else if (arr[index] % 2 != 0) {
//             sum = sum+arr[index];
//         }
//         return oddSum(arr, (index+1), sum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,7,8,9};
//         int result = oddSum(arr, 0, 0);
//         System.out.println("The value of oddSum is "+result);
//     }
// }


                                //   problem 11 ---> check if a given array is sorted or not
// public class recursion {
//     static boolean isSorted(int arr[], int index) {
//         if (index == arr.length-1) {
//             return true;
//         }
//         else if(arr[index] > arr[index+1]) {
//             return false;
//         }
//         return isSorted(arr, index+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,9,10};
//         boolean ans = isSorted(arr, 0);
//         System.out.println(ans);
//     }
// }

                                                    //   Intermediate type question based on recursion
                                                    // Problem 1 ---> Tower of hanoi
// public class recursion {
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("Transfer disk "+n+ " from " +src+" to " +dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("Transfer disk "+n+ " from " +src+ " to " +dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, "S", "H","D");
//     }
// }

                                            //   problem 2 ---> Reverse a string using recursion
// public class recursion {
//     static void Reversed(String str, int idx) {
//         if (idx == 0) {
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         Reversed(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String name = "Shubham";
//         Reversed(name, name.length()-1);
//     }
// }

                                          // problem 3 ---> find first and last occurance in a string
// public class recursion{
//     static int first = -1;
//     static int last = -1;
//     static void occurance(String str, int idx, char element) {
//         if (idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (currChar == element) {
//             if (first == -1) {
//                 first = idx;
//             }
//             else {
//                 last = idx;
//             }
//         }
//         occurance(str, idx+1, element);
//     }
//     public static void main(String[] args) {
//         String name = "abaacdaefaahb";
//         occurance(name, 0, 'b');
//     }
// }

                                        // problem 4 ---> Move all the x at the end of the string 
// public class recresion {
//     static void moveAll(String str, int idx, int count, String newstr) {
//         if (idx == str.length()) {
//             for (int i=1; i<=count; i++) {
//                 newstr += 'x';
//             }
//             System.out.println(newstr);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (currChar == 'x') {
//             count++;
//             moveAll(str, idx+1, count, newstr);
//         }
//         else {
//             newstr += currChar;
//             moveAll(str, idx+1, count, newstr);
//         }
//     }
//     public static void main(String[] args) {
//         String name = "axbcxxd";
//         moveAll(name, 0, 0, "");
//     }
// }

                                            // problem 5 ---> Remove duplicate value in a string
// public class recursion {
//     static boolean map[] = new boolean[26];
//     static void removeDuplicate(String str, int idx, String newStr) {
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a']) {
//             removeDuplicate(str, idx+1, newStr);
//         }
//         else {
//             newStr += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicate(str, idx+1, newStr);
//         }
//     }
//     public static void main(String[] args) {
//         String name = "abbccd";
//         removeDuplicate(name, 0, "");
//     }
// }

                                            //    problem 6 ---> find subsequences in a string
public class recursion {
    static void subSequences(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be in
        subSequences(str, idx+1, newStr+currChar); 
        // to be not in 
        subSequences(str, idx+1, newStr);

    }
    public static void main(String[] args) {
        String name = "abc";
        subSequences(name, 0, "");
    }
}

                                                    // problem 7 ---> unique subsequences with same character in a string
// public class recuesion {
//     public static void main(String[] args) {

//     }
// }