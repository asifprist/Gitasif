package CloudTech;

public class LambdaExpression {

	public static void main(String[] args) {
		Drawable d=new Drawable() {

			@Override
			public void drawable(int a) {
				System.out.println(a);
				
			}
			
		};
		d.drawable(16);
		
		Drawable r=(int a)->{System.out.println(a);};
		r.drawable(6555);

	}

}
