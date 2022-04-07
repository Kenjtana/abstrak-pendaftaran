package Abstrak;
import java.util.Scanner;

// extends = mengikuti kelas daftar
public class proses extends daftar {

    // panggil method abstrak dari daftar
    public void isiData() {
        Scanner input = new Scanner(System.in);
        
        // mengisi data method isiData
        System.out.println("Isi Data");
        System.out.println(" ");

        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Nama Panggilan: ");
        String panggilan = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();
        System.out.print("Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Tanggal Lahir: ");
        String tanggalLahir = input.nextLine();
        System.out.print("Nomor Handphone: ");
        String nomorHP = input.nextLine();
        System.out.print("SMP Asal : ");
        String smp = input.nextLine();
        System.out.print("Alamat Lengkap : ");
        String alamat = input.nextLine();

        // Input Data Orang Tua
        System.out.println(" ");
        System.out.println("Data Orang Tua");

        System.out.print("Nama Ayah : ");
        String ayah = input.nextLine();
        System.out.print("Nama Ibu : ");
        String ibu = input.nextLine();
        System.out.print("Pekerjaan Ayah : ");
        String pekerjaanAyah = input.nextLine();
        System.out.print("Pekerjaan Ibu : ");
        String pekerjaanIbu = input.nextLine();
    }

    //  method penghasilan
    public void penghasilan(){
        Scanner input = new Scanner(System.in);

        // mengisi data method penghasilan
        System.out.print("Penghasilan Ayah : ");
        int penghasilan = input.nextInt();
        System.out.print("Penghasilan Ibu : ");
        int penghasilan2 = input.nextInt();

        System.out.println(" ");

        // percabangan untuk pembayaran SPP dari total penghasilan
        int SPP;
        int total = penghasilan + penghasilan2;
        if (total < 5000000) {
            SPP = 200000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total < 10000000){
            SPP = 300000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total< 15000000){
            SPP = 400000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total < 20000000){
            SPP = 500000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total > 20000000){
            SPP = 600000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else {
            System.out.println("Maaf Anda tidak diterima!");
        }

    }

}
    

