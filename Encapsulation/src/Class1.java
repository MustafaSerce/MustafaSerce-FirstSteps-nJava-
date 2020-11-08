
public class Class1 {

	public static void main(String[] args) {
		Class2 p1 = new Class2("Alex","Sad",22);//Constructor method with parameters
		Class2 p2 = new Class2();//Default constructor method
		Class2 p3 = new Class2();//Default constructor method
		p2.setName("July");
		p2.setSurname("Monday");
		p2.setAge(18);
		p3.setName("Mustafa");
		p3.setSurname("Serçe");
		p3.setAge(23);
		
		
		Class2.print(p1);
		System.out.println();
		Class2.print(p2);
		System.out.println();
		Class2.print(p3);
			

	}

}
