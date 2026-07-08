class students 
{
    String name;
    int age;
//     public void printinfo() 
//    {
//      System.out.println(this.name);
//      System.out.println(this.age);

//    }
   students(String name ,int age)

   {
     this.name =name;
     this.age =age;    
     System.out.println(this.name);
    System.out.println(this.age); 
   }
   students(int z)
    {
System.out.println("shivom ki mkc");
    }
}
class test1
{
    public static void main(String args[])
    {
         students obj = new students(2);
    }
}