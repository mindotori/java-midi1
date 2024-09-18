package lang.string.test;

public class TestString5 {
    //str 에는 파일의 이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진다.
    //파일명과 확장자를 분리해서 출력하라
    //indexOf()와 substring()을 사용해서 출력하라

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext); //ext시작 인덱스 추출
        String fileName = str.substring(0,extIndex);//0부터 extIndex까지 추출
        String extName = str.substring(extIndex);//extIndex부터 끝까지 추출
        System.out.println("filename = " + fileName);
        System.out.println("extname = " + extName);
    }

}
