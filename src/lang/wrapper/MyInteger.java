package lang.wrapper;
// int는 클래스가 아니지만 int값을 가지고 클래스를 만들면 된다
// 특정 기본형을 감싸서 만드는 클래스를 래퍼 클래스(Wrapper class)라고 한다.
public class MyInteger {

    //단순한 데이터 조각인 int를 내부에 품고, 메서드를 통해 다양한 기능을 추가

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target){
        if(value < target){
            return -1;
        } else if(value > target) {
            return 1 ;
        } else{
            return 0;
        }
    }

    @Override
    public String toString() {
        //return "" + value; //문자 + 숫자 = 문자
        return String.valueOf(value); // int -> string
    }
}
