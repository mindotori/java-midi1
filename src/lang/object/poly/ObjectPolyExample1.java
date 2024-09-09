package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        //Object o = dog; 가능 (부모는 자식을 담을 수 있다)

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); // 컴파일 오류, Objectsms move()가 없다.
        //없으면 위로는 올라갈 수 있지만 밑으로 내려갈 순 없다.
        //Object는 최종 부모이므로 더는 올라가서 찾을 수 없음 => 오류


        //객체에 맞는 다운캐스팅 필요***
        if(obj instanceof Dog dog){
            dog.sound();
        } else if(obj instanceof Car car){
            car.move();
        }
    }
}
