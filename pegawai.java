public class pegawai {
	private String np;
	private String nama;
	private String alamat;
	
	public pegawai(){
	
	}
	public pegawai (String np, String nama, String alamat){
		this.np = np;
		this.alamat = alamat;
		this.nama = nama;
	}
	public void setNama (String nama){
		this.nama = nama;
	}
	public String getNama(){
		return this.nama;
	}
	public int getGaji(){
		return 1500000;
	}
}