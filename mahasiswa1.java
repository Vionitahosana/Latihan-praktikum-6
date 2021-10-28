class kelas { 
int nrp; String nama;

	public void setNrp(int i) { 
	nrp=i;
	}

	public void setNama(String i){
	nama=i;
	}
}

public class mahasiswa1 {
	public static void main(String args[]){ 

	Siswa anak = new Siswa(); 
	anak.setNrp(51019021); 
	anak.setNama("Vionita"); 
	System.out.println(anak.nrp); 
	System.out.println(anak.nama);
	
	}
	
}