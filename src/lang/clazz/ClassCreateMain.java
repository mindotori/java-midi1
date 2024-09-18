package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        //둘 다 가능
        Class helloClass = Hello.class;
        //Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);

    }
}
