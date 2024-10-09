package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process){ //파라미터에 Process 구현체 넣음
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    static class Dice implements Process{

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process{

        @Override
        public void run() {
            for(int i =0; i <= 3; i++){
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        //다형성을 활용해서 외부에서 전달되는 인스턴스에 따라 각각 다른 코드 조각이 실행
        Dice dice = new Dice();
        Sum sum = new Sum();
        //hello()를 호출할 때 어떤 인스턴스를 전달하는 가에 따라 다른 결과 실행
        hello(dice);
        hello(sum);
        //코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고 해당 인스턴스에 있는 메서드를 호출하면 됨
    }
}
