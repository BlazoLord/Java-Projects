package recursive;

public class Recursive2 {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return  Recursive2.sum(n-1) + n;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Recursive2.sum(8));
    }
}
