
public class kadın extends insan {
	
	char Cinsiyet;
	
	public kadın(String isim , int yas , char Cinsiyet) {
		super(isim,yas);
		this.Cinsiyet = Cinsiyet;
		
		
	}
	
	@Override
	public void KendiniTanit() {
		super.KendiniTanit();
		
		
	}
	
	@Override
	public void SesVer() {
		System.out.println("Hi ! ");
	}
 
}
