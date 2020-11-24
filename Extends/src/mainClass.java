
public class mainClass {

	public static void main(String[] args) {
		
		kadýn k = new kadýn("Aysel",20,'K');
		erkek e = new erkek("Mert",22,'E');
		Cocuk c = new Cocuk("Mehmet",5);
		
		c.KendiniTanit();
		c.SesVer();
		
		k.KendiniTanit();
		k.SesVer();
		
		e.KendiniTanit();
		e.SesVer();

	}

}