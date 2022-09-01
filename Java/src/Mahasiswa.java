import java.util.Scanner;

public class Mahasiswa {

    String nama, nim, alamat, jenisKelamin;

    public void isiData(String nama, String nim, String alamat, String jenisKelamin){
       this.nama = nama;
       this.nim = nim;
       this.alamat = alamat;
       this.jenisKelamin = jenisKelamin;
    }

    public void printData(){
        System.out.println("\n================================================");
        System.out.println("                DATA MAHASISWA");
        System.out.println("================================================\n");
        System.out.println("Nama             :" + this.nama);
        System.out.println("NIM              :" + this.nim);
        System.out.println("Jenis Kelamin    :" + this.jenisKelamin);
        System.out.println("Alamat           :" + this.alamat);
        System.out.println("\n================================================");
    }

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        System.out.println();
        System.out.println("                ISI DATA MAHASISWA");
       
        Scanner namaScanner = new Scanner(System.in);
        System.out.println("\nMasukan Nama Anda : ");
        System.out.printf(">> ");
        String nama = namaScanner.nextLine();

        Scanner nimScanner = new Scanner(System.in);
        System.out.println("\nMasukan NIM Anda : ");
        System.out.printf(">> ");
        String nim = nimScanner.nextLine();

        Scanner alamatScanner = new Scanner(System.in);
        System.out.println("\nMasukan Alamat Anda : ");
        System.out.printf(">> ");
        String alamat = alamatScanner.nextLine();

        Scanner jenisKelaminScanner = new Scanner(System.in);
        System.out.println("\nMasukan Jenis Kelamin Anda (L/P) : ");
        System.out.printf(">> ");
        String jenisKelamin = jenisKelaminScanner.nextLine();

        mhs.isiData(nama, nim, alamat, jenisKelamin);
        mhs.printData();
    }
}