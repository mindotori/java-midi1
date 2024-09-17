package lang.string.chaining;

public class MethodChainingMain3 {
    //메서드 체이닝 - 코드를 간결하고 읽기 쉽게 만들어줌
    //StringBuilder는 메서드 체이닝 기법을 제공한다

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

    }
}
