
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        File f=new File("Hello.txt");   //paper
        //f.createNewFile();

        //FileWriter fw=new FileWriter("Hello.txt");        //pen
        //fw.write("Hello World");
        //fw.close();

        FileReader fr=new FileReader("Hello.txt");     //reading the file
        int value;
        while ((value=fr.read())!=-1) { 
            System.out.print((char)value);
        }
        

    }
}
