package lang.string.test;
// 공백 제거
public class TestString7 {

    public static void main(String[] args) {
        String original = "    Hello Java    ";

        String trimmed = original.trim();
        System.out.println("trimmed = "+ trimmed);
    }
}
