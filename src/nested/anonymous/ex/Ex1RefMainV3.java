package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process){ //파라미터에 Process 구현체 넣음
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }



    public static void main(String[] args) {
        //익명 클래스로
        Process dice = new Process() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for(int i =0; i <= 3; i++){
                    System.out.println("i = " + i);
                }
            }
        };

        //위에서 바로 생성이라 생성할 필요 없음
        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
