public class SloganTester {
    public static void main(String[] args) {
        Slogan slogan1 = new Slogan("Test1");
        System.out.println(Slogan.getCount());
        System.out.println(slogan1.toString());
        Slogan slogan2 = new Slogan("Test2");
        System.out.println(Slogan.getCount());
        System.out.println(slogan2.toString());
        Slogan slogan3 = new Slogan("Test3");
        System.out.println(Slogan.getCount());
        System.out.println(slogan3.toString());
        Slogan slogan4 = new Slogan("Test4");
        System.out.println(Slogan.getCount());
        System.out.println(slogan4.toString());
    }
}
