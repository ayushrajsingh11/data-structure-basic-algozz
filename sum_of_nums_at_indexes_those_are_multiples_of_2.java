public class sum_of_nums_at_indexes_those_are_multiples_of_2 {
   public static void  sum_of_idexes(int[] arr,int i,int sum){
    if(i<=0)
    {
        System.out.print(sum);
        return;
    }
    if(i%3==0)
    sum=sum+arr[i];
    sum_of_idexes(arr, i-1, sum);
   }
    public static void main(String[] args) {
        int[] arr={50,10,40,65,35,80,15,5,30};
        int sum=0;
        int n=arr.length;
        sum_of_idexes(arr, n-1, sum);


    }
}
