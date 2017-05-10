import java.util.Scanner;
public class Calculatormain{

	public static void main(String[] args){
		double operan1, operan2;
		Calculator cal = new proses();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai 1 : ");
		operan1 = input.nextDouble();
		System.out.print("Masukkan Nilai 2 : ");
		operan2 = input.nextDouble();
		
		System.out.println("Hasil Pertambahan adalah:" + cal.hasilTambah(operan1, operan2));
		System.out.println("Hasil Pengurangan adalah:" + cal.hasilKurang(operan1, operan2));
		System.out.println("Hasil Perkalian adalah:" + cal.hasilKali(operan1, operan2));
		System.out.println("Hasil Pembagian adalah:" + cal.hasilBagi(operan1, operan2));
	}

}