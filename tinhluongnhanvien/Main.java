package tinhluongnhanvien;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        long salary = scanner.nextLong();
        int soNgayCong = scanner.nextInt();
        String chucVu = scanner.next();

        NhanVien nv = new NhanVien("NV01",name,salary, soNgayCong, chucVu);
        nv.in();
    
   }
}