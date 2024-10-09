package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        //선언과 구현이 따로
//        class LocalPrinter implements Printer {
//            int value = 0; //인스턴스 변수
//
//            @Override
//            public void print() {
//                System.out.println("value = " + value);
//                System.out.println("localVar=" + localVar);
//                System.out.println("paramVar=" + paramVar);
//                System.out.println("outInstanceVar=" + outInstanceVar);
//            }
//        }
//        LocalPrinter printer = new LocalPrinter();

        Printer printer = new Printer() {
            //생성하면서 바로 body로 구현 (선언과 구현이 하나)
            // => Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print(); //바로 호출 가능
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}
