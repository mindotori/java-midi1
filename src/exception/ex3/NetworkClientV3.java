package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError; //true면 연결실패 //boolean 기본값 false
    public boolean sendError; //true면 연결실패

    public NetworkClientV3(String address){
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 { //체크 예외라 반드시 적어줘야함
        if(connectError){
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 { //예외 세분화
        if(sendError){
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
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
