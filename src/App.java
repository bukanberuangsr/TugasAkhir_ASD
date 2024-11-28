 import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Mahasiswa> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int input;
        generateData(ll);

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
                if (ll.isEmpty()) {
                    System.out.println("List mahasiswa masih kosong, silahkan isi terlebih dahulu");
                }

                System.out.print("\nMau diurutkan? (y/t): ");
                String diurutkan = sc.nextLine();

                if (diurutkan.equalsIgnoreCase("y")) {
                    System.out.println("\nPilih metode sortir");
                    System.out.println("1. Bubble");
                    System.out.println("2. Insertion");
                    System.out.print("Masukkan pilihan anda: ");
                    int metode = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Pilih atribut yang akan sortir");
                    System.out.println("1. NIM");
                    System.out.println("2. Nama");
                    System.out.println("3. Program Studi");
                    System.out.print("Masukkan pilihan anda: ");
                    int atributSortir = sc.nextInt();
                    sc.nextLine();

                    // ! TODO: Benerin output list setelah sortir
                    if (metode == 1) {
                        bubbleSort(ll, atributSortir);
                    } else if (metode == 2) {
                        insertionSort(ll, atributSortir);
                    } else {
                        System.out.println("Metode tidak valid!");
                    }
                    System.out.println("\n=== Daftar Mahasiswa (sortir) ===");
                    printData(ll);

                } else if (diurutkan.equalsIgnoreCase("t")) {
                    System.out.println("\n=== Daftar Mahasiswa` ===");
                    printData(ll);
                } else {
                    System.out.println("Input tidak valid! Silahkan coba lagi");
                }

            } else if (input == 0) {
                System.out.println("\nProgram dihentikan.");
            } else {
                System.out.println("Input tidak valid! Silahkan coba lagi");
            }
        } while (input != 0);
        sc.close();
    }

    public static void bubbleSort(LinkedList<Mahasiswa> list, int atribut) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                boolean condition = false;
                if (atribut == 1) {
                    condition = list.get(i).nim > list.get(i + 1).nim;
                } else if (atribut == 2) {
                    condition = list.get(i).nama.compareToIgnoreCase(list.get(i + 1).nama) > 0;
                } else if (atribut == 3) {
                    condition = list.get(i).programStudi.compareToIgnoreCase(list.get(i + 1).programStudi) > 0;
                }

                if (condition) {
                    Mahasiswa temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
        // System.out.println(list);
    }

    private static void insertionSort(LinkedList<Mahasiswa> list, int atribut) {
        for (int i = 1; i < list.size(); i++) {
            Mahasiswa key = list.get(i);
            int j = i-1;

            while (j >= 0) {
                boolean condition = false;
                if (atribut == 1) {
                    condition = list.get(j).nim > key.nim;
                } else if (atribut == 2) {
                    condition = list.get(j).nama.compareToIgnoreCase(key.nama) > 0;
                } else if (atribut == 3) {
                    condition = list.get(j).programStudi.compareToIgnoreCase(key.programStudi) > 0;
                }

                if (!condition) break;

                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        // System.out.println(list);
    }

    private static void printData(LinkedList<Mahasiswa> ll) {
        System.out.println("\nNIM:\t\tNama:\t\t\tProgram Studi:");
        for (Mahasiswa mhs : ll) {
            System.out.println(mhs);
        }
    }

    // Untuk debugging
    private static void generateData(LinkedList<Mahasiswa> ll) {
        ll.add(new Mahasiswa(23013, "Akhtar Hafiz P", "Teknologi Informasi"));
        ll.add(new Mahasiswa(23001, "M Gilang H", "Teknologi Informasi"));
        ll.add(new Mahasiswa(23004, "Nadiyatun Nur A", "Teknik Informatika"));
        ll.add(new Mahasiswa(21003, "Rahmat Effendi", "Teknik Komputer"));
        ll.add(new Mahasiswa(23020, "Kinky Maylana P", "Teknologi Informasi"));
        ll.add(new Mahasiswa(22012, "Nadiya I", "Teknik Elektro"));
        ll.add(new Mahasiswa(23010, "Zeinnita Y", "Teknik Elektro"));
        ll.add(new Mahasiswa(21002, "Rendra A", "Ilmu Ekonomi"));
        ll.add(new Mahasiswa(24001, "Aditya Prasetyo", "Teknik Informatika"));
        ll.add(new Mahasiswa(24002, "Dewi Lestari", "Ilmu Komputer"));
        ll.add(new Mahasiswa(24003, "Bayu Saputra", "Sistem Informasi"));
        ll.add(new Mahasiswa(24004, "Siti Nurhaliza", "Teknologi Informasi"));
        ll.add(new Mahasiswa(24005, "Rizky Fadillah", "Teknik Komputer"));
        ll.add(new Mahasiswa(24006, "Nabila Rahma", "Teknik Elektro"));
        ll.add(new Mahasiswa(24007, "Fahmi Alamsyah", "Sistem Informasi"));
        ll.add(new Mahasiswa(24008, "Putri Ananda", "Teknologi Informasi"));
        ll.add(new Mahasiswa(24009, "Hendra Wijaya", "Ilmu Ekonomi"));
        ll.add(new Mahasiswa(24010, "Ayu Kartika", "Teknik Informatika"));
    }
}
