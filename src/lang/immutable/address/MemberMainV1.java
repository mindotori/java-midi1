package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //Address address1 = memberB.getAddress();
        //address1.setValue("부산");
        //아래는 위랑 같은 코드
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> member.address");
        System.out.println("memberA = " + memberA);
        //a까지 바뀜 => 회원A와 회원B는 같은 Address 인스턴스를 참조하고 있기 때문(사이드 이펙트)
        System.out.println("memberB = " + memberB);
    }
}
