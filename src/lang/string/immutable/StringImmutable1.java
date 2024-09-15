package lang.string.immutable;

public class StringImmutable1 {
    //String은 불변 객체이다. 생성 이후 절대 변경 불가

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); //합침
        System.out.println("str = " + str); //합쳐지지 않음
    }
}
