import java.util.Scanner;
class main {
    public static void main(String[] args) {
       System.out.println("Program to create calculator by Shivendra Singh-");
        System.out.println("Uni. Roll no. - 1230432603");
         
         float a,b,add,sub,mul,div;
         Scanner ss=new Scanner(System.in);
         System.out.println("Enter first no.-");
         a=ss.nextFloat();
         System.out.println("Enter second no.-");
         b=ss.nextFloat();
         System.out.println("Which mathematical operation do you want to perform-");
         System.out.println(" Press 1 For Addition\n Press 2 For Subtraction\n Press 3 For Multiplication\n Press 4 For Division\n");
       int t=ss.nextInt();
       switch(t) {
               case 1:
               add=a+b;
               System.out.printf("Addition of %f and %f is- %f",a,b,add);
               break;
               case 2:
               sub=a-b;
               System.out.printf("Subtraction of %.1f and %f is- %.1f",a,b,sub);
               break;
               case 3:
               mul=a*b;
               System.out.printf("Multiplication of %f and %f is- %f",a,b,mul);
               break;
               case 4:
               div=a/b;
               System.out.printf("Divition of %f and %f is- %f",a,b,div);
               break;
               default :
               System.out.println("Invalid input please choose from 1 to 4");
       }  

       }
       
         
}