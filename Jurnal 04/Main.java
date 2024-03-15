import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Data> list = new LinkedList<Data>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Masukan Tugas\n2. Hapus Tugas\n3. Tampilkan Semua Tugas\n4. Keluar");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    list.addFirst(new Data());
                    break;
                case 2:
                    System.out.println("1. Hapus tugas terakhir\n2. Hapus tugas sesuai mata kuliah\n3. Hapus tugas pertama");
                    int pilihan2 = s.nextInt();
                    if (pilihan2 ==1 ) {
                        list.removeLast();
                    } else if (pilihan2 == 2) {
                        System.out.println("Masukan nama mata kuliah: ");
                        String namaLagu= s.nextLine();
                        ListIterator<Data> it1 = list.listIterator();
                        while (it1.hasNext()) {
                            if (it1.next().getMataKuliah().equals(namaLagu)) {
                                it1.remove();
                                break;
                            }
                        }
                    } else if (pilihan2 == 3){
                        list.removeFirst();
                    } else {
                        System.out.println("Input salah");
                    }
                    break;
                    case 3:
                    System.out.println("\n1. Urut dari akhir\n2. Urut dari awal");
                    ListIterator<Data> it2 = list.listIterator();
                    int pilihan3 = s.nextInt();
                    if (pilihan3 == 1) {
                        System.out.println("\nMenampilkan daftar tugas dari akhir: ");
                        while (it2.hasNext()) {
                            System.out.println(it2.next());
                        }
                    } else {
                       System.out.println("\nMenampilkan daftar tugas dari awal: ");
                       while (it2.hasPrevious()) {
                            System.out.println(it2.previous());
                       }
                    }
                    break;
                    case 4:
                    s.close();
                    System.exit(0);
                default:
                System.out.println("Salah Input");
                    break;
            }
        }
    }
}