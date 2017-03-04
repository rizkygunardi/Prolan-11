import java.util.Scanner;

public class InOut4{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama;
		char jeniskelamin;
		int tinggibadan;
		boolean menikah;
		
		System.out.print("Masukkan Nama : ");
			nama = input.nextLine();
		System.out.print("Masukkan Jenis Kelamin : ");
			jeniskelamin = input.next().charAt(0);
		System.out.print("Masukkan Tinggi Badan : ");
			tinggibadan = input.nextInt();
		System.out.print("Masukkan Status Menikah : ");
			menikah = input.nextBoolean();
	}
}