package study_190312_mk2;


class Animal<Type> {
	Type name;
	Type address;
	
}


public class GenericEx01 {

	public static void main(String[] args) {

		Animal<String> animal = new Animal<String>();
		
		animal.name = "코스";
		animal.address = "부산";
		
		System.out.println(animal.name);
		System.out.println(animal.address);
		
		Animal<Integer> animal2 = new Animal<Integer>();
		
		animal2.name = 1;
		animal2.address = 2;
		
		System.out.println(animal2.name);
		System.out.println(animal2.address);	

	}

}
