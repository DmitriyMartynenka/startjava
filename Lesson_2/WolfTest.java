public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.sex = "female";
		wolf1.nickname = "Beast";
		wolf1.weight = 60;
		wolf1.age = 3;
		wolf1.color = "grey";

		System.out.println("Wolf information: sex - " + wolf1.sex + ", nickname - " + wolf1.nickname + 
			", weight - " + wolf1.weight + ", age - " + wolf1.age + ", color - " + wolf1.color);

		wolf1.go();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
	}	
}