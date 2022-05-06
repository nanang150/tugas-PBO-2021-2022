class Burung {
	private static String jenis_unggas = "Burung";
	private static int jumlah_kaki =2;
	
	public static String getJenisUnggas(){
		 return jenis_unggas;
		}
		
	public static int getJumlahKaki(){
		 return jumlah_kaki;
		}
		
	private static void menciut(){
		 System.out.println("Aku menciut");
		}
	
	private static void terbang(){
		 System.out.println("Aku terbang");
		}
		
	public static void main (String [] args) {
		 System.out.println(String.format("jenis unggas: %S",getJenisUnggas()));
		 System.out.println(String.format("jumlah kaki: %s",getJumlahKaki()));
		 
		 menciut();
		 terbang();
		}
}
