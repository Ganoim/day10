package day10;

public class Ex04_Class {
	
		/* Class안에서 만들 수 있는 것 3가지
		 * 
		 * 1. 필드 - 타입과 이름
		 * 2. 생성자(Constructor) - 만들어 주지 않으면 자동으로 만들어짐(모든 클래스의 있다)
		 * 3. 메소드 - 기능
		 * 
		 * */
	
//	1. 필드: 데이터를 저장하는 공간
	int age; //필드는 파란색 글자
//	2. 생성자: 생성자의 이름은 클래스 이름과 동일하게(생성자는 클래스의 이름하고 같아야한다 )
//			 객체를 만들 때 따라야 하는 규칙
//	기본생성자
	public Ex04_Class() {
		
	}
// 3. 메소드: 특정한 기능을 정의
// - 리턴값이 없는 메소드
	void myName(){
		
	}
//	- 리턴값이 있는 메소드
	int myAge() {
		return 10; //int형이면 숫자, String이면 문자가 들어가야한다
	}
	
		
		
		

}
