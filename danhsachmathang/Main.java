package danhsachmathang;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            sc.nextLine();
            MatHang mh = new MatHang(i+1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            listMatHang.add(mh);
        }
        Collections.sort(listMatHang , new Comparator<MatHang>() {
            public int compare(MatHang o1, MatHang o2) {
                return o2.loiNhuan() - o1.loiNhuan();
            }
        });
        for(MatHang x : listMatHang) {
            System.out.println(x.toString());
        }
    }
    
}
