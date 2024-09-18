package lang.string.test;

public class TestString6 {
    //검색 count
    //str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
    //indexOf()를 반복문과 함께 풀면 된다

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index =  str.indexOf(key);
        System.out.println("index = " + index);

        while(index >= 0){
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
