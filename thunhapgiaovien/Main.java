package thunhapgiaovien;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maGV = scanner.nextLine();
        String name = scanner.nextLine();
        long salary = scanner.nextLong();

        GiaoVien gv = new GiaoVien(maGV, name, salary);
        gv.inInfo();
    }
    
}
