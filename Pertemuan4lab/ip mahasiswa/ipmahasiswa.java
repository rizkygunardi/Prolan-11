import java.util.Scanner;

public class ipmahasiswa {
	
	public static void main(String[] args){
		ipmahasiswa mhs = new ipmahasiswa();
		
		Scanner input = new Scanner(System.in);
		float nilaiip = 0, jumlah = 0,nilairatarata = 0;
		int datamhs = 0, lulus = 0, gagal = 0;
		boolean keluar = false;
		
		System.out.println("\n\t======================================");
		System.out.println("\t          IPK MAHASISWA           ");
		System.out.println("\n\t======================================");
		System.out.print("\tMasukkan Jumlah Ip \t: ");
		
		nilaiip = input.nextFloat();
			while(nilaiip !=- 999){
				if(mhs.isWithinRange(nilaiip,0,4) == 1){
					datamhs++;
					if(nilaiip>=2.75){
						lulus++;
					}else{
						gagal++;
					}
						jumlah += nilaiip;
				}
					System.out.print("\tMasukkan Jumlah Ip \t: ");
					nilaiip = input.nextFloat();
							
			}
			nilairatarata = jumlah/datamhs;
			System.out.println("\n\t-------------------------------------");
			System.out.println("\n\tJumlah Mahasiswa \t   : "+datamhs);
			System.out.println("\tMahasiswa yang lulus \t   : "+lulus);
			System.out.println("\tMahasiswa yang tidak lulus : "+gagal);
			System.out.println("\tRata-Rata ipk \t\t   : "+nilairatarata);
			System.out.println("\t--------------------------------------");
	}
	
		public int isWithinRange(float x, int min, int max){
			if(x >= min && x <= max){
				return 1;
				}
			else{
				return 0;
				}
		}
}