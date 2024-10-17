package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3{
//연결 실패시 발생하는 예외
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() { //조회
        return address;
    }
}
