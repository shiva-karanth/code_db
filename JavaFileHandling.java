import java.io.*;

interface crudop {
    public void create();

    public void update(String x);

    public void read(String x);

    public void delete(String x);
}

public class maindriver {
    static filehandling fh=new filehandling();
    public static void main(String args[])
    {
    String filepath="C:\\Users\\LENOVO\\OneDrive\\Desktop\\phase1\\corejava.txt";
    fh.create();
    fh.update(filepath);
    fh.read(filepath);
//    fh.delete(filepath);

    }
}
class filehandling implements crudop{

    @Override
    public void create() {
        int i=0;
        try {

            for(i=0;i<10;i++) {
               String filepath="C:\\Users\\LENOVO\\OneDrive\\Desktop\\phase1\\corejava"+i+".txt";
                  File file=new File(filepath);
                boolean data = file.createNewFile();

            if(data)
            {
                System.out.println("create success");
            }
            else
            {
                System.out.println("file already exists");
            }}
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Override
    public void update(String x) {
        String data="CEC";
        try {
            FileWriter fw=new FileWriter(x);

            fw.write(data);
            System.out.println("write success");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }


    }

    @Override
    public void read(String x) {
        char cdata[]=new char[1000];
        try {
            FileReader fr=new FileReader(x);
            fr.read(cdata);
            System.out.println(cdata);

            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(String x) {
        File file=new File(x);
        boolean data=file.delete();
        if(data)
        {
            System.out.println("delete success");
        }
        else
        {
            System.out.println("delete fail");
        }

    }
}
