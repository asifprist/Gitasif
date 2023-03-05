package singletons;

public class Singletoneclass {
	private static volatile Singletoneclass stc;
	
	private Singletoneclass() {
		if(stc!=null) {
			
			}
		
	}
	
	
	public static Singletoneclass getsingle() {
		if(stc==null) {
			synchronized (Singletoneclass.class) {
				if(stc==null) {
					stc=new Singletoneclass();
					
				}
				
			}
		}
		return stc;
	}
	

}
