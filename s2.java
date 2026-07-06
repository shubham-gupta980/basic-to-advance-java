class ThrowExample
{
     public static void checkNumber(int number)
     {
         if (number<0)
         {
             throw new IllegalArgumentException(" number cannot be registered");
         }
         else{
            System.out.println("number is "+number);
         }
     } 
     public static void main(String args[])
     {
        try{
            checkNumber(5);

        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Caught an exception" +e.getMessage());
        }
     }
}