package tinhluongnhanvien;

public class NhanVien {
    private String maNV = "NV01";
    private String name;
    private long salaryBasics;
    private int soNgayCong;
    private String position;

    public NhanVien(String maNV, String name, long salaryBasic, int soNgayCong, String position){
        this.maNV = maNV;
        this.name = name;
        this.salaryBasics = salaryBasic;
        this.soNgayCong = soNgayCong;
        this.position = position;
    }
    public long salaryMonth(){
        return (long)soNgayCong * salaryBasics;
    }
    public long salaryBonus(){
       long salary = 0;
       if(soNgayCong >= 25){
        salary = salaryMonth() * 20/100;
       }else if (soNgayCong >=22 && soNgayCong < 25){
        salary = salaryMonth() * 10 / 100;
       }
       return salary;
    }
    public int phuCap() {
        int luong = 0;
        if(position.compareTo("GD") == 0) {
            luong = 250000;
        }
        else if(position.compareTo("PGD") == 0) {
            luong = 200000;
        }
        else if(position.compareTo("TP") == 0) {
            luong = 180000;
        }
        else {
            luong = 150000;
        }
        return luong;
    }
    public long thuNhap(){
         return (long)phuCap() + salaryMonth() + salaryBonus();
    }
    public void in () {
        System.out.println(maNV + " " + name + " " + salaryMonth() + " "+ salaryBonus() +" " + phuCap() + " " + thuNhap());
    }
    
}
