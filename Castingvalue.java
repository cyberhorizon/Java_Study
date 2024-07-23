//강제타입변환
/*
 * int는 byte보다 허용범위가 커서 자동타입변환이 불가능하고 강제타입변환을 해야한다
 * 
 * long은 int보다 허용범위가 커서 자동타입변환이 불가능하고 int 캐스팅을 해서 강제 변환을 해야한다
   300을 갖는 long 변수는 8byte중 끝4byte로 300을 표현할 수 있고 int타입으로 강제 변횐하면
   앞4byte는 버려지고 끝 4byte만 int에 그대로 유지되므로 300이 그대로 유지된다 
   
   int는 char보다 허용범위가 커서 int는 char타입으로 자동변환되지 않고 char 캐스팅을 해서 강제 변환을 시켜야한다
   주의할점은 char의 허용범위인 0~65535 사이의 값만 원래 값을 유지한다

   실수타입(float,double)은 정수타입(byte,short,int,long)보다 항상 큰 허용범위를 가지고 대상 정수 타입으로 캐스팅해서 강제 변환을
   시켜야 한다 이 경우 소수점 이하 부분은 버려지지 않고,정수 부분만 저장된다  
      */
package ch02.sec07;

public class Castingvalue {

	public static void main(String[] args) {
		int var1=10;
		byte var2=(byte) var1;
		System.out.println(var2); //강제 타입 변환 후에 10이 그대로 유지
        
		long var3=300;
		int var4=(int)var3;
		System.out.println(var3); //강제 타입 변환 이후 300이 그대로 유지
        
		int var5=65;
		char var6=(char)var5;
		System.out.println(var6); //A 출력
		
		double var7=70;
		int var8=(int)var7;
		System.out.println(var7); //70.0출력
		
	}

}
