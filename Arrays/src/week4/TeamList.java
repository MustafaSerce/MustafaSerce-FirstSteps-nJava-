package week4;

public class TeamList {
	String[] list;
	int numberofelements;
	int limit;
	
	public TeamList(int listcapacity) {
		
		list = new String[listcapacity];
		numberofelements = 0;
		limit = listcapacity;
	}
	
	public void add(String team) {
		
		if(numberofelements < limit ) {
		
			list[numberofelements] = team;
			numberofelements++;
		}
		else
		{
			System.out.println("there is no empty space");
		}
	}
	public void add(String team,int index) {
		
		for(int i = numberofelements -1; i >= index ; i--) {
			
			list[i+1] = list[i];
			
		}
		
		list[index] =team;
		numberofelements++;
	}
	public void delete(int index) {
		
		for (int i = index; i < numberofelements -1 ; i++) {
			
			list[i] = list[i+1];
		}
		numberofelements--;
	}
	
	public void write() {
		
		for (int i = 0 ; i < numberofelements ; i++) {
			
			System.out.println(list[i]);
		}
	}
}
