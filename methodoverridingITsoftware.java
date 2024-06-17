package polymorphism;

public class methodoverridingITsoftware {
	   public void work() {
	        System.out.println("Developer is working on coding tasks.");
	    }
	}

	class FrontendDeveloper extends methodoverridingITsoftware {
	    @Override
	    public void work() {
	        System.out.println("Frontend Developer is working on UI/UX design and client-side scripting.");
	    }
	}

	class BackendDeveloper extends methodoverridingITsoftware {
	    @Override
	    public void work() {
	        System.out.println("Backend Developer is working on server-side logic and database management.");
	    }
	}
	class QA extends methodoverridingITsoftware {
	    @Override
	    public void work() {
	        System.out.println("QA is testing the front end and back end of the application.");
	    }
	
	
	    public static void main(String[] args) {
	    	methodoverridingITsoftware developer = new methodoverridingITsoftware();
	    	FrontendDeveloper frontendDev = new FrontendDeveloper();
	    	BackendDeveloper backendDev = new BackendDeveloper();
	    	QA QA = new QA();

	        developer.work();
	        frontendDev.work();
	        backendDev.work();
	        QA.work();
	    }
	}