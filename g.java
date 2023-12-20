class  g<C,T>{
    C v;
    T t;
   public T getT() {
       return t;
   }
   public C getV() {
       return v;
   }
   public void setT(T t) {
       this.t = t;
   }
   public void setV(C v) {
       this.v = v;
   }
   public static void main(String[] args) {
    g<Integer,String>d=new g<>();
     d.setT("vhgffdrddd");
     d.setV(65);
     System.out.println( d.getT());
     System.out.println(d.getV());
    

   }
}