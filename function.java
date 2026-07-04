// public class function {
//     public static int sum(int a, int b) {
//     int c;
//     if (a>b) {
//         c = a+b;
//     }
//     else {
//         c = a-b;
//     }
//     return c;
// }
//     public static void main(String[] args) {
//         int a = 6;
//         int b = 7;
//         int c = sum(a, b);
//         System.out.println(c);
//     }
// }

                                                // problem 2 ---> Avg of two number
// public class function {
//     public static int avgSum(int a, int b, int c){
//         int d = (a+b+c)/3;
//         return d;

//     }
//     public static void main(String[] args) {
//         int x = 4;
//         int y = 4;
//         int z = 4;
//         int s = avgSum(x, y, z);
//         System.out.println(s);
//     }
// }

                                            //   problem 3 ---> Variables Argument
// public class function {
//     static int sum(int ...arr) {
//         int sum = 0;
//         for (int a : arr) {
//             sum += a;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println("The value of sum a and b is " +sum(4,5));
//         System.out.println("The value of sum a, b and c is "+sum(4,5,6));
//         System.out.println("The value of sum a,b,c and d is "+sum(9,8,7,6));
//     }
// }

                                                // problem 2 ---> changed the value in array
// public class function {
//     public void changed(int n) {
//         n = 322;
//     }
//     public void function2(int[] number) {
//         number[0] = 322;
//     }
//     public static void main(String[] args) {
//         int [] marks = {22,34,44,52,32,53,46};
//         int x = 45;
//         changed(x);
//         System.out.println("The value of x after running change is "+ x);
//     }
// }

                                            // problem 3 ---> average of two n numbers
// import java.util.Scanner;
// public class function {
//     static float Average(int a, int b, int c) {
//         float avg = (a+b+c)/3;
//         return avg;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int c = sc.nextInt();
//         float avg = Average(x, y, c);
//         System.out.println("The average of three number is "+avg);

//         // System.out.println("The average of two number is "+Average(9,9,9));
//     }
// }


                                            //  problem 4 ---> sum of odd all natural number from 1 to 100
// public class function {
//     static int sum_Odd(int num) {
//         int sum = 0;
//         for (int i=0;i<=num; i++){
//             if (i%2 != 0) {
//                 sum +=i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) { 
//         int sumNum = 100;
//         System.out.println("The sum of n odd number is "+(sum_Odd(sumNum)));
//     }
// }


                                        //    problem 5 ---> greater then between two three numbers
// public class function {
//     static int greaterNum(int num1, int num2, int num3) {
//         if (num1 > num2 && num1 > num3) {
//             return num1;
//         }
//         else if (num2 > num1 && num2 > num3) {
//             return num2;
//         }
//         else {
//             return num3;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Greater of three number is "+(greaterNum(55, 99, 192)));
//     }
// }

                                            //   problem 6 ---> radius as a input and return a circumference
// import java.util.Scanner;
// public class function {
//     static double CircumRad(int r) {
//         float pii = 3.14f;
//         float circum = 2*pii*r;
//         return circum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rad = sc.nextInt();
//         System.out.println("the circumfarancr of a circle is "+ CircumRad(rad));
//     }
// }

                                            // problem 7 ---> smallest number by using three data inputs
// import java.util.Scanner;
// public class function {
//     static int smallestNum (int a,int b, int c) {
//     if (a<b && a<c) {
//         return a;
//     }
//     else if (b<a && b<c) {
//         return b;
//     }
//     else {
//         return c;
//     }

//     }
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
//         System.out.println("The smallest number is "+smallestNum(num1,num2,num3));
//     }
// }

                                        //    problem 8 ---> count vowel in a string  
// import java.util.Scanner;
// public class function {
//     public static int vowel(String st) {
//         int count  = 0;
//         for (int i=0; i<st.length(); i++) {
//             if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input a String : ");
//         String str = sc.nextLine();
//         int print  = vowel(str);
//         System.out.println(print);
//     } 
// }

