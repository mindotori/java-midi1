package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() == 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); //true - 문자열 풀
        //문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.
        //문자열 풀에서 똑같은 객체 반환 - 같은 참조값을 가지므로 == 비교에 성공
        //문자열 풀은 힙 영역 사용
        System.out.println("리터럴 equals 비교: " + (str3.equals((str4))));
    }
}
