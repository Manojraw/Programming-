import java.util.Scanner;
class gy{
		
	void revers(){
		Scanner t = new Scanner(System.in);
String hf = t.next();
String re =" ";
for (int i = 0; i < hf.length(); i++) {
    re =hf.charAt(i)+re ;//not re+hf.charAt(i);
	t.close();
}
System.out.println("Reversed string: "+ re);}
public static void main(String[] args) {
	gy hy=new gy();
	hy.revers();
}
}
