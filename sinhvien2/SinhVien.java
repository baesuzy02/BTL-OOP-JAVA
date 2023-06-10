package sinhvien2;

import java.util.Scanner;

public class SinhVien {
    private static int maSVCuoi = 0;
    private String name;
    private String maSV;
    private String lop;
    private String ngaySinh;
    private float diemGPA;
    

    public SinhVien() {
        maSVCuoi++;
        this.name = "";
        this.maSV = "SV" + String.format("%03d",maSVCuoi);
        this.ngaySinh = "";
        this.diemGPA = 0.0f;   
    }
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        this.name = scanner.nextLine();
        this.lop = scanner.nextLine();
        this.ngaySinh = scanner.nextLine();
        this.diemGPA = scanner.nextFloat();

        scanner.close();
    }
    public String chuanHoa(String date){
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        date = sb.toString();
        return date;
    }
    public void print(){
        System.out.printf("%s %s %s %s %.1f", maSV, name, lop, ngaySinh, diemGPA);
    }
}
