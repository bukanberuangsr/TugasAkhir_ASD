public class Mahasiswa {
    int nim;
    String nama;
    String programStudi;

    Mahasiswa(int nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }

    @Override
    public String toString() {
        return nim + " " + nama + " " + programStudi;
    }
}
