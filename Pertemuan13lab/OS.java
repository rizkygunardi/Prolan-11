public class OS <T> {
		private T win;
		
		public T getWin(){
			return win;
		}
		
		public void setWin(T win){
			this.win = win;
		}
		
		public static <T> void nama(T bgnama){
			System.out.println("\tNama Pendiri\t : "+bgnama);
		}
		
		public static <T> void umur(T bgumur){
			System.out.println("\tUmur\t\t\t : "+bgumur);
		}
	}