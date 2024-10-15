import java.io.*;

class Save implements Serializable {

    int i;
}

public class ObjectSerializationDemo {

    public static void main(String[] args) {

        Save obj1 = new Save();
        obj1.i = 4;

        String filepath = "object.txt";

        try
        {
            FileOutputStream fout = new FileOutputStream(filepath);
            ObjectOutputStream oout = new ObjectOutputStream(fout);

            oout.writeObject(obj1);

            fout.close();
            oout.close();

            System.out.println("Object File saved successfully");
        }
        catch (Exception e) {

            System.out.println(e);
        }

        try
        {
            FileInputStream fin = new FileInputStream(filepath);
            ObjectInputStream oin = new ObjectInputStream(fin);

            Save obj2 = (Save) oin.readObject();

            fin.close();
            oin.close();

            System.out.println("Object File Fetched saved successfully");

            System.out.println("The value of i in the object fetched from file is : " + obj2.i);
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}