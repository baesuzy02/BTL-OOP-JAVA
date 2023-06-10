package staff1;

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
            String diaChi = scanner.nextLine();
            String maSoThue = scanner.nextLine();
            String ngayKi = scanner.nextLine();	
            Staff st1 = new Staff(i+1, name, gender, ngaySinh, diaChi, maSoThue, ngayKi);
            st.add(st1);
        }
        for(int i = 0; i < st.size(); i++){
            System.out.println(st.get(i).toString());
        }
    }
    
}
