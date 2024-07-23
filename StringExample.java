//문자열 타입
package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		//작은따옴표로(')감싼 한개의 문자는 char 타입이지만 큰따옴표로(")감싼 여러개의 문자들은 유니코드로 변환되지 않는다
		//char v1="g"
  		//char v1="양고기" 이렇게 작성하면 오류가 발생한다
		//큰따옴표로(")감싼 문자들을 문자열이라고 부르는데 문자열을 변수에 저장하고 싶으면 String 타입을 이용해야 한다
        String name="hong gil dong";
        String job="programmer";
        System.out.println(name);
        System.out.println(job);
        
        String str="i am learning a \"java.\"";
        System.out.println(str);
        
        str="number\tname\tjob";
        
        System.out.println("i am\n");
        System.out.println("learning\n");
        System.out.println("a java.\n");
	}

}
