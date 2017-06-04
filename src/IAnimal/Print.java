package IAnimal;

import java.util.ArrayList;

public class Print extends  Mammal{
	public ArrayList c;
	public String Name;
	public int Age;

	
	Print(String Name,int Age,ArrayList c){
		this.Name=Name;
		this.Age=Age;
		this.c=c;
	}
	
	public void printCollection(){
		for(int i = 0;i<c.size();i++){
			System.out.print(Name+" "+Age+" ");
		}
	}
}
