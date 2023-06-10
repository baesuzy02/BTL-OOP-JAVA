package phanso;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        PhanSo ps = new PhanSo(x, y);
        ps.print();
    }   
}
