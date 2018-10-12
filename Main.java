public class Main{
	public static void main(String[] args) {
		Designer d = new Designer();
		d.setNama("Udin");
		d.setAlamat("Jatibarang");
		System.out.println(d.showKaryawan());
		d.setGaji(100);
		System.out.println("Gaji: "+d.getGaji());
	}
}