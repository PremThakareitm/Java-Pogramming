
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamEx1 {
    public static void main(String[] args) {
        try(BufferedInputStream fin = new BufferedInputStream(new FileInputStream("/Users/premthakare/Documents/PremT_Java/file123.txt"));
        BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("/Users/premthakare/Documents/PremT_Java/file.txt")))

        byte buffer[]= new byte[1024];
        int lenRead;
        while((lenRead = fin.read(buffer))>0){
            fout.write(buffer,0,lenRead);
            fout.flush();
        }
    }catch(FileNotFoundException e){
        System.out.println("File not found exception");
    }
    catch(IOException){
        System.out.print("IO Error");
    }
}
