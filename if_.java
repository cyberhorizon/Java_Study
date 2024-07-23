package 혼자서해보기;
import java.util.Scanner;
public class if_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요!");
		String strX = scanner.nextLine();
	    int a=75;
	    System.out.println("두번째 값을 입력하세요!");
	    String stry = scanner.nextLine();
	    Scanner scanner2 = new Scanner(System.in);
	    int b=550;
	    
	    if(a<48) {
	    	System.out.println("값이 작아요");
	    }else{
	    	System.out.println("값이 커요");
	    }
	    if(b>500) {
	    	System.out.println("값이 커요");
	    }else{
	    	System.out.println("값이 작아요");
	    }
	}
	
	}


