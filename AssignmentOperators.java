public class AssignmentOperators {
    public static void main(String args[]) {
        int a = 4;
        int b = a;
        System.out.println("= : " +b);

        int c = 5;
        c += 5; // c = c + 5
        System.out.println("+= : " +c);

        int d = 4;
        d *= 4; // d = d * 4
        System.out.println("*= : "+d);

        int e = 6;
        e -= 6; // e = e - 6
        System.out.println("-= : " +e);

        int f = 7;
        f /= 7; // f = f / 7
        System.out.println("/= : " +f);
        
        int g = 8;
        g %= 8; // g = g % 8
        System.out.println("%= : " +g);
    }
    
}
