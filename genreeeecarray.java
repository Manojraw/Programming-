import java.util.Scanner;
public class genreeeecarray  
{
    public static void main(String[] args){
    System.out.println("enter arrray size");
    Scanner n = new Scanner(System.in);
    int p = n.nextInt();
    Object[] arr = new Object[p];
     Scanner n2 = new Scanner(System.in);
    for(int i =0; i<p; i++){
        System.out.println("enter intiger no");
       
       int j = n2.nextInt();
        arr[i]=j;
        if(i+1<p)
        {   System.out.println("enter float no");
            float j2 = n2.nextFloat();
            arr[i+1]= j2;
            i++;
        }

    }
    int sumIntegers = 0;
    float sumFloats = 0;

    for(int i =0; i<p; i++){
       if(arr[i] instanceof Integer){sumIntegers  += (int)arr[i];}
        else if(arr[i] instanceof Float){
       sumFloats+= (float)arr[i];}
       
    }
     System.out.println( sumIntegers  );
       System.out.println( sumFloats );
       n.close();
 n2.close();

}
 

}
