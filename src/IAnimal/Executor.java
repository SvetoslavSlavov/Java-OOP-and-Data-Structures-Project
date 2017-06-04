package IAnimal;

public class Executor implements IAnimal {

	public void AnimalType() {
		System.out.print("This is the type!");
		
	}

	public void AnimalSpecy() {
		System.out.print("This is the specy!");
		
	}

	@Override
	public void AnimalHabitat() {
		System.out.print("This is the habitat!");
		
	}
	
}
