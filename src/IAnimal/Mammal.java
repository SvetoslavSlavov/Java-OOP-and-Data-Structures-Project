package IAnimal;

abstract class Mammal {
	protected String Name;
	protected int Age;
	
	public String Name(){
		return this.Name;
	}
	
	public void GetName(String Name){
		this.Name=Name;
	}
	
	public String Age(){
		return this.Name;
	}
	
	public void GetAge(int Age){
		this.Age=Age;
	}
	
	//public void introduceYourself(){
	//	System.out.print("My name is: " + Name + "I am: "+ Age);
	//}

	public void introduceYourSelf() {
		// TODO Auto-generated method stub
		System.out.print("My name is: " + Name + "I am: "+ Age);
	}
}
