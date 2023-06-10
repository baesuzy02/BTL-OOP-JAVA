package sinhvien3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
        for(int i = 0 ; i < n;i++){
            scanner.nextLine();
        SinhVien sv1 = new SinhVien(i+1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
        sv.add(sv1);
        }
        Collections.sort(sv, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if(o1.getDiemGPA() < o2.getDiemGPA()){
                    return 1;
                }
                if(o1.getDiemGPA() > o2.getDiemGPA()){
                    return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }

        });
        for(SinhVien x : sv){
            System.out.println(x.toString());
        }
    }
    
}
