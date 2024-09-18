package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@"); //기점으로 쪼개서 배열에 담기
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
