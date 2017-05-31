public class komputer {
	public static void main (String[] args) {
		
		System.out.println("===============================================================================");
		System.out.println("\t\t\t\tSPEKSIFIKASI KOMPUTER							   ");
		System.out.println("===============================================================================");
			mousegame ms = new mousegame(); //inheritance
            ms.tampilkan();
		
            keyboard ky = new keyboard(); 
            ky.data_keyboard();
		
            speaker sp = new speaker();
            sp.data_speaker();
		
            monitormodern mnm = new monitormodern(); //inheritance
            mnm.data_monitor();
			mnm.data_monitormodern();
		
            tegangan <String> tg = new tegangan<>(); //generik
            tg.settegangan("700");
            System.out.println("\tTegangan\t\t:" + tg.gettg_psu());
		
            komputer vga = new komputer(); //mengembalikan nilai
            vga.data_vga();
			System.out.println(vga.ddr());
                
		System.out.println("===============================================================================");

            isi i = new isi();  //penggunaan this
			i.isimerek("Banana");		
			System.out.println("\tMerek \t\t: "+i.merek);
			System.out.println("\tVersion \t: "+i.type);
                
            komputer nama = new komputer(); //menggunakan 2 parameter
			nama.namalengkap("\tRizky", " Gunardi");
		
            data_diri mhs = new data_diri(); //konstruktor
			System.out.println(mhs.kelas);
                
                
			System.out.println("===============================================================================");
			System.out.println("\t\t\t\tSPEKSIFIKASI LAPTOP 							   ");
			System.out.println("===============================================================================");
		
            monitorlaptop mnl = new monitorlaptop(); //SubKelas /Super kelas
			mnl.data_monitor();
		
            keyboardlaptop kyl = new keyboardlaptop(); //SubKelas /Super kelas
			kyl.data_keyboard();
		
                speakerlaptop spl = new speakerlaptop(); //SubKelas /Super kelas
		spl.data_speaker();
		
                versionlaptop vsl = new versionlaptop(); //menggunakan this
		vsl.ubah("Version 5.2.3.1");
		vsl.ubah("Version 5.2.3.1","Single");
                String na = null;
                
                po id = new po(na);
                id.data();
        
        
                System.out.println("===============================================================================");
		System.out.println("\t\t\t\tSPEKSIFIKASI MOBILE                                                    ");
		System.out.println("===============================================================================");
                
                mobile mb = new mobile();
                mb.setProsesor("Apple A10 Fusion Quad-core 2.34 GHz");
                System.out.println("\tProsesor\t\t : "+mb.getProsesor()); //Menggunakan Get Set
                
                mb.setRam("3GB");
                System.out.println("\tRAM\t\t\t : "+mb.getRam()); //Menggunakan Get Set
                
                mb.setKamera("Dual 12 MP");
                System.out.println("\tKamera\t\t\t : "+mb.getKamera()); //Menggunakan Get Set
                
                mb.setLayar("5.5 inch");
                System.out.println("\tLayar\t\t\t : "+mb.getLayar()); //Menggunakan Get Set
                
                mb.setOS("iOS 10.0.1");
                System.out.println("\tOS\t\t\t : "+mb.getOS()); //Menggunakan Get Set
                
                mb.setGpu("PowerVR Series7XT Plus");
                System.out.println("\tGPU\t\t\t : "+mb.getGpu()); //Menggunakan Get Set
				
		System.out.println("===============================================================================");
		System.out.println("\t\t\t\tSPEKSIFIKASI JAM PINTAR                                                    ");
		System.out.println("===============================================================================");
                
                Isijam jm = new Isijam(){}; //Menggunakan Interface dengan Abstract
                jm.Prosesor();
                jm.Ram();
                jm.OS();
                                
        } 
        
        
    //CLASS UNTUK SPESIFIKASI KOMPUTER
     
		private void namalengkap(String nama1, String nama2){
			System.out.println(nama1+nama2);
		}		
			
		private void data_vga(){
			System.out.println("\tMemori VGA\t\t: 2048 MB ");
		}
			private int ddr(){
				return 0;
			}
}

	class isi{
		String merek;
		String type;
		
			public void isimerek(String merek){
			this.merek = merek;
			}
		
			public isi(){
				this.type = "version 2.0";
			}
	}	
		
	class data_diri{
		String kelas;
		
		data_diri(){
			kelas = "\tProlan 11";
		}
	}
	
	class mouse{
		private String tombol,sensor;
		public int dpi;
		
		public void data_mouse(){
			tombol = "tombol kiri, tombol kanan, tombol tengah";
			sensor = "inframerah";
			dpi = 11000;
			
			System.out.println("\tTombol\t\t\t: "+tombol);
			System.out.println("\tSensor\t\t\t: "+sensor);
			System.out.println("\tDPI(sensitivitas mouse)\t: "+dpi+" dpi");
		}
	}
	
	class mousegame extends mouse{
		private String tombol;
		
		public void data_mouse(){
			tombol = "3 tombol tambahan di sisi kiri";
		}
		
		public void tampilkan(){
			data_mouse();
			super.data_mouse();
			System.out.println("\tMouse game\t\t: "+tombol);
		}
	}
		
	class keyboard{
		private String jm_tombol,ukuran;
		
		public void data_keyboard(){
			jm_tombol = "ada tombol khusus";
			ukuran = "keyboard mechanical";
			
			System.out.println("\tJumlah Keyboard\t\t: "+jm_tombol);
			System.out.println("\tUkuran Keyboard\t\t: "+ukuran);
		}
	
	}

	
	class speaker{
		private String tg_listrik;
		public int desibel;
		
		public void data_speaker(){
			tg_listrik = "350 watt";
			desibel = 35;
			
			System.out.println("\tTegangan Listrik\t: "+tg_listrik);
			System.out.println("\tIntensitas Suara\t: "+desibel+" db");
		}
	}	
	
	class monitor{
		private String ukuran;
		public int hertz;
		
		public void data_monitor(){
			ukuran = "31 inch";
			hertz = 240;
			
			System.out.println("\tUkuran Monitor\t\t: "+ukuran);
			System.out.println("\tRefresh Rate\t\t: "+hertz+" hertz");
		}
	}	
	
	class monitormodern extends monitor{
		
		public void data_monitormodern(){
			System.out.println("\tJenis Monitor\t\t: Monitor Plasma");
		}
		
	}
	

	//CLASS UNTUK SPESIFIKASI LAPTOP
	
	
	class monitorlaptop extends monitor{
		public void data_monitor(){
		super.data_monitor();
		}
	}
	
	class keyboardlaptop extends keyboard{
		public void data_keyboard(){
		super.data_keyboard();
		System.out.println("\tWarna Keyboard\t\t: RGB Backlight");
		}
	}
	
	class speakerlaptop extends speaker{
		public void data_speaker(){
			super.data_speaker();
		}
	}
	
	class versionlaptop{
		private String version;
		String type;
		
		void ubah(String version){
			this.version = version;
		}
		
		void ubah(String version, String type){
			this.version = version;
			this.type = type;
		}
	}

	class isidata{
		private String na;
				
			public isidata(String na){
				this.na = na;
			}
			
			public void data(){
				String na1 = "Pineapple";
				System.out.println("\tMerek\t\t\t: "+na1);
			}
	}

	class po extends isidata{

		public po(String na) {
			super(na);
			System.out.println(na);
		}  
	}