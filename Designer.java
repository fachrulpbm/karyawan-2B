public class Designer extends Karyawan{

	// method overriding
	public void setGaji(int uang){
		// kata kunci 'super' untuk memanggil field atau method di parent dari child
		if( super.getGaji() + uang <= 70){
			super.setGaji(uang);			
		}else {
			System.out.println("Upah melebihi standar programmer!");
			super.setGaji(-super.getGaji()); // gaji di-0 kan dulu, supaya nanti bisa ditambah 70
			super.setGaji(70); // kemudian di-set supaya 70
		}
	}

	// method overloading
	public void setGaji(int uang, String pesan){
		if( super.getGaji() + uang <= 70){
			super.setGaji(uang);
			System.out.println(uang+" "+pesan);
		}else {
			System.out.println("Upah melebihi standar programmer!");
			super.setGaji(-super.getGaji()); // sama
			super.setGaji(70); // sama
		}
	}

}