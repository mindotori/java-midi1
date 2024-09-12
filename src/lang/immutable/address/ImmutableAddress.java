package lang.immutable.address;

public class ImmutableAddress {
    //불변 객체 도입
    //객체의 상태(객체 내부의 값, 필드, 멤버 변수)가 변하지 않는 객체를 불변 객체라고 한다.
    //앞에 만든 Address 클래스를 불변 객체로 만들어보자

    // final로 멤버변수 선언 + setValue() 삭제해서 값 못바꾸게 함
    private final String value; //fianl 붙임 - 못바꿈

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
