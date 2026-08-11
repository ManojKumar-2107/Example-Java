class Student{
{
System.out.println("Instance block called");

}
static{
System.out.println("Static block called");

}
 static Student st=new Student();

public static void main(String args[])
{
System.out.println("main method started");
System.out.println("main method ended");
}
}
