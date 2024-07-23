//연산식에서 자동 타입 변환
package ch02.sec09;

public class OperationPromotionexample {

	public static void main(String[] args) {
		int result=10+20;
		System.out.println("result:"+result); //컴파일 단계에서 연산
		
		byte v1=10;
		byte v2=40;                   
		int result1=10+40;     //int보다 작은 byte 타입 변수가 피연산자로 사용되면 int 타입으로 변환 후 연산
		System.out.println("result1:"+result1); 
		
		byte v3=10;
		byte v4=100;
		long v5=1000L;
		long result2=v3+v4+v5; //long 타입으로 변환 후 연산
		System.out.println("result2:"+result2);  
		
		char v6='A';
		char v7=1;
		int result3= v6+v7; //int 타입변환 후 연산
		System.out.println("result3:"+result3);
		System.out.println("result3:"+(char)result3); 
		
		int v8=10;
		int result4=v8/4;  //정수 연산의 계산 결과는 정수
		System.out.println("result4:"+result4);  
		
		int v9=10;
	    double result5=v9/4.0; //double 타입으로 변환후 연산
	    System.out.println("result5:"+result5); 
	    
	    int v10=1;
	    int v11=2;
	    double result6=(double)v10/v11;  //double 타입으로 변환후 연산
	    System.out.println("result6:"+result6);
	    
	    float c1=3f;
	    double c2=48;
	    float c3=7f;
	    double result7=c1*c2/c3;
		System.out.println("result7:"+result7); //피연산자중 하나라도 double 연산자라면 float이 아닌 double로 변환되어 계산된다
		
		float a1=48f;
		float a2=98f;
		float a3=32f;
		float result8=a1*a2/a3; //같은 float 연산자면 float 연산자로 그대로 연산
		System.out.println("result8:"+result8);
		
	    

	}

}
