public class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name= name;
		this.age = age;
	}
	public Person(Person previousDetails){
		this.name= previousDetails.name;
		this.age = previousDetails.age;
	}
	public void display(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}	
	public static void main(String[] args){
		Person person1 = new Person("Rishabh" , 28);
		System.out.println("The details of the person1 are : ");
		person1.display();
		Person person2 = new Person(person1);
		System.out.println("The details of the person2(copy of person1) are : ");
		person2.display();
		
	}	
}