// import java.util.Scanner;
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks of first subject: ");
//         int sub1 = sc.nextInt();
//         System.out.println("Enter the marks of second subject: ");
//         int sub2 = sc.nextInt();
//         System.out.println("Enter the marks of third subject: ");
//         int sub3 = sc.nextInt();
//         float avg = (sub1+sub2+sub3)/3;
//         if (avg>=40 && sub1>33 && sub2>33 && sub2>33 && sub3>33) {
//             System.out.println("Congratulation. Tou are passed!");
//         }
//         else {
//             System.out.println("Please try again later");
//         }
//         System.out.println("Your total percentage is " +avg); 
//     }
// }


                                                    //  problem2 ---> calculate tax using if else
// import java.util.Scanner;
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float tax = 0f;
//         System.out.println("Enter the income 0f a Employee: ");
//         float income = sc.nextFloat();
//         if (income < 2.5) {
//             tax = tax+0;
//         }
//         else if (income >= 2.5 && income<5.0) {
//             tax = tax+0.05f*(income-2.5f);
//         }
//         else if (income >= 5.0 && income <10.0) {
//             tax = tax+0.05f*(income-2.5f);
//             tax = tax+0.2f*(income-5.0f);
//         }
//         else if (income >=10.0) {
//             tax = tax+0.05f*(income-2.5f);
//             tax = tax+0.2f*(income-5.0f);
//             tax = tax+0.3f*(income-10.0f);
//         }
//         System.out.println("The total tax paid by the Employee is: "+tax);
//     }
// }

                                                        // problem3 ---> Quardratic equation
// import java.util.Scanner;
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a");
//         double a = sc.nextDouble();

//         System.out.println("Enter the value of b");
//         double b = sc.nextDouble();

//         System.out.println("Enter the value of c");
//         double c = sc.nextDouble();

//         double result = (b*b - 4*a*c);
//         if (result > 0.0) {
//             double r1 = (-b+Math.pow(result,0.5))/(2*a);
//             double r2 = (-b-Math.pow(result,0.5))/(2*a);
//             System.out.println("The roots are" + r1+ "and" +r2);
//         }
//         else if (result == 0.0) {
//             double r1 = -b+(2*a);
//             System.out.println("The roots is"+r1);
//         }
//         else {
//             System.out.println("The equation has no real roots");
//         }
//     }
// }

                                    //   problem 4 ---> generate number blw 1 to 7 and display sunday monday
//     import java.util.Scanner;                               
//     public class conditional {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number between 1 to 7: ");
//         int number = sc.nextInt();
//         switch(number) {
//             case 1:
//             System.out.println("Monday");
//             break;

//             case 2:
//             System.out.println("Tuesday");
//             break;

//             case 3:
//             System.out.println("Wednesday");
//             break;

//             case 4:
//             System.out.println("Thursday");
//             break;

//             case 5:
//             System.out.println("Friday");
//             break;

//             case 6:
//             System.out.println("Saturday");
//             break;

//             case 7:
//             System.out.println("Sunday");
//             break;
//         }
        
//     }
// }

                                        // problem5 --> Find the number of days in a month
// import java.util.Scanner;
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int daysInMonth = 0;
//         String Monthofname = "";

//         System.out.println("Enter the number of month");
//         int month = sc.nextInt();

//         System.out.println("Enter the year");
//         int year = sc.nextInt();
//         switch(month) {
//             case 1:
//             Monthofname = "janwary";
//             daysInMonth = 31;
//             break;

//             case 2:
//             Monthofname = "Febraury";
//             if ((year%400 == 0) || (year%4 == 0) && (year%100 != 0)) {
//                 daysInMonth = 29;
//             }
//             else {
//                 daysInMonth = 28;
//             }
//             break;

//             case 3:
//             Monthofname = "March";
//             daysInMonth = 31;
//             break;

//             case 4:
//             Monthofname = "April";
//             daysInMonth = 30;
//             break;

//             case 5:
//             Monthofname = "May";
//             daysInMonth = 31;
//             break;

//             case 6:
//             Monthofname = "June";
//             daysInMonth = 30;
//             break;

//             case 7:
//             Monthofname = "July";
//             daysInMonth = 31;
//             break;

//             case 8:
//             Monthofname = "August";
//             daysInMonth = 31;
//             break;

//             case 9:
//             Monthofname = "September";
//             daysInMonth = 30;
//             break;

//             case 10:
//             Monthofname = "Octobar";
//             daysInMonth = 31;
//             break;

//             case 11:
//             Monthofname = "November";
//             daysInMonth = 30;
//             break;

//             case 12:
//             Monthofname = "December";
//             daysInMonth = 31;
//             break;
//         }
//         System.out.println(Monthofname +" "+ year +" has " + daysInMonth + " days");
//     }
// }

                                        // problem 6 ---> a char is character or not
// import java.util.Scanner; 
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character");
//         char ch = sc.next().charAt(0);
//         if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//             System.out.println("character is alphabate");
//         }
//         else {
//             System.out.println("Not Alphabate");
//         }
//     }
// }

                                       // Problem 7 --> claculate electricity bill
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number if units");
        int unit = sc.nextInt();
        float amt=0, surcharges, bill_amount;
        if(unit<=50) {
            amt = 0.50f*unit;
        }
        else if(unit<=150) {
            amt = 0.75f*unit;
        }
        else if (unit<=250) {
            amt = 1.20f*unit;
        }
        else if (unit>250) {
            amt = 1.50f*unit;
        }
        surcharges = amt*0.2f;
        bill_amount = amt+surcharges;
        System.out.println(bill_amount);
    }
}