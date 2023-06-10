package students;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;
    private static int stt = 0;
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String chuanHoa() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        ngaySinh = sb.toString();
        return ngaySinh;
    }
    public String toString() {
        ++stt;
        return ("SV" + String.format("%03d", stt)) + " " + hoTen + " " + lop + " " + chuanHoa() + " " + String.format("%.2f",gpa);
    }
}