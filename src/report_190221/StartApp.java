package report_190221;

public class StartApp {
	
	public static void main(String[] args) {
		
		System.out.println("-----------���� ����-----------");
		System.out.println("");
		
		Zealot zealot1 = new Zealot();
		UserInterface.productUnit(zealot1);
		
		SiegeTank siegetank1 = new SiegeTank();
		UserInterface.productUnit(siegetank1);
		
		Hydralisk hydralisk1 = new Hydralisk();
		UserInterface.productUnit(hydralisk1);
		
		
		System.out.println("");
		System.out.println("-----------���� ���� Ȯ��-----------");
		System.out.println("");
		
		UserInterface.infomation(zealot1);
		UserInterface.infomation(siegetank1);
		UserInterface.infomation(hydralisk1);
		
		
		System.out.println("");
		System.out.println("-----------���� ���׷��̵�-----------");
		System.out.println("");
		
		UserInterface.infomation(zealot1);
		ProtossUnit.upgradeAttack();
		UserInterface.infomation(zealot1);
		ProtossUnit.upgradeArmor();
		UserInterface.infomation(zealot1);
		
		
		System.out.println("");
		System.out.println("-----------���� ����-----------");
		System.out.println("");
		
		siegetank1.combat(siegetank1, zealot1);
		siegetank1.combat(siegetank1, zealot1);
		siegetank1.combat(siegetank1, zealot1);
		siegetank1.combat(siegetank1, zealot1);
		siegetank1.combat(siegetank1, zealot1);
		siegetank1.combat(siegetank1, zealot1);
		
		siegetank1.combat(siegetank1, hydralisk1);
		hydralisk1.combat(hydralisk1, siegetank1);
		
		
		System.out.println("");
		System.out.println("-----------�߸��� ���-----------");
		System.out.println("");
		
		System.out.println("���� ����� ������ �õ��� ��");
		siegetank1.combat(siegetank1, zealot1);
		System.out.println("���� ������� ������ �õ��� ��");
		zealot1.combat(zealot1, siegetank1);
		
		Zealot zealot2 = new Zealot();
		UserInterface.productUnit(zealot2);
		Zealot zealot3 = new Zealot();
		UserInterface.productUnit(zealot3);
		
		System.out.println("�ڱ� �ڽſ��� ������ �õ��� ��");
		zealot2.combat(zealot2, zealot2);
		System.out.println("���� �������� ������ �õ��� ��");
		zealot2.combat(zealot2, zealot3);		
	}
	
}
