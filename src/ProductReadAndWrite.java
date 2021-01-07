import java.io.*;

public class ProductReadAndWrite {
    public static void writeFile(Object obj, String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
    public static Object readFile(String fileName){
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream oos = new ObjectInputStream(fis);
            obj = oos.readObject();
            oos.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return obj;
    }
}
