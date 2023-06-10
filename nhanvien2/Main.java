package nhanvien2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String day = sc.nextLine();
        String address = sc.nextLine();
        String codeTax = sc.nextLine();
        String ngayKiHopDong = sc.nextLine();

        NhanVien nv = new NhanVien("00001", name, gender, day, address, codeTax, ngayKiHopDong);
        System.out.println(nv);
    }
}
