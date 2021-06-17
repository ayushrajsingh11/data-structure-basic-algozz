public class crane {

    public boolean fun(int[] a,int[] p,int pick,int drop){
        int n=a.length;
        int max=0,min=0;
        int flag=0;
        for(int i=0;i<n;i++){
           max=Math.max(p[i],pick);
           min=Math.min(p[i],pick);
            if(max-min<=a[i]){
                if(drop>=(a[i]-p[i])&&drop<=(a[i]+p[i])){
                    flag=1;
                    break;
                }
            }
            if(flag==1) return true;
            else return false;
        }
    }
 public static void main(String[] args) {
     
 }   
}
