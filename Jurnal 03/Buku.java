public class Buku {
    private String judul;
    private String penulis;
    private int tahunterbit;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunterbit = tahun;
    }

    @Override
    public String toString() {
        return "Buku [nip=" + judul + ", nama=" + penulis + ", divisi=" + tahunterbit + "]";
    }
}