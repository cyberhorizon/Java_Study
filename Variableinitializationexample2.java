package ch02.sec01;

public class Variableinitializationexample2 {

	public static void main(String[] args) {
		int x =3;
		int y =9;
		
		System.out.println("x:"+x+",y:"+y);
		
		int temp = x;
		
		x=y;
		y=temp;
		System.out.println("x:"+x+",y:"+y);

	}

}
