package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    public class Engine {

        public void start() {
            System.out.println("충전 레벌 확인: " + chargeLevel);
            //내부클래스가 바깥클래스에 접근 가능하니 그냥 chargeLevel 쓰기 가능
            System.out.println(model + "의 엔진을 구동합니다...");
        }
    }

}
