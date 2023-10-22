import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r = new Random();

        for (int i=0;i<32;i++){
            try {
                b=r.nextInt();
                c=r.nextInt();
                a=1234/(b/c);
            } catch (Exception e) {
                System.out.println(e);
                a=0;
            }
            System.out.println("a: "+a);
        }
        System.out.println("After");

    }
}