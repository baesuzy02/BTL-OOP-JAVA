package tuyensinh;

public class ThiSinh {
    private String code;
    private String name;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinh(String code, String name, double diemToan, double diemLy, double diemHoa){
        this.code = code;
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public int khuVuc(){
        String t = "" + code.charAt(2);
        return Integer.parseInt(t);
    }
    public double sumMark(){
        double priorityMark = 0;
        if(khuVuc() == 1){
            priorityMark = 0.5;
        } else if(khuVuc() == 2){
            priorityMark = 1.0;
        }else {
            priorityMark = 2.5;
        }
        return priorityMark + diemToan + diemHoa + diemLy;
    }
    public void in() {
        if(sumMark() >= 24) {
            System.out.print(code + " " + name + " " + khuVuc() + " ");
            if(sumMark() == (int)sumMark()) System.out.printf("%.0f", sumMark());
            else System.out.printf("%.1f", sumMark());
            System.out.print(" TRUNG TUYEN");
        }
        else {
            System.out.print(code + " " + name + " " + khuVuc() + " " );
            if(sumMark() == (int)sumMark()) System.out.printf("%.0f", sumMark());
            else System.out.printf("%.1f", sumMark());
            System.out.println(" TRUOT");

        }
    }
}