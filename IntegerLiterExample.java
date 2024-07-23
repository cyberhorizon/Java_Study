//2진수 8진수 10진수 16진수
package ch02.sec02;

public class IntegerLiterExample {

	public static void main(String[] args) {
		int var=0b1010; //2진수는 0b 또는 0B로 시작되고 0과 1로 구성
        int var2=0306;	//8진수는	0으로 시작되고 0~7 숫자로 작성
        int var3=632;   //10진수는 소수점 없이 입력 범위는 0~9
        int var4=0x3b;  //16진수는 0x또는 0X로 시작하고 0~9 숫자나 a,b,c,d,e,f or A,B,C,D,E,F로 입력
        
        System.out.println("var:"+var);
        System.out.println("var2:"+var2);
        System.out.println("var3:"+var3);
        System.out.println("var4:"+var4);

	}

}
