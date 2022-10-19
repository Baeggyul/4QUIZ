public class dosen extends pegawai {
	private int totalSKS;
	private final int tagihan_sks = 150000;
	
	public dosen (){
		
	}
	public dosen (String np, String nama, String alamat){
		super (np, nama, alamat);
	}
	public void setSKS(int SKS){
		this.totalSKS = SKS;
	}
	@Override
	public int getGaji(){
		int total_gaji = totalSKS*tagihan_sks;
		return total_gaji+super.getGaji();
	}
}