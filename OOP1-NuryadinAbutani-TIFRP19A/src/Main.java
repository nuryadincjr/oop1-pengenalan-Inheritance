import java.io.*;
/**
 *
 * @author abu
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        Game gameA = new Game("", "", "");
        Game gameB = new Game("", "", "", "", "");
        
        //menu
        while(true){
            System.out.println("=========================");
            System.out.println("\tMENU GAME");
            System.out.println("=========================");
            System.out.println("1. Input Game A");
            System.out.println("2. Input Game B");
            System.out.println("3. Lihat Data Game");
            System.out.println("4. Keluar");
            System.out.println("=========================");    
            
            //input
            System.out.print("Masukan Pilihan: ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("");
            
            //output + proses
            switch(pilihan){
                case 1:
                    System.out.println("=========================");
                    System.out.println("\tINPUT GAME A");
                    System.out.println("=========================");
                    System.out.print("Masukan Kode\t: ");
                    String kode = br.readLine();
                    System.out.print("Masukan Nama\t: ");
                    String nama = br.readLine();
                    System.out.print("Masukan Lisensi\t: ");
                    String lisensi = br.readLine();
                    
                    gameA = new Game(kode, nama, lisensi);
                    System.out.println("");
                    System.out.println("*** Data Game A Berhasil disimpan ***");
                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("\tINPUT GAME B");
                    System.out.println("=========================");
                    System.out.print("Masukan Kode\t: ");
                    kode = br.readLine();
                    System.out.print("Masukan Nama\t: ");
                    nama = br.readLine();
                    System.out.print("Masukan Lisensi\t: ");
                    lisensi = br.readLine();
                    System.out.print("Masukan Jenis\t: ");
                    String jenis = br.readLine();
                    System.out.print("Masukan Tipe\t: ");
                    String tipe = br.readLine();
                    
                    gameB = new Game(kode, nama, lisensi,jenis, tipe);
                    System.out.println("");
                    System.out.println("*** Data Game B Berhasil disimpan ***");
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("\tDATA GAME");
                    System.out.println("=========================");
                    
                    System.out.println("GAME A");
                    System.out.println("Kode\t: "+gameA.getKode());
                    System.out.println("Nama\t: "+gameA.getNama());
                    System.out.println("Lisensi\t: "+gameA.getLisensi());
                    System.out.println("Jenis\t: "+gameA.getJenis());
                    System.out.println("Tipe\t: "+gameA.getTipe());
                    System.out.println("");
                    System.out.println("GAME B");
                    System.out.println("Kode\t: "+gameB.getKode());
                    System.out.println("Nama\t: "+gameB.getNama());
                    System.out.println("Lisensi\t: "+gameB.getLisensi());
                    System.out.println("Jenis\t: "+gameB.getLisensi());
                    System.out.println("Tipe\t: "+gameB.getTipe());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
