package lang.string.immutable;

public class StringImmutable2 {
    //String은 불변 객체이다. 생성 이후 절대 변경 불가

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); //합침
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2); //이건 바뀜
        //String은 불변 객체이다. 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환
        
    }
}
