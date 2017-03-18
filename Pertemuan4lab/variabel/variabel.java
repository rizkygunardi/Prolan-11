public class variabel {
	private int a;
	private boolean menikah;
	private char nama;
	public static final String JUDUL = "Belajar Java Yuks";
	public static String judul12 = "Belajar Java Yuks";
	
	public static void main(String[] args){
		
		variabel var = new variabel();
		final int a = 12;
		var.a = 1;
		//a = 11; tidak bisa dilakukan
		double aa, b, c;
		String nama = "nama saya";
		byte bb = 1, B = 2;
		System.out.println(JUDUL);
		System.out.println(judul12);
	
	}
	
	public void tesvariabel(){
		System.out.println(a);
		System.out.println(menikah);
		System.out.println(JUDUL);
		System.out.println(judul12);
	
	}

	class aksesvariabelstatic{
		public void aksesvariabelstatic(){
			System.out.println(variabel.JUDUL);
			//variabel.JUDUL = "Belajar hal lain"
		}
	
	}
}