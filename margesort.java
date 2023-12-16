class margesort {
    public static void main(String[]args){
        int arr[] = { 3,5,2,5,8,15,35,43,76,45,98,43,23,67,9,0,4,0,8,4,78,65,7,45,600,900};
        
        for(int i =0; i<26;i++)
        {
            System.out.print(" "+arr[i]);
           
        }
         System.out.println("\n");
        marge_sort(arr,26);
        for(int i =0; i<26;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public  static void marge_sort(int a[], int N)
    {
        int b[]= new int[266],l=1;
        while(l<N)
        {
            copythesort(a,N,l,b);
            copythesort(b,N,2*l,a);
            l=4*l;
        }
        
    }
    public static void  copythesort(int a[],int N,int l,int b[]){
        int Q= N/(2*l);
        int S=(2*l)*Q;
        int R=N-S;
        for(int i=0;i<Q;i++){
            int lb=(2*i)*l;
          
            marge(a,l,lb,a,l,lb+l,b,lb);    
        } 
        
        if(R<=l)
        {
            for(int j=0;j<R;j++)
            {
                b[S+j]=a[S+j];
            }
        }
        else
        {
            marge(a,l,S,a,R-l,S+l,b,S);
        }
        
    }
    private static void marge(int a[],int n1,int index1,int b[],int n2,int index2,int c[],int index)
    {
        while (n1>0 && n2>0)
        {
            if (a[index1]<b[index2])
            {
                c[index]=a[index1];
                index++;index1++;n1--;
            }
          else 
           {
             c[index]=b[index2];
              index++;index2++;n2--;
           }
        }
        while(n1>0) {
        c[index]= a[index1];
        index++;index1++; n1--;
        }
         while(n2>0) {
        c[index]= b[index2];
        index++;index2++; n2--;
        }
    }
}