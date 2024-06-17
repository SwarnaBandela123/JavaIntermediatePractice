package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.midi.SysexMessage;

public class trywithresorces {
    public static void findFile() throws IOException {
        // Code that may produce IOException
        File newFile = new File("test.txt");
        if(!newFile.exists()) {
        	newFile.createNewFile();
        }
        try (FileReader FR=new FileReader(newFile);
            FileInputStream FIS = new FileInputStream(newFile);
            InputStreamReader ISR= new InputStreamReader(FIS);
            BufferedReader BR=new BufferedReader(ISR);){
        	
           String text=new String("How are you");
        }catch(IOException E1) {
        	E1.getStackTrace();
        	System.err.println("Please give correct path of the text file");
        }

    }
}
