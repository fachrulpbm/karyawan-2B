public class Karyawan{
	
	private String nama;
	private String alamat;
	private int gaji;	

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public void setGaji(int gaji){
		this.gaji += gaji;
	}

	public int getGaji(){
		return gaji;
	}

	public String showKaryawan(){
		return "Nama: "+nama+"\n"+"Alamat: "+alamat;
	}

}