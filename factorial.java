public class factorial {
    public static int fact_recursive(int n){
        if(n==0)
        return 1;
        return n*fact_recursive(n-1);
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;

    }
    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.print(fact_recursive(4));
    }
}
