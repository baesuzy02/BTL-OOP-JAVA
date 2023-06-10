package sinhvien3;

public class SinhVien {
    private String ma;
    private String name;
    private String ngaySinh;
    private String lopHoc;
    private double diemGPA;
    
    public SinhVien(int stt, String name, String lopHoc,String ngaySinh, double diemGPA) {
        this.ma = "SV" + String.format("%03d", stt);
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
        this.diemGPA = diemGPA;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public double getDiemGPA() {
        return diemGPA;
    }
    public String chuanHoaTen() {
        String token[] = name.split("\\s+");
        String ten = "";
        for(String x : token) {
            ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++) {
                ten += Character.toLowerCase(x.charAt(i));
            }
            ten += " ";
        }
        return ten.trim();
    }
    public String chuanHoaNgaySinh() {
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
    @Override
    public String toString() {
        return ma + " " + chuanHoaTen() + " " + lopHoc + " " + chuanHoaNgaySinh() + " " + String.format("%.2f", diemGPA);
    }
    
}
