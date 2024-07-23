package ch02.sec01;

public class Variableinitializationexample {

	public static void main(String[] args) {
		//변수 value 설정
		int hour= 3;
		int minutes =8;
		System.out.println(hour +"시간" + minutes +"분");
		int totalMinutes = (hour*60) + minutes;
		
		System.out.println("총"+totalMinutes+"분");
		

	}

}
