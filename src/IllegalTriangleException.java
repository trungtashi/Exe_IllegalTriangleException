import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh 1: ");
        int edge_1 = scanner.nextInt();
        System.out.println("Nhập cạnh 2: ");
        int edge_2 = scanner.nextInt();
        System.out.println("Nhập cạnh 3: ");
        int edge_3 = scanner.nextInt();

        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.check(edge_1,edge_2,edge_3);

    }
    private void check(double edge_1,double edge_2,double edge_3){
        try {
            edge_3=Math.sqrt(edge_1*edge_1 + edge_2*edge_2);
            System.out.print(edge_3 + " ");
        }
        catch (Exception e){
            System.out.println("Ngoai le"+e.getMessage());
        }
    }
}
