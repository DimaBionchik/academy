package by.academy.lesson.homeWork;

public class Application {
	public static void main(String[] args) {

		Cat cat1 = new Cat();

		System.out.println(cat1);
		Cat cat2 = new Cat("Барсик ", " серый ", 5, 8.0);
		System.out.println(cat2);
		cat1.eat();
		System.out.println(cat1);
		cat2.slep();
		System.out.println(cat2);
		cat2.walk();
		System.out.println(cat2);
		cat2.walk();
		System.out.println(cat2);
		cat2.setMoney(100);
		System.out.println("У кота есть  по имени  " + cat2.nickname + " , есть  " + cat2.getMoney() + " денег");
		cat2.setInitials('B');
		System.out.println("У кота есть инициалы " + cat2.getInitials());
		cat2.setHomeAnimal(true);
		System.out.println("Кот " + cat2.nickname + " домашний ?  " + cat2.isHomeAnimal());
		cat1.grow();
		System.out.println(cat1);
		cat1.grow();
		System.out.println(cat1);
		cat1.grow();
		System.out.println(cat1);

	}

}
