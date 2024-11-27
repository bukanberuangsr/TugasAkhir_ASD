import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Mahasiswa> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan data Mahasiswa");
            System.out.println("2. Lihat daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            input = sc.nextInt();
            sc.nextLine();

            if (input == 1) {
                System.out.println("\nMasukkan data mahasiswa");
                System.out.print("Nim\t\t: ");
                int nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama\t\t: ");
                String nama = sc.nextLine();
                System.out.print("Program Studi\t: ");
                String prodi = sc.nextLine();
                ll.add(new Mahasiswa(nim, nama, prodi));
            } else if (input == 2) {
                System.out.println("\nH");
                System.out.println("\nDaftar Mahasiswa:");
                for (Mahasiswa mhs : ll) {
                    System.out.println(mhs);
                }
            } else if (input == 0) {
                System.out.println("\nProgram dihentikan.");
            } else {
                System.out.println("Input tidak valid! Silahkan coba lagi");
            }
        } while (input != 0);
        sc.close();
    }

    // ! Belum berfungsi
    public static void bubbleSort(LinkedList<Mahasiswa> list) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).nim > list.get( + 1).nim) {
                    swapped = true;
                    Mahasiswa temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        } while (swapped);
        System.out.println(list);
    }

    // ! Belum berfungsi
    private static void insertionSort(LinkedList<Mahasiswa> list){
        for (int i = 1; i < list.size(); i++) {
            Mahasiswa key = list.get(i);
            int j = i-1;
            while (j>=0 && list.get(j).nim > key.nim) {
                list.set(j+1, list.get(j));
                j--;
            }
        }
        System.out.println(list);
    }
}
