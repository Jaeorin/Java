package study_190215Mk2;

//질럿 생산
//클래스는 대문자로 시작, 클래스가 아니면 소문자로 시작
//오류는 나오지 않지만 가독성을 위한 합의
public class Gateway {
	//행위
	//함수명에 띄어쓰기가 필요한 부분에 대문자로 시작하는 것을 카멜 표기법이라 함
	//오류는 나오지 않지만 가독성을 위한 합의
	public Zealot makeZealot() {

		System.out.println("내 목숨을 아이어에!");
		return new Zealot();
	}
		
	public Dragoon makeDragoon() {

		System.out.println("내가 돌아왔다!");
		return new Dragoon();
	}

}

/*클래스의 첫 글자는 대문자로, 기타 함수의 첫 글자는 소문자로 합니다
 *또한 이름 중간에 띄어쓰기가 필요한 부분은 대신 띄어쓰는 다음 문장 첫 글자를 대문자로 합니다(카멜 표기)
 *실행에 별다른 지장은 주지 않지만 프로그래밍 중의 가독성 향상을 위함입니다
 */