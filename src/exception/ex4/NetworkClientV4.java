package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError; //true면 연결실패 //boolean 기본값 false
    public boolean sendError; //true면 연결실패

    public NetworkClientV4(String address){
        this.address = address;
    }

    public void connect() { //체크 예외라 반드시 적어줘야함
        if(connectError){
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) { //예외 세분화
        if(sendError){
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true; // => connectError 활성화
        }
        if(data.contains("error2")){
            sendError = true; // => sendError 활성화
        }
    }
}
