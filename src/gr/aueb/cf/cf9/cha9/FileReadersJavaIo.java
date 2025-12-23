package gr.aueb.cf.cf9.cha9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadersJavaIo
{
    public static void main(String[] args) {

        File file = new File("/home/cyberpirate/Desktop/testCF9/test.txt");
        try{
           // readFIle(file.getAbsolutePath());
            bufferFile(file.getAbsolutePath());
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    // Scanner is useful for reading primitive types and Strings.

    public static void readFIle(String file) throws IOException {

        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)){
            int byteReaders = 0;

            while ((byteReaders = fr.read()) != -1){
                System.out.print((char) byteReaders) ;
            }
        } catch(IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    public static void bufferFile(String file) throws IOException{

        try (BufferedReader bf = new BufferedReader(new FileReader(file,StandardCharsets.UTF_8))){
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
            throw ex;
        }

    }

}
