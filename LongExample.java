//int 허용벙위를 초과한 값은 어떻게 해야하는지에 관한것
//int 변수 허용범위:-2,147,483,648~2,147,483,648
package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		/*int var=10;
		int var2=30;
		
		long var3=10000000000000;
		iong var4=10000000000000;
		
		System.out.println("int var:"+var);
		System.out.println("int var:"+var2);
		System.out.println("int var:"+var3);
		System.out.println("int var:"+var4);
		출력하면 int의 허용범위값 밖이라는 오류가 나오는데 그럴때는 값 뒤에 L이나 l를 입력해서 Long 타입 값이라는걸 알려주면 정상적으로 츌력
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The literal 10000000000000 of type int is out of range 
			*/
		int a=10;
		int b=30;
		
		long c=10000000000000L;
		long d=10000000000000L;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
}

