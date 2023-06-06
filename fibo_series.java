//3. Fibonacci Series

public class fibo_series {
    public static void main(String[] args) {
        int m = 10;
        int t1 = 0, t2 = 1, t3;

        //print 
        System.out.println("---------------------------------------------");
        System.out.println("Fibonacci Series");
        System.out.println("---------------------------------------------");
        System.out.print("First " + m + " terms: ");
        System.out.print(t1 + " " + t2);

        //Process
        //Implement for-loop to have the fibo series
        for(int n = 2; n < m; ++n) {
            t3 = t1 + t2;
            System.out.print(" " + t3);
            t1=t2;
            t2=t3;
        }
    }
}
