//흐름재어문은 실행흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는것이다
//제어문 블록이 실행 완료된 경우 다시 제어문의 처음으로 돌아갈지 아니면 제어문 블록을 빠져나와 정상적으로 이어나갈지는 어떤 제어문을 사용하느냐에 따라서 달려있다
//조건문일 경유 정상 흐름으로 돌아오지만 반목문일 경우 처음으로 되돌아가 반복 실행을 하는데 이걸 루핑이라고 하고 제어문 블록 내부에는 다른 제어문을 넣는것도 가능하다
//조건문:if,switch 반복문:for,while,do-while
package 반복문;

public class ifexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x=80;
        
        if(x<=90) {
        	System.out.println("점수가 낮다");
        	System.out.println("보충수업 받아라");
        }
       
        if(x>=90) {
        	System.out.println("점수가 높다");
            System.out.println("합격이다");//if문이랑 상관없는 실행문???
                                        //18라인에 중괄호가 없으면 19번 라인까지 영향을 줘서 if절이랑 상관이 없는 코드까지 실행이 된다
                                        
        
	}

}
}