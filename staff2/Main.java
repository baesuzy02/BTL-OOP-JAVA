package staff2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Staff> st = new ArrayList<Staff>();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            String name = scanner.nextLine();
            String gender = scanner.nextLine();
            String ngaySinh = scanner.nextLine();
            String address = scanner.nextLine();
            String maSoThue = scanner.nextLine();
            String ngayKi = scanner.nextLine();
            Staff st1 = new Staff(i+1, name, gender, ngaySinh, address, maSoThue, ngayKi);
            st.add(st1);
        }
        Collections.sort(st, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if(o1.getNam() != o2.getNam()) {
                    return o1.getNam() - o2.getNam();
                }
                if(o1.getThang() != o2.getThang()) {
                    return o1.getThang() - o2.getThang();
                }
                if(o1.getNgay() != o2.getNgay()) {
                    return o1.getNgay() - o2.getNgay();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(int i = 0; i < st.size(); i++){
            System.out.println(st.get(i).toString());
        }
    }
    
}
