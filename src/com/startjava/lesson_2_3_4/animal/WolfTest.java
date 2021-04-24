package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.setSex("male");
		wolf1.setNickname("Beast");
		wolf1.setWeight(60);
		wolf1.setAge(6);
		wolf1.setColor("grey");

		System.out.println("Wolf information: sex - " + wolf1.getSex() + ", nickname - " + wolf1.getNickname() + 
				", weight - " + wolf1.getWeight() + ", age - " + wolf1.getAge() + ", color - " + wolf1.getColor());

		wolf1.go();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
	}	
}