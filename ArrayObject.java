public class Main
{
  public static void main (String[]args)
  {
    Student[] stu = new Student[3];
    stu[0] = new Student (1, "RamaKrishna");
    stu[1] = new Student (2, "GG");
    stu[2] = new Student (3, "PP");
    System.out.println (stu[0].name);
    stu[0].id = 1;
    stu[0].name = "karthik";
    stu[1].id = 2;
    stu[1].name = "GG";
    stu[2].id = 3;
    stu[2].name = "PP";
    System.out.print (stu[0].name);
  }
}
class Student
{
  int id;
  String name;
    Student (int id, String name)
  {
    this.id = id;
    this.name = name;
}}

