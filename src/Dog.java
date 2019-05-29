
public class Dog {
	/* 
	 * getter methods:
	 * it is a method with return type other than void
	 * that will return the value of different attributes
	 * any parameters
	 * getter methods (9 times out of 10) they will not have 
	 * setter method :
	 * it is a method with return void that will set the 
	 * attribute based on the argument we pass in
	 * setter methods (9 times of 10 ) they will have at least one parameter
	 */
	private String breed;
	private String name;
	private int age;
	 
	public Dog() {
		
	}
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}
	public Dog(String breed, String name, int age) {
		this.breed=breed;
		this.name=name;
		this.age=age;
	}
	public String getBreed() {
		return this.breed;
	}
	public String getName() {
		return this.name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
