package recursive;

public class Recursive {
    public static void countDown(int n) {
        if(n == 1) {
            System.out.println(1);
        } else if(n > 1) {
            Recursive.countDown(n-1);
            System.out.println(n);
        }
    }
    
    public static void countDown( int m, int n) {
        if(n == m) {
            System.out.println(m);
        } else if(n > 1) {
            Recursive.countDown(m,n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Recursive.countDown(5,9);
    }
}
