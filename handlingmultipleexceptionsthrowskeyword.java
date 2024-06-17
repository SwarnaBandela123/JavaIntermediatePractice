package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class handlingmultipleexceptionsthrowskeyword {
	  public static void findFile() throws NullPointerException, IOException, ClassNotFoundException {
	        // Code that may produce exceptions
	        File newFile = new File("test.txt");
	        try {
	            FileInputStream stream = new FileInputStream(newFile);
	            // Additional operations with the file input stream
	        } catch (NullPointerException e) {
	            System.out.println("Null pointer exception: " + e.getMessage());
	        } catch (IOException e) {
	            System.out.println("IO exception: " + e.getMessage());
	        }
	    }
	    public static void main(String[] args) throws NullPointerException, ClassNotFoundException, IOException {
	        try {
	            findFile();
	        } finally {
	        	System.out.println("Handling multiple exceptions");
	        }
	    }
	}