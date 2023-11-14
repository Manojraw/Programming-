public class Sort1 {
    public int min( int a[],int n,int k)
    {
        int loc;
        int min=a[k];
        loc=k;
        for(int i=k+1;i<=n-1;i++)
        {
            if(min>a[i])
           {min=a[i];
            loc=i;}
        }
        return loc;
    }
    public static void main(String[] args) {
        int ar[] = {12, 4, 65, 7, 90, 91, 52, 45, 76};
        int temp;
        int N = 9;
        for (int i = 0; i < N; i++) {
            Sort1 g = new Sort1();
            int lo = g.min(ar, N, i);
            temp = ar[lo];
            ar[lo] = ar[i];
            ar[i] = temp;
        }
    
        for (int i = 0; i < N; i++) {
            System.out.println("Selection sort: " + ar[i]);
        }
    }
    
}
