import java.util.Scanner;

public class minmax {
    
    public int N, min, max, keluar;
    public int[] ar = new int[200];
    public Scanner scan = new Scanner(System.in);
                
    public void inputan(){
	System.out.print("Masukkan Banyaknya Jumlah Data : ");
        N = scan.nextInt();
	System.out.print("Pilihlah karakter A atau B : ");
	char minmax = scan.next().charAt(0);
			 
	bil();

	switch(minmax){
            case 'A':
                karakterA();
				System.out.println("-----------------------------------");
				System.out.println("Nilai Terkecil :"+min);
				System.out.println("Kemunculan Nilai Terkecil :"+keluar);
            break;
				
            case 'B':
				karakterB();
				System.out.println("-----------------------------------");
				System.out.println("Nilai Terbesar :"+max);
				System.out.println("Kemunculan Nilai Terbesar :"+keluar);
			break;
				
            default:
		System.out.println("Salah Menginputan data");
	}  
}

    //proses memasukkan angka
        public void bil(){	
            for(int i=0; i <N; i++){	
		System.out.print("Masukkan data : ");
		ar[i]=scan.nextInt();
            }
        }
			  
    //bil min
	public void karakterA(){
            min=ar[0];
            for(int i = 0; i < N; i++){
                if(min>ar[i]){
		   min = ar[i];
		}
            }
			
			
        //cek banyaknya min
            for(int i = 0; i < N; i++){
                if(ar[i]==min){
                    keluar+=1;
                }
            }
	}
		
		
    //bil max
	void karakterB(){
            max=ar[0];
            for(int i = 0; i < N; i++){
            	if(max<ar[i]){
                    max = ar[i];
		}
            }
		
	//cek banyaknya max
            for(int i = 0; i < N; i++){
		if(ar[i]==max){
                    keluar+=1;
		}
            }
        }

    public static void main(String[] args){
        minmax s =new minmax();   
        s.inputan();
    }
}