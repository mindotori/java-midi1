package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
//연결 실패시 발생하는 예외
    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() { //조회
        return address;
    }
}
