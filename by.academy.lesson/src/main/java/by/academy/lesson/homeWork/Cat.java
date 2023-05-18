package by.academy.lesson.homeWork;

public class Cat {
	int age;
	String nickname;
	String color;
	double weight;
	int money;
	char initials;
	boolean isHomeAnimal;
	String firstname;
	int money2;

	public Cat() {
		super();

	}

	public Cat(String nickname, String color, int age, double weight) {
		super();
		this.age = age;
		this.nickname = nickname;
		this.color = color;
		this.weight = weight;
	}

	public void grow() {

		age = age + 1;

	}

	public void slep() {
		System.out.println("Кот " + nickname + " спит");
	}

	public void eat() {
		weight = weight + 1;
		System.out.println("Кот " + nickname + " ест , его вес теперь " + weight);

	}

	public void walk() {
		weight = weight - 1;
		System.out.println("Кот " + nickname + " гуляет , теперь его вес  " + weight);

	}

	public int getMoney() {
		return money;

	}

	public void setMoney(int money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean isHomeAnimal() {
		return isHomeAnimal;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	@Override
    public String toString() {
        return "nickname: " + nickname + ", color: " + color + ", weight: " + weight + ", age: " + age;

	}
	

}
