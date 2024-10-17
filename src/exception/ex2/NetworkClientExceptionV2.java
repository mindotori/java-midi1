package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    // 예외도 객체이다
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() { //조회
        return errorCode;
    }
}
