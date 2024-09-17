package lang.string.test;

public class TestString3 {
//str에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출력
    public static void main(String[] args) {
        String str = "hello.txt";

        System.out.println("index = " + str.indexOf(".txt"));
    }
}
