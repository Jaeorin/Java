package study_190221Mk2SenseiEdition;

interface Remote {
	void onPower();
	void onOff();
	void onOne();
	void onTwo();
	void onThree();
}

abstract class RemoteAdapter implements Remote {
	public void onOne() {};
	public void onTwo() {};
	public void onThree() {};
}



public class RemoteTest extends RemoteAdapter{

	public static void main(String[] args) {
		
	}

	@Override
	public void onPower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		
	}


}
