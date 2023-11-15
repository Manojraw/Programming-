public class argumentinteger {
   public static void main(String[] args) {
    int r=0;
for(int i=0; i<args.length; i++)
{
    r= r+Integer.parseInt(args[i]);
    
}
System.out.print("sum is"+r);
   } 
}
