package study_190220;

//질럿 뽑아주는 것
public class Gateway {

	//행위
	public Zealot makeZealot() {
		return new Zealot();
	}
	
	//행위
	public Dragoon makeDragoon() {
		return new Dragoon();
	}
	
	//행위
	public DarkTempler makeDarkTempler() {
		return new DarkTempler();
	}
	
}
