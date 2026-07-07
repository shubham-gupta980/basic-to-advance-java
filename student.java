class student
{
 public static void main(String args[])
{
 try 
 {
  int x[] =new int[5];
x[5] =40/0;
  System.out.println("the rest of the codee is in try block");
 }
 catch(ArithmeticException e)
 {
   System.out.println("ArithemeticException =>" + e.getMessage());

 }
 catch(ArrayIndexOutOfBoundsException e)
 {
    System.out.println("ArrayIndexOutoFBounds Exception  occurs " );
 }
 catch(Exception e)
 {
    System.out.println("parent exceptio  occurs");
 }
 System.out.println("shubham");

}

}