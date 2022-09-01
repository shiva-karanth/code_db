import java.util.Objects;

public class program4 {
    public static void main(String[] args) {
       Project p=new Project(1,"rama");

    }
}
class Project
{
    int id;
    String name;
    public Project (int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString()
    {
        return "Project id="+id+" Name="+name;
    }
    public  int hashCode()
    {
//        bit confusing
        return Objects.hash(id,name);
    }
    //    if we override equals we should override hashcode methods
//    so if we make like
    public  boolean equals(Object obj)
    {
        project p1=(project)obj;
        if((this.id==p1.id)&&(this.name.equals(p1.name)))
        {
            return true;
        }
        return false    ;
    }

    public void display(project p)
    {
        System.out.println("project details");
        System.out.println("------------------------");
        System.out.println("Name:"+name);
        System.out.println("id:"+id);
    }

}
