package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        //String -> Integer (문자를 인티저로)
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        //int -> integer (박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
