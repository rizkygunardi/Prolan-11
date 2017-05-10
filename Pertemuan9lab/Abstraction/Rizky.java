public class Rizky extends siswa{

    @Override
	protected void Data(){
		System.out.println("Nama : Rizky Gunardi");
		System.out.println("Nim	 : 10115104");
	}
			
    @Override
	protected void Kuliah(){
		System.out.println("Minimal Nilai dapat C");
	}
			
    @Override
	protected void Lulus(){
		System.out.println("Harus Lulus pada waktunya");
	}
			
    @Override
	protected void tdkLulus(){
		System.out.println("Harus LULUS");
	}
}