//byte 허용범위를 초과한 값을 입력할시 나타나는 오류 예시
package ch02.sec02;

public class byteerrorexample {

	public static void main(String[] args) {
       /* byte var=-128;
        byte var2=-30;
        byte var3=0;
        byte var4=128;
        byte var5=67;
        byte var6=128;
        
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        */
          
         /* 실행하면 아래와 같은 오류코드가 뜨는데
          * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	        Type mismatch: cannot convert from int to byte
	        Type mismatch: cannot convert from int to byte
	        byte의 허용범위는 -128~127까지다 그런데
            10번과 12번 항목에서 그 허용범위를 넘어선 128을 입력했기 때문에 실행하면 오류가 난다 때문에 저 값들을 수정해주면 오류가 나지 않고 정상적으로 값이 출력된다
         */
		byte var=-128;
        byte var2=-30;
        byte var3=0;
        byte var4=120;
        byte var5=67;
        byte var6=115;
        
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        
        
	}

}
