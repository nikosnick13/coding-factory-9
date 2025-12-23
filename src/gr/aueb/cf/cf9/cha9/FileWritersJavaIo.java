package gr.aueb.cf.cf9.cha9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;

/**
 * Demo of file writers in java.io package.
 */
public class FileWritersJavaIo {

    public static void main(String[] args) {
        File file = new File("/home/cyberpirate/Desktop/testCF9/test.txt");


        try(PrintStream ps = new PrintStream("/home/cyberpirate/Desktop/testCF9/text-ps.txt");) {
//            fileWriter(file.getAbsolutePath()); //or string path "/home/cyberpirate/Desktop/testCF9/test.txt")
//            bufferWriter(file); //or string path "/home/cyberpirate/Desktop/testCF9/test.txt")

            // Flexible usage of sayHello() method
            sayHello(System.out);
            sayHello(ps);
            System.out.println("Τα αρχεία δημιουργήθηκαν");

        }catch (IOException ex){
            System.err.println("Τα αρχεία δεν δημιουργήθηκαν.");
            ex.printStackTrace();
        }

    }

    public static void fileWriter(String file)throws   IOException{

        try(FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8,true)) {

            fw.write("Hello World!!\n");
            fw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
            throw  ex;
        }
    }


    public static void bufferWriter(File file) throws IOException{

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,StandardCharsets.UTF_8,true))){
            bw.write("New World For My Skils\n");
            bw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    public static void printStream(String file) throws IOException{
        try (PrintStream ps = new PrintStream(file)){
            ps.println("Hello new World!!!");
            ps.flush();
        }catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    public static void printWriter(String file) throws IOException{
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println("Hello new World!!!");
            pw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    public static void sayHello(PrintStream pm){
        pm.println("Hello Coding!!");
        pm.flush();
    }
}
