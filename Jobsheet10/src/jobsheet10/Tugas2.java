package jobsheet10;

/**
 *
 * Created by Pikonnn
 */

public class Tugas2 {
    String nama, semester;
    int nim, sks;
    double ip;
    
    public void IP(){
        if(ip >= 3.5){
            sks = 24;
            System.out.println("Anda berhak mengontrak "+sks+" SKS pada Semester V");
        }
        else if(ip >= 3.0){
            sks = 22;
            System.out.println("Anda berhak mengontrak "+sks+" SKS pada Semester V");
        }
        else if(ip >= 2.5){
            sks = 20;
            System.out.println("Anda berhak mengontrak "+sks+" SKS pada Semester V");
        }
        else if(ip >= 2.0){
            sks = 18;
            System.out.println("Anda berhak mengontrak "+sks+" SKS pada Semester V");
        }
        else{
            sks = 15;
            System.out.println("Anda berhak mengontrak "+sks+" SKS pada Semester V");
        }
    }
    
    public static void main(String[] args){
        Tugas2 Mahasiswa = new Tugas2();
    
        Mahasiswa.nama = "Joni";
        Mahasiswa.nim = 12345;
        Mahasiswa.semester = "V";
        Mahasiswa.ip = 3.5;
        
        
        System.out.println("Jumlah Pengambilan SKS");
        System.out.println("Nama Mahasiswa\t: "+ Mahasiswa.nama);
        System.out.println("NIM\t\t: "+ Mahasiswa.nim);
        System.out.println("Semester\t: "+ Mahasiswa.semester);
        System.out.println("IP Semester ini\t: "+ Mahasiswa.ip);
        Mahasiswa.IP();
    }
}
