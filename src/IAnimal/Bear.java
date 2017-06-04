package IAnimal;

public class Bear extends Mammal  {
	
	public Bear(String Name, int Age){
		super();
		this.Name=Name;
		this.Age=Age;
	}
	@Override
	public void introduceYourSelf(){
		super.introduceYourSelf();
		System.out.println();
		System.out.println("I am a bear and i kill people! Run!");
	}
}
