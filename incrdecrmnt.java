public class incrdecrmnt {
    public static void increemnt() {
        int a=2,b,c;
        b=a++;
        c=++a;
        System.out.println("increemented values="+b);
        System.out.println("increemntd values="+c);
        System.out.println("value of a="+a);
    }
    public static void decreement() {
        int a=10,b,c;
        b=a--;
        c=--a;
        System.out.println("decreemented values="+b);
        System.out.println("decreemented value="+c);
        System.out.println("value of a="+a);
    }
    public static void main(String[] args) {
      
        increemnt();
        decreement();
    }
}
