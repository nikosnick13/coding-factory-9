package gr.aueb.cf.cf9.cha9;

import java.io.*;

public class BinaryFIle {

    public static void main(String[] args) {

    }

    public static void binaryFileReadWrite(String inputFile, String outputFile) throws IOException{

        final int BUFFER_SIZE = 8192; //8KB;
        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferRead = 0;
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))){
            while ((bufferRead = bis.read(buffer)) != -1 ){

               bos.write(buffer,0, bufferRead );
            }
            System.out.println("File written successfully!");
        } catch (IOException Ex) {
            Ex.printStackTrace();
            throw Ex;
        }

    }
}
