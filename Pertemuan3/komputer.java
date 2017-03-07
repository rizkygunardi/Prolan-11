public class komputer {
	public String mouse;
		   String keyboard;
		   String monitor;
		   String speaker;
		   
	public void ngetik (){
		System.out.println ("fungsinya ngetik");
	}
	
	public void internet (){
		System.out.println ("fungsinya internet");
	}
	
	public void game (){
		System.out.println ("fungsinya main game");
	}
	
	public static void main (String[] args) {
			komputer rog = new komputer();
			
			rog.mouse = "razer";
			rog.ngetik();
			rog.keyboard = "logitech";
			rog.internet();
			rog.speaker = "dolby";
			rog.game();
	}
}