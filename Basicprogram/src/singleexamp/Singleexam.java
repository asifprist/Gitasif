package singleexamp;

public class Singleexam {
	
	private static Singleexam sr;
	private Singleexam() {
		if(sr!=null) {
			throw new RuntimeException();
		}
	}
	
	public static Singleexam getvalue() {
		if(sr==null) {
			synchronized (Singleexam.class) {
				if(sr==null) {
					sr=new Singleexam();
					
				}
				
			}
		}
		return sr;
	}

}
