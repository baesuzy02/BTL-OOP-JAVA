package danhsachmathang;

public class MatHang {
    private String ma , ten , donVi;
    private  int giaMua , giaBan;
    public MatHang (int stt, String ten , String donVi, int giaMua,int giaBan ){
        this.ma = "MH" + String.format("%04d",stt);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int loiNhuan(){
        return giaBan - giaMua;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan();
    }

}
