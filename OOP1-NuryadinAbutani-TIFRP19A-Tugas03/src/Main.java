import java.io.*;
/**
 *
 * @author abu
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //instance of class
        Game gameA = new Game("", "", "");
        Game gameB = new Game("", "", "", "", "");
        Game gameC = new Game("", "", "", "", "", "");
        Game gameD = new Game("", "", "", "", "", "", "");
        
        //menu
        while(true){
            System.out.println("========================================");
            System.out.println("\t\tMENU GAME");
            System.out.println("========================================");
            System.out.println("1. Input Game A");
            System.out.println("2. Input Game B");
            System.out.println("3. Input Game C");
            System.out.println("4. Input Game D");
            System.out.println("5. Lihat Data Game");
            System.out.println("6. Keluar");
            System.out.println("========================================");    
            
            //input
            System.out.print("Masukan Pilihan: ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("");
            
            //output + proses
            switch(pilihan){
                case 1:
                    String kode, nama, lisensi;
                    System.out.println("========================================");
                    System.out.println("\t\tINPUT GAME A");
                    System.out.println("========================================");
                    System.out.print("Masukan Kode\t\t: ");
                    kode = br.readLine();
                    System.out.print("Masukan Nama\t\t: ");
                    nama = br.readLine();
                    System.out.print("Masukan Lisensi\t\t: ");
                    lisensi = br.readLine();
                    
                    gameA = new Game(kode, nama, lisensi);
                    System.out.println("");
                    System.out.println("*** Data Game A Berhasil disimpan ***");
                    break;
                case 2:
                    String jenis, tipe;
                    System.out.println("========================================");
                    System.out.println("\t\tINPUT GAME B");
                    System.out.println("========================================");
                    System.out.print("Masukan Kode\t\t: ");
                    kode = br.readLine();
                    System.out.print("Masukan Nama\t\t: ");
                    nama = br.readLine();
                    System.out.print("Masukan Lisensi\t\t: ");
                    lisensi = br.readLine();
                    System.out.print("Masukan Jenis\t\t: ");
                    jenis = br.readLine();
                    System.out.print("Masukan Tipe\t\t: ");
                    tipe = br.readLine();
                    
                    gameB = new Game(kode, nama, lisensi,jenis, tipe);
                    System.out.println("");
                    System.out.println("*** Data Game B Berhasil disimpan ***");
                    break;
                case 3:
                    String ukuran;
                    System.out.println("========================================");
                    System.out.println("\t\tINPUT GAME C");
                    System.out.println("========================================");
                    System.out.print("Masukan Kode\t\t: ");
                    kode = br.readLine();
                    System.out.print("Masukan Nama\t\t: ");
                    nama = br.readLine();
                    System.out.print("Masukan Lisensi\t\t: ");
                    lisensi = br.readLine();
                    System.out.print("Masukan Jenis\t\t: ");
                    jenis = br.readLine();
                    System.out.print("Masukan Tipe\t\t: ");
                    tipe = br.readLine();
                    System.out.print("Masukan Ukuran file\t: ");
                    ukuran = br.readLine();
                    
                    gameC = new Game(kode, nama, lisensi,jenis, tipe, ukuran);
                    System.out.println("");
                    System.out.println("*** Data Game C Berhasil disimpan ***");
                    break;
                case 4:
                    String rilis;
                    System.out.println("========================================");
                    System.out.println("\t\tINPUT GAME D");
                    System.out.println("========================================");
                    System.out.print("Masukan Kode\t\t: ");
                    kode = br.readLine();
                    System.out.print("Masukan Nama\t\t: ");
                    nama = br.readLine();
                    System.out.print("Masukan Lisensi\t\t: ");
                    lisensi = br.readLine();
                    System.out.print("Masukan Jenis\t\t: ");
                    jenis = br.readLine();
                    System.out.print("Masukan Tipe\t\t: ");
                    tipe = br.readLine();
                    System.out.print("Masukan Ukuran file\t: ");
                    ukuran = br.readLine();
                    System.out.print("Masukan Tgl Rilis\t: ");
                    rilis = br.readLine();
                    
                    gameD = new Game(kode, nama, lisensi,jenis, tipe, ukuran, rilis);
                    System.out.println("");
                    System.out.println("*** Data Game D Berhasil disimpan ***");
                    break;
                case 5:
                    System.out.println("========================================");
                    System.out.println("\t\tDATA GAME");
                    System.out.println("========================================");
                    
                    System.out.println("GAME A");
                    System.out.println("Kode\t\t: "+gameA.getKode());
                    System.out.println("Nama\t\t: "+gameA.getNama());
                    System.out.println("Lisensi\t\t: "+gameA.getLisensi());
                    System.out.println("Jenis\t\t: "+gameA.getJenis());
                    System.out.println("Tipe\t\t: "+gameA.getTipe());
                    System.out.println("Ukuran File\t: "+gameA.getUkuran());
                    System.out.println("Tgl Rilis\t: "+gameA.getRilis());
                    
                    System.out.println("");
                    System.out.println("GAME B");
                    System.out.println("Kode\t\t: "+gameB.getKode());
                    System.out.println("Nama\t\t: "+gameB.getNama());
                    System.out.println("Lisensi\t\t: "+gameB.getLisensi());
                    System.out.println("Jenis\t\t: "+gameB.getJenis());
                    System.out.println("Tipe\t\t: "+gameB.getTipe());
                    System.out.println("Ukuran File\t: "+gameB.getUkuran());
                    System.out.println("Tgl Rilis\t: "+gameB.getRilis());
                    
                    System.out.println("");
                    System.out.println("GAME C");
                    System.out.println("Kode\t\t: "+gameC.getKode());
                    System.out.println("Nama\t\t: "+gameC.getNama());
                    System.out.println("Lisensi\t\t: "+gameC.getLisensi());
                    System.out.println("Jenis\t\t: "+gameC.getJenis());
                    System.out.println("Tipe\t\t: "+gameC.getTipe());
                    System.out.println("Ukuran File\t: "+gameC.getUkuran());
                    System.out.println("Tgl Rilis\t: "+gameC.getRilis());
                    
                    System.out.println("");
                    System.out.println("GAME D");
                    System.out.println("Kode\t\t: "+gameD.getKode());
                    System.out.println("Nama\t\t: "+gameD.getNama());
                    System.out.println("Lisensi\t\t: "+gameD.getLisensi());
                    System.out.println("Jenis\t\t: "+gameD.getJenis());
                    System.out.println("Tipe\t\t: "+gameD.getTipe());
                    System.out.println("Ukuran File\t: "+gameD.getUkuran());
                    System.out.println("Tgl Rilis\t: "+gameD.getRilis());
                    break;
                default:
                    System.out.println("Perogram Telah Keluar.");
                    System.exit(0);
            }
        }
    }
}
