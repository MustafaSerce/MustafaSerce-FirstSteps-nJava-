import java.util.Scanner;



public class firststeps {

	public static void main(String[] args) {
		//System.out.println("Hello , this my first code in java ! ");
		//System.out.print("if we are use print");
		//System.out.print(" we are write to same row");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int x = 1, y=2 ,z=3 ;
		String name;
		//System.out.print(name +"  "+x);
		
		System.out.print("name : ");
		name = scan.next();
		if(name.equals("A")) {
			System.out.println(x);
		}
		else if (name.equals("B")) {
			System.out.println(y);
		}
		else if(name.equals("C")) {
			System.out.println(z);
		}
		else {
			System.out.println("Nothing");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		int arr[] = {2,5,7,9,11,16,20};
		for (int i : arr) {
			if(i%2==0 ) {
				System.out.println(i + " divides in two");
		}
		else {
			System.out.println(i + "  not divides in two ");
		}
		
			
		}
	}


	

}
