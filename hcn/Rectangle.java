package hcn;

public class Rectangle {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color){
         this.length = length;
         this.width = width;
         this.color = chuanHoa(color);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double calArea(){
        return length * width;
    }
    public double calPerimeter() {
        return (length + width) / 2;
    }    
    public String chuanHoa(String color) {
        String chuanHoa = "";
        String token[] = color.split("\\s+");
        for(String x : token) {
            chuanHoa += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++) {
                chuanHoa += Character.toLowerCase(x.charAt(i));
            }
            chuanHoa += " ";
        }
        return chuanHoa.trim();
    }
    
    public void print(){
        if(length >0 && width > 0){
            System.out.printf("%.0f", calPerimeter());
            System.out.println(" ");
            System.out.printf("%.0f", calArea());
            System.out.print(" " + chuanHoa(color));
        }else {
            System.out.println("INVALID");

        }
    }
    
}
