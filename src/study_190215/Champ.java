package study_190215;

public class Champ {
	
	//�ε� - �ʱ�ȭ(������) = constructor

	public Champ(String name, String type, String spell, int armor, int mshield, int attack, int st, int mp) {

		this.name = name; //���� name : �Ű�����
		this.type = type;
		this.spell = spell;
		this.armor = armor;
		this.mshield = mshield;
		this.attack = attack;
		this.st = st;
		this.mp = mp;
		
		//this : �ڱⰴü, �ڱ� class�� ���� �������ش�
		//method ���ο� �ִ� ���� : ��������
		
	}
	
	String name; // �ɸ��͸�
	String type; // �ϻ���, ������, ����, ������, ��Ŀ
	String spell; //��üȭ, ����, ��ȭ, ����, Ż��, ��Ÿ
	int armor; //����
	int mshield; //�������׷�
	int attack; //���ݷ�
	int st; //ü��
	int mp; //����
	
}
