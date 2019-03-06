package study_190306;

import java.util.ArrayList;
import java.util.List;

public class CafeApp {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Barista barista = new Barista();
		MenuItem m1 = new MenuItem("Americano", 1500);
		MenuItem m2 = new MenuItem("CafeLatte", 2000);
		MenuItem m3 = new MenuItem("Makati", 2500);
		MenuItem m4 = new MenuItem("CafeMocha", 3000);
		List<MenuItem> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		Menu menu = new Menu(list);
		customer.order("Americano", menu, barista);
	}
}

class Customer {
	public void order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem = menu.choose(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
		System.out.println("커피를 받았습니다");
		System.out.println("커피이름 : " + coffee.getName());
		System.out.println("커피가격 : " + coffee.getPrice());
	}
}

class Coffee{
	private String name;
	private int price;
	public Coffee(MenuItem menuItem) {	
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class MenuItem {
	private String name;
	private int price;
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class Menu {
	private List<MenuItem> items;
	public Menu(List<MenuItem> items) {
		this.items = items;
	}
	public MenuItem choose(String menuName) {
		for(int i=0; i<items.size(); i++) {
			if(items.get(i).getName().equals(menuName)) {
				return items.get(i);
			}
		}
		return null;
	}
}

class Barista {
	public Coffee makeCoffee(MenuItem menuItem) {
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}
