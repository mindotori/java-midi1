package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a; //참조
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        change(b,"부산"); //b를 부산으로 바꿈
        System.out.println("a = " + a); //a값도 같이 바뀌어버림
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAdress){
        System.out.println("주소 값을 변경합니다 -> " + changeAdress);
        address.setValue(changeAdress);
    }
}
