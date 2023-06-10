package sinhvien;

public class ThiSinh {
    private String name;
    private String ngaySinh;
    private double diem1;
    private double diem2;
    private double diem3;
    private double tongDiem;

    public ThiSinh(String name, String ngaySinh, double diem1, double diem2, double diem3,double tongDiem) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = diem1 + diem2 + diem3;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(double tongDiem) {
        this.tongDiem = tongDiem;
    }

    public void print() {
         System.out.printf("%s %s %.1f ", name, ngaySinh , tongDiem);
}
}
