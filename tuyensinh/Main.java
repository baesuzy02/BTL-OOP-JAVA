package tuyensinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String name = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();

        ThiSinh ts = new ThiSinh(code, name, diemToan, diemLy, diemHoa);
        ts.in();
    }
    
}
