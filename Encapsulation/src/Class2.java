
public class Class2 {

	private String name , surname ;
	private int age ;
	
	public Class2() {
		
	}
	
	public Class2(String name , String surname , int age){
		
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		
	}
	

	
	static void print(Class2 obj) {
		System.out.println("name :"+obj.getName()+"\n"+"Surname :"+obj.getSurname() +"\n"+"Age :"+obj.getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
