package spesifikasi;

public class vr {  
		
		public <T> void Sensor (T sensor){
			System.out.println("\tSensors\t\t\t : "+sensor);
		}
		
		public <T> void Weight (T weight){
			System.out.println("\tWeight\t\t\t : "+weight);
		}
		
		public <T,N> void FOVColor (T x, N y){
			System.out.println("\tFOV\t\t\t : "+x);
			System.out.println("\tWarna\t\t\t : "+y);
		}
	}