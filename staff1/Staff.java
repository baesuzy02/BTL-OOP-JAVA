package staff1;

public class Staff {
    private String ma;
    private String name;
    private String gender;
    private String ngaySinh;
    private String address;
    private String maSoThue;
    private String ngayKi;
    public Staff(int stt, String name, String gender,String ngaySinh, String address, String maSoThue, String ngayKi) {
        this.ma = String.format("%05d", stt);
        this.name = name;
        this.gender = gender;
        this.ngaySinh = ngaySinh;
        this.address = address;
        this.maSoThue = maSoThue;
        this.ngayKi = ngayKi;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMaSoThue() {
        return maSoThue;
    }
    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }
    public String getNgayKi() {
        return ngayKi;
    }
    public void setNgayKi(String ngayKi) {
        this.ngayKi = ngayKi;
    }
    public String chuanHoa(String x) {
        StringBuilder sb = new StringBuilder(x);
        if(sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        x = sb.toString();
        return x;
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + gender + " " + chuanHoa(ngaySinh) + " " + address + " " + maSoThue + " " + chuanHoa(ngayKi);
    }
    
    
}
