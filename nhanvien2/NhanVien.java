package nhanvien2;

public class NhanVien {
    private String ma;
    private String name;
    private String gender;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopdong;

    public NhanVien(String ma, String name, String gender, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong){
           this.ma = ma;
           this.name = chuanHoaTen(name);
           this.gender = gender;
           this.ngaySinh = chuanHoa(ngaySinh);
           this.diaChi = diaChi;
           this.maSoThue = maSoThue;
           this.ngayKiHopdong = chuanHoa(ngayKiHopDong);
    }
    public String chuanHoa(String ngayThang){
        StringBuilder sb = new StringBuilder(ngayThang);
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        return this.ngayKiHopdong = sb.toString();
    }
    public String chuanHoaTen(String Ten) {
        String chuanHoa = "";
        String token[] = Ten.split("\\s+");
        for(String x : token) {
            chuanHoa += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++) {
                chuanHoa += Character.toLowerCase(x.charAt(i));
            }
            chuanHoa += " ";
        }
        return this.name = chuanHoa.trim();
    }

  @Override

  public String toString(){
    return ma + " " + name + " " + gender + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKiHopdong;

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
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
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
public String getNgayKiHopdong() {
    return ngayKiHopdong;
}
public void setNgayKiHopdong(String ngayKiHopdong) {
    this.ngayKiHopdong = ngayKiHopdong;
}
}  