package multiThreading;

public class example extends Thread {
	    public void run()
	    {
	        try {
	            // Displaying the thread that is running
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	}
	 
	// Main Class
class Multithread {
	    public static void main(String[] args)
	    {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	        	example object
	                = new example();
	            object.start();
	        }
	    }
	}
