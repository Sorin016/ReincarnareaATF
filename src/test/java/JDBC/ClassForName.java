package JDBC;

public class ClassForName {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassForName classForName=new ClassForName(); //apeleaza ambele si static si instance
        Class.forName("JDBC.ClassForName"); // apeleaza doar static
    }
    static{
        System.out.println("Inauntru la static class");
    }
    {
        System.out.println("Inauntru la instance class, ea este apelata cind creezi obiectul");
    }
}
