import java.io.OutputStream;

class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
        System.out.println("The length of rectangle : " + length);
        System.out.println("The Breadth of rectangle : " + breadth);
    }
}
public class humzahproject{
    public static void main(String[] args){
         Rectangle R = new Rectangle(3, 5);
    }
}