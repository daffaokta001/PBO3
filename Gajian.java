package pegawai;

        class Gajian {
	private int nik;
	private String nama, alamat, golongan;
	private double gaji, gajiutama, total;
	private int lembur;
	private float lemburan, tunjangan;

	public Gajian () {
		System.out.println("Konstruktor Pegawai");
	}
	public void setNik(int Nik){
		this.nik=Nik;
	}
	public void setNama(String Nama){
		this.nama=Nama;
	}
	public void setAlamat(String Alamat){
		this.alamat=Alamat;
	}
	public void setGajiUtama(double GajiUtama){
		this.gajiutama=GajiUtama;
	}
	public void setLembur(int Lembur){
		this.lembur=Lembur;
	}

	public int getNik() {
		return nik;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public double getGajiUtama() {
		return gajiutama;
	}
	public int getLembur() {
		return lembur;
	}
	
	
	public void setInfoLembur(float ngelembur, double gajipokok) {
		lemburan = ngelembur;
		gaji = lemburan * 0.01 * gajipokok;
	}
	public void setTunjangan(String Golongan, double gajipokok){
		golongan=Golongan;
		switch(golongan){
			case "A":
			{
				tunjangan=(float) (gajipokok*0.015);
				break;
			}
			case "B":
			{
				tunjangan=(float) (gajipokok*0.03);
				break;
			}
			case "C":
			{
				tunjangan=(float) (gajipokok*0.05);
				break;
			}
		}
	}	
	public void setTotal(double gajipokok) {
		total = tunjangan + gajipokok + gaji;
	}
	public void cetak()
	{
		System.out.println("NIK Pegawai : "+ getNik());
		System.out.println("Nama Pegawai : "+ getNama());
		System.out.println("Alamat Pegawai : "+ getAlamat());
		System.out.println("Gaji Pokok : "+ getGajiUtama());
		System.out.println("Hari Lembur : "+ getLembur());
		System.out.println("Total Lembur : "+ gaji);
		System.out.println("Tunjangan Golongan : "+ tunjangan);
		System.out.println("Total Gaji : "+ total);
		System.out.println("");
	}	
}
    
