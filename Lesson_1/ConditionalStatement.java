public class ConditionalStatement {
	public static void main(String[] args) {
	int age = 15;
	if (age > 20) {
		System.out.println("Верните молодость!");
	}
	boolean isMan = true;
	if (isMan == true) {
		System.out.println("Я мужик");
	}
	if (isMan !=true) {
		System.out.println ("Я благородная женщина");
	}
	float height = 1.76f;
	if (height < 1.8) {
		System.out.println("Хотелось бы побольше подрасти");
	} else {
		System.out.println("Неплохо так вымахал");
	}
	char firstNameSymbol = 'D';
	if (firstNameSymbol == 'M') {
		System.out.println("Возможные имена: Марина, Максим, Мария и т.д.");
	} else if (firstNameSymbol == 'I') {
		System.out.println("Возможные имена: Игорь, Ирина, Инга, Иннокентий и т.д.");
	} else {
		System.out.println("Ваше имя начинается не на М и не на букву И");
	}
	}
}