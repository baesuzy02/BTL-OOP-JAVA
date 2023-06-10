package sinhvien4;

public class Students {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;
    public Students(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    
    public String getMaSV() {
        return this.maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return this.hoTen;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String chuanHoaTen() {
        String token[] = hoTen.split("\\s+");
        String chuanHoa = "";
        for(String x : token) {
            chuanHoa += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++) {
                chuanHoa += Character.toLowerCase(x.charAt(i));
            }
            chuanHoa += " ";
        }
        return chuanHoa.trim();
    }
    @Override
    public String toString() {
        return maSV + " " + chuanHoaTen() + " " + lop + " " + email;
    }
    
}
