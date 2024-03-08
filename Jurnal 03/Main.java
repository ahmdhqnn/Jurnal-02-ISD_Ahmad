import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList<Buku> daftar = new SinglyLinkedList<>();
        while (true) {
            System.out.println("\nPilih menu :\n1. Input data\n2. Hapus data\n3. Cetak list\n4. Keluar");
            System.out.print("Masukkan pilihan ");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = s.next();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = s.next();
                    System.out.print("Masukkan tahun terbit: ");
                    int tahunterbit = s.nextInt();
                    daftar.addNode(new Buku(judul, penulis, tahunterbit));
                    break;
                case 2:
                    daftar.deleteNode();
                    break;
                case 3:
                    daftar.printList();
                    break;
                case 4:
                    s.close();
                    System.exit(0);
                    break;
            }
        }
    }
}