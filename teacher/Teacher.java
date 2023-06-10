package teacher;

public class Teacher {
    private String maGV;
    private String hoTen, boMon;
    
    public Teacher(int stt, String hoTen, String boMon) {
        this.maGV = "GV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    public String getTen() {
        String token[] = hoTen.split("\\s+");
        String ten = token[token.length - 1];
        return ten;
    }
    public String getMa() {
        return maGV;
    }
    public String getNganh() {
        String token[] = boMon.split("\\s+");
        String tenNganh = "";
        for(String x : token) {
            tenNganh += Character.toUpperCase(x.charAt(0));
        }
        return tenNganh;
    }
    @Override
    public String toString() {
        return maGV + " " + hoTen + " " + getNganh();
    }
    
}
