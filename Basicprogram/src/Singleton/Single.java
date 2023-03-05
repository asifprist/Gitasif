package Singleton;

public class Single {
	
	private static volatile Single s;
	
	private Single() {
		if(s!=null) {
			throw new RuntimeException("get your object");
		}
	}
     public static Single getSingle() {
    	 if(s==null) {
    		 synchronized (Single.class) {
    			 if(s==null) {
    				 s=new Single();
    			 }
				
			}
    	 }
    		 
    	 return s;
    	 
     }
}
