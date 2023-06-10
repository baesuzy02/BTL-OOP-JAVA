package nhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Moi nhap ma nhan vien ");
        // String ma = sc.nextLine();
        // System.out.println("Moi nhap ten nhan vien");
        String name = sc.nextLine();
        // System.out.println("Moi nhap gioi tinh nhan vien");
        String gioiTinh = sc.nextLine();
        // System.out.println("Moi nhap ngay sinh nhan vien ");
        String ngaySinh = sc.nextLine();
        // System.out.println("Moi nhap dia chi nhan vien");
        String diaChi = sc.nextLine();
        // System.out.println("Moi nhap ma so thue");
        String maSoThue = sc.nextLine();
        // System.out.println("Moi nhap so hop dong");
        String hopDong = sc.nextLine();
        NhanVien nv = new NhanVien("0001" ,name, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong);
        System.out.println(nv);
    
}
}
