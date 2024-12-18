import java.util.Scanner;

public class UAS1B22 {

    static void inputData(String namaTim22[], int jmTim22, int skorTim22[][]) {
        Scanner sc = new Scanner(System.in);
        int jmlTim22 = (14 % 3) + 4;
        for (int i = 0; i < jmlTim22; i++) {
            while (true) {
                System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
                String nama = sc.nextLine();
                if (nama.length() > 0) { 
                    namaTim22[i] = nama; 
                    break; 
                } else {
                    System.out.println("Nama tim tidak boleh kosong. Silakan input ulang.");
                }
            }

            for (int level = 0; level < 2; level++) {
                while (true) {
                    System.out.print("Masukkan skor tim " + namaTim22[i] + " untuk Level " + (level + 1) + ": ");
                    int skor = sc.nextInt();
                    sc.nextLine();

                    if (skor < 0) {
                        System.out.println("Skor tidak boleh negatif. Silakan input ulang.");
                    } else if (level == 0 && skor < 35) {
                        skorTim22[i][level] = 0;
                        break;
                    } else {
                        skorTim22[i][level] = skor;
                        break;
                    }
                }
            }
        }
    }

    static void tampilSkor(int jmlTim22, String namaTim22[], int skorTim22[][]) {
        System.out.println("Daftar nama tim dan skor: ");
        for (int i = 0; i < jmlTim22; i++) {
            System.out.println("\nNama Tim: " + namaTim22[i]);
            System.out.println("Skor Level 1: " + skorTim22[i][0]);
            System.out.println("Skor Level 2 : " + skorTim22[i][1]);
        }
    }

    static void tentukanJuara(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTim22 = (14 % 3) + 4; 
        String namaTim22[] = new String[jmlTim22];
        int skorTim22[][] = new int[jmlTim22][2];
        int pilihan22;
        do {
            System.out.println("\n\n=====Menu Utama=====");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan tabel skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu 1-4: ");
            pilihan22 = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan22) {
                case 4:
                    System.out.println("Keluar dari program");
                    break;
                case 1:
                    inputData(namaTim22, jmlTim22, skorTim22); 
                    break;
                case 2:
                    tampilSkor(jmlTim22, namaTim22, skorTim22); 
                    break;
                case 3:
                    tentukanJuara(); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba input ulang (angka 1-4)");
                    break;
            }

        } while (pilihan22 != 4);
    }
}