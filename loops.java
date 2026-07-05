// public class loops {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             System.out.println(2*i);
//             i++;
//         }while(i<=10);
//     }
    
// }


// public class loops {
//     public static void main(String[] args) {
//         // int i=0;
//         int sum = 0;
//         for (int i=0; i<=10; i++) {
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }

// public class loops {
//     public static void main(String[] args) {
//         int n =  4;
//         for (int i=n; i>=1; i--) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         int sum= 0;
//         int i=0;
//         int n = 10;
//         do {
//             sum = sum+2*i;
//             i++;
//         }while(i<=n);
// //         for (int i=0; i<=n; i++) {
// //             sum = sum+2*i;
// //         }
//         System.out.println(sum);
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         int fact = 1;
//         for (int i=1; i<=5; i++) {
//             fact *= i;
//         }
//         System.out.println(fact);
//     }
// }


// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Entered the valur of first number: ");
//         double num1 = sc.nextInt();
//         System.out.println("Entered the vslur of second number: ");
//         double num2 = sc.nextInt();

//         double power = Math.pow(num1,num2);
//         System.out.println(power);
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         int num = 12345;
//         while(num>0) {
//             int r = num%10;
//             System.out.print(r +" ");
//             num = num/10;
//         }
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         boolean flag = true;
//         int number = 4;
//         for (int i=2; i<number; i++) {
//             if (number%i == 0) {
//                 flag = false;
//                 break;
//             }
//         }
//         if (number == 2) {
//             System.out.println("Number is prime");
//         }
//         else {
//             System.out.println("Number is no prime");
//         }
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         int divident, divisor, remainder;
//         int hcf = 0;
//         divident = 20;
//         divisor = 90;
//         do {
//             remainder = divident % divisor;
//             if (remainder == 0) {
//                 hcf = divisor;
//             }
//             else {
//                 divident = divisor;
//                 divisor = remainder;
//             }
//         }while(remainder !=0);
//         System.out.println(remainder);
//     }
// }


// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int sumeven = 0, sumodd = 0;
//         char choice;
        
//         do {
//             System.out.println("Enter the value of number: ");
//             num = sc.nextInt();
//             if (num % 2 == 0) {
//                 sumeven = sumeven + num;
//             } else {
//                 sumodd = sumodd + num;
//             }
            
//             System.out.println("Do you want to continue (y/n)?");
//             choice = sc.next().charAt(0);
            
//         } while(choice == 'Y' || choice == 'y');
        
//         System.out.println("Sum of even numbers: " + sumeven);
//         System.out.println("Sum of odd numbers: " + sumodd);
//     }
// }


// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int c = num;
//         int arm =0, r = 0;
//         while(num > 0) {
//             r = num%10;
//             arm = arm+(r*r*r);
//             num = num/10;
//         }
//         if (arm == c) {
//             System.out.println("Number is Armstrong");
//         }
//         else {
//             System.out.println("Number is not Armstrong");
//         }
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         char c;
//         for (c= 'a'; c<='z'; c++) {
//             System.out.println(c);
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         for (int a=0; a<=100; a++) {
//             if (a%2 == 0) {
//                 System.out.println(a);
//             }
//         }
//     }
// }


// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int c = num;
//         int sum = 0;
//         int rem = 0;
//         while(num>0) {
//             rem = num%10;
//             sum = sum + rem;
//             num = num/10;
//         }
//         System.out.println(c);
//         System.out.println(sum);
//     }
// }


// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of divident");
//         int divident = sc.nextInt();
//         System.out.println("Enter the number of divisor");
//         int divisor = sc.nextInt();
//         int rem , hcf = 0;
//         do {
//             rem = divident % divisor;
//             if (rem == 0) {
//                 hcf = rem;
//             }
//             else {
//                 divident = divisor;
//                 divisor = rem;

//             }
//         }while(rem != 0);
//         hcf = divisor;
//         System.out.println(hcf);
//     }
// }


// public class loops {
//     public static void main(String[] args) {
//         int count = 0;
//         int n = 10;
//         for (int i=2; i<=n; i++) {
//             if (n % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println("Prime");
//         }
//         else {
//             System.out.println("Not Prime");
//         }
//     }
// }


// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the letter: ");
//         String letter = sc.next();
//         letter = letter.toUpperCase();
//         char ch;
//         int count = 0;
//         for (ch = 'A'; ch <= 'Z'; ch++) {
//             for (int i=0; i<letter.length(); i++) {
//                 if (ch == letter.charAt(i)) {
//                     System.out.println(ch + " ");
//                     count++;
//                     break;
//                 }
//             }
//         }
//         System.out.println("Total number of diffferent is :" +count);
//     }
// }

public class loops {
    public static void main(String[] args) {
        String text = "SHUBHAM";
        text = text.toUpperCase();
        int count = 0;
            for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                count++;
        }
        System.out.println("Total Number of Words in String : "+ (count+1));
        }
    }