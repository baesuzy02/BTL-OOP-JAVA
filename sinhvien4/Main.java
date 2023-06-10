package sinhvien4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> listHs = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            Students tmp = new Students(sc.nextLine() , sc.nextLine(), sc.nextLine(), sc.nextLine());
            listHs.add(tmp);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- != 0) {
            String t = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + t +" :");
            for(int i=0; i<listHs.size(); i++) {
                if(listHs.get(i).getLop().equals(t)) {
                    System.out.println(listHs.get(i)) ;
                }
            }
        }
    }

    
}
