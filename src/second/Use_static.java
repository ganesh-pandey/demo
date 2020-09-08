package second;

public class Use_static {
    static int a=10;
    static String str ="Pandey";

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Use_static.a = a;
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        Use_static.str = str;
    }
    public void display(String str)
    {
        System.out.println("value of a-->"+a);
        System.out.println("value of this.str-->"+str);
    }
    public static void  dis()
    {
        System.out.println("dis function "+a);
        System.out.println("dis function "+str);

    }
}
