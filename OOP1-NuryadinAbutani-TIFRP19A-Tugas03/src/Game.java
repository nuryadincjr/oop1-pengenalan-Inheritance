
/**
 *
 * @author abu
 */
class Game extends Software{
    //deklarasi variabel
    private String jenis = "unknown";
    private String tipe = "unknown";
    private String ukuran = "unknown";
    private String rilis = "unknown";
    //konstruktor
    public Game(String kode, String nama, String lisensi){
        super(kode, nama, lisensi);
    }
    public Game(String kode, String nama, String lisensi, String jenis, String tipe){
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);
        this.jenis = jenis;
        this.tipe = tipe;
    }
    
    public Game(String kode, String nama, String lisensi, String jenis, String tipe, String ukuran){
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);
        this.jenis = jenis;
        this.tipe = tipe;
        this.ukuran = ukuran;
    }
    
    public Game(String kode, String nama, String lisensi, String jenis, String tipe, String ukuran, String rilis){
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);
        this.jenis = jenis;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.rilis = rilis;
    }
    
    //getter
    public String getKode(){
        return super.getKode();
    }
    public String getNama(){
        return super.getNama();
    }
    public String getLisensi(){
        return super.getLisensi();
    }
    public String getJenis(){
        return jenis;
    }
    public String getTipe(){
        return tipe;
    }
    public String getUkuran(){
        return ukuran;
    }
    public String getRilis(){
        return rilis;
    }
}
