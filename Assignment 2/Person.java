public class Person
{	
	int age;
	int height;
	int weight;

	public Person(int x, int y, int z)
	{
	age=x;
	height=y;
	weight=z;
	}

	public void displayPersonInfo(){
	System.out.println("Person Age: " + age);
	System.out.println("Person height: " + height);
	System.out.println("Person weight: " + weight);

	}
	public static void main(String[] args){
	Person person1 = new Person(55, 80, 178);

	person1.displayPersonInfo();

	}
}