/*x==10 x의 값은 10인가?
  x!=10 x의 값은 10이 아닌가?
  x>20  x의 값은 20보다 큰가?
  0<x && x<20x의 값이 0보다 작고 20보다 큰가?
  x<0''x>200 x의 값이 0보다 작고 200보다 큰가
 */
package ch02.sec05;

public class booleanexample {

	public static void main(String[] args) {
		boolean stop=true;
		if(stop) {
			System.out.println("중지합니다");
		}else{
			System.out.println("STOP");
			}
		int x=10;
		boolean result= (x==10);//변수 x의 값이 10인가?
		boolean result2= (x!=10);//=! 변수 x의 값이 10이 아닌가?
        System.out.println("boolean:"+result);
        System.out.println("boolean:"+result2);
}
}