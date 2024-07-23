//실수
//double,float 함수가 실수에 해당
//double 허용범위:1.4*10(-45) ~ 3.4*10(38)
//float 허용범위:4.9*10(-324)~1.8*(108)
package ch02.sec04;

public class Floatdoubleexample {
    //정밀도 확인
	public static void main(String[] args) {
	float var1=0.1234567890f;
	double var=0.1234567890f;
	
	System.out.println("var1:"+var1);
	System.out.println("var:"+var);
    
	//10의 거듭제곱 리터럴
    double var3=3e6;
    double var4=4e7;
    double var5=2e-3;
    
    System.out.println("var3:"+var3);
    System.out.println("var4:"+var4);
    System.out.println("var5:"+var5);
	}

}
