package week4;

public class mainClass {

	public static void main(String[] args) {
		
		TeamList list1 = new TeamList(5);
		list1.add("Galatasaray SK");
		list1.add("Fenerbahçe SK");
		list1.add("Beşiktaş SK");
		list1.add("Tranbzon SK");
		list1.add("Konya SK");
		list1.delete(1);
		list1.add("Anadolu SK",1);
	
		list1.write();
		

	}

}
