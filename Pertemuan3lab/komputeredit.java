public class komputeredit {
	public String mouse;
	public String keyboard;
	public String speaker;
	public String monitor;
	private byte tinggi;
	private byte tegangan;
	
		 		 	   
	public void ngetik (){
		System.out.println ("|  Bisa untuk Mengetik     |");
	}
	
	public void internet (){
		System.out.println ("|  Bisa untuk Internet     |");
	}
	
	public void game (){
		System.out.println ("|  Bisa untuk Bermain Game |");
	}
	
	public void video (){
		System.out.println ("|  Bisa untuk Nonton Film  |");
	}
	
	public static void main (String[] args) {
			System.out.println("============================");
			String nama ="|   Fungsi Dari Komputer   |";
			System.out.println(nama);
			System.out.println("|==========================|");
			
			komputeredit standar = new komputeredit();
			
			standar.mouse = "|Logitech         |";
			standar.keyboard = "Logitech";
			standar.speaker = "dolby";
			standar.tinggi = 70;
			standar.tegangan = 100;
			standar.ngetik();
			standar.video();
			standar.internet();
			standar.game();
			System.out.println("============================");
	}
}