package exception;

public class Custumex extends Exception{
	Custumex(){
		super("you are under age not allow to vote");
	}
	Custumex(String message){
		super(message);
	}
	

}
