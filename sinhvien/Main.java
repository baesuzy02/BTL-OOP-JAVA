package sinhvien;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();

        ThiSinh sv = new ThiSinh(name, ngaySinh, d3, d1, d2, d3);
        sv.print();

    }
}
