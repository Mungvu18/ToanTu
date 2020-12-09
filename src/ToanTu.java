import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao chieu dai");
        width = scanner.nextFloat();
        System.out.println("Moi ban nhap vao chieu cao");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is:" + area);
    }
}
