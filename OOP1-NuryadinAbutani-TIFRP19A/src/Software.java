
/**
 *
 * @author abu
 */
public class Software {
    //deklarasi variabel
    private String kode, nama, lisensi;
    
    //konstruktor
    public Software(){
        
    }
    public Software(String kode, String nama, String lisensi){
        this.kode = kode;
        this.nama = nama;
        this.lisensi = lisensi;
    }
    
    //setter
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLisensi(String lisensi){
        this.lisensi = lisensi;
    }
    
    //getter
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public String getLisensi(){
        return lisensi;
    }    
}
