package recursive;

public class Recursive4 {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return  Recursive4.sum(n-1) + n;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Recursive4.sum(8));
    }
}

