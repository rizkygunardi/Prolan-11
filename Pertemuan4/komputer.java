public class komputer {
		public static void main (String[] args) {
				mouse ms = new mouse();
				keyboard ky = new keyboard();
				speaker sp = new speaker();
				monitor mn = new monitor();
				tegangan tg = new tegangan();
				komputer vga = new komputer();
				komputer nama = new komputer();
				isi i = new isi();
				
				i.isimerek("Banana");
				
				System.out.println("===========================SPEKSIFIKASI KOMPUTER===============================");
				ms.data_mouse();
				ky.data_keyboard();
				sp.data_speaker();
				mn.data_monitor();
				tg.data_tegangan();
				vga.data_vga();
				System.out.println(vga.ddr());
				System.out.println("===============================================================================");
				
				System.out.println("\tMerek \t: "+i.merek);
				System.out.println("\tVersion \t: "+i.type);
				nama.namalengkap("\tRizky", " Gunardi");
				data_diri mhs = new data_diri();
				System.out.println(mhs.kelas);
				
		}

		
				private void namalengkap(String nama1, String nama2){
					System.out.println(nama1+nama2);
				}		
			
				private void data_vga(){
					System.out.println("\tMemori VGA\t\t: 2048 MB ");
					}
						private int ddr(){
							return 2;
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
	
	class tegangan{
		private int tg_psu;
		
		public void data_tegangan(){
			tg_psu = 600;
			
			System.out.println("\tUkuran PSU\t\t: "+tg_psu+" watt");
		}
	}	