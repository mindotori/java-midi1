package enumeration.ex2;

public class ClassGrade {
    // 타입 안전 열거형 패턴
    // 각각의 회원 등급별로  상수를 선언한다
    // 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입한다.
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가 - 외부에서 ClassGrade를 임의로 생성하지 못하게 막았다
    private ClassGrade() {}
}
