package nhanvien;

public class NhanVien {
    private String ma;
    private String name;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String hopDong;
    
    public NhanVien (String ma, String name, String gioiTinh, String ngaySinh,String diaChi,String maSoThue,String hopDong){
        this.ma = ma;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this. ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
    }
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getMaSoThue() {
        return maSoThue;
    }
    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }
    public String getHopDong() {
        return hopDong;
    }
    public void setHopDong(String hopDong) {
        this.hopDong = hopDong;
    }
    public String toString() {
        return ma + " " + name + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue+ " " + hopDong;

    }

}
