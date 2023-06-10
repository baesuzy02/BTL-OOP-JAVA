package thunhapgiaovien;

public class GiaoVien {
    private String maGV;
    private String name;
    private long salaryBasic;

    public GiaoVien(String maGV, String name, long salaryBasic) {
        this.maGV = maGV;
        this.name = name;
        this.salaryBasic = salaryBasic;    
   }
   public long thuNhap(){
    long levelSalary = Long.parseLong(maGV.substring(2));
    long luongTroCap = 0;
    if(maGV.contains("HT")){
        luongTroCap = 2000000;
    }else if (maGV.contains("HP")){
        luongTroCap = 900000;
    }else{
        luongTroCap = 500000;
    }
    return salaryBasic * levelSalary + luongTroCap;
   }
   public int heSoLuong(){
    return Integer.parseInt(maGV.substring(2));
   }
   public void inInfo(){
    System.out.println(maGV + " " + name + " " + heSoLuong() + " " + thuNhap());
   }
}