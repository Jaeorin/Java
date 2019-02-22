package report_190221;

public class StartApp {
	
	public static void main(String[] args) {
		
		System.out.println("-----------유닛 생성-----------");
		System.out.println("");
		
		Zealot zealot1 = new Zealot();
		UserInterface.productUnit(zealot1);
		
		SiegeTank siegetank1 = new SiegeTank();
		UserInterface.productUnit(siegetank1);
		
		Hydralisk hydralisk1 = new Hydralisk();
		UserInterface.productUnit(hydralisk1);
		
		
		System.out.println("");
		System.out.println("-----------유닛 정보 확인-----------");
		System.out.println("");
		
		UserInterface.infomation(zealot1);
		UserInterface.infomation(siegetank1);
		UserInterface.infomation(hydralisk1);
		
		
		System.out.println("");
		System.out.println("-----------유닛 업그레이드-----------");
		System.out.println("");
		
		UserInterface.infomation(zealot1);
		ProtossUnit.upgradeAttack();
		UserInterface.infomation(zealot1);
		ProtossUnit.upgradeArmor();
		UserInterface.infomation(zealot1);
		
		
		System.out.println("");
		System.out.println("-----------유닛 공격-----------");
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
		System.out.println("-----------잘못된 명령-----------");
		System.out.println("");
		
		System.out.println("죽인 대상을 공격을 시도할 때");
		siegetank1.combat(siegetank1, zealot1);
		System.out.println("죽은 대상으로 공격을 시도할 때");
		zealot1.combat(zealot1, siegetank1);
		
		Zealot zealot2 = new Zealot();
		UserInterface.productUnit(zealot2);
		Zealot zealot3 = new Zealot();
		UserInterface.productUnit(zealot3);
		
		System.out.println("자기 자신에게 공격을 시도할 때");
		zealot2.combat(zealot2, zealot2);
		System.out.println("같은 종족에게 공격을 시도할 때");
		zealot2.combat(zealot2, zealot3);		
	}
	
}
