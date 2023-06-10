package students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien []sv = new SinhVien[n];
        for(int i=0; i<n; i++) {
            sv[i] = new SinhVien();
            sc.nextLine();
            String ten = sc.nextLine();
            sv[i].setHoTen(ten);
            String lop = sc.nextLine();
            sv[i].setLop(lop);
            String ngaySinh = sc.nextLine();
            sv[i].setNgaySinh(ngaySinh);
            double gpa = sc.nextDouble();
            sv[i].setGpa(gpa);
        }
        for(int i=0; i<n; i++) {
            System.out.println(sv[i].toString());
        }
    }
}