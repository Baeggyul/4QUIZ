public class staff extends pegawai {
	private int total_attend;
	private final int tarifperhari = 5000;
	
	public staff(){
		
	}
	public staff(String np, String nama, String alamat){
		super(np, nama, alamat);
	}
	public void setKehadiran(int jumlah_kehadiran){
		this.total_attend = total_attend;
	}
	
	public int getGaji(){
		int total_gaji  = total_attend*tarifperhari;
		return total_gaji+super.getGaji();
		
	}
	public void setHitungNilai (){
		
	}
}