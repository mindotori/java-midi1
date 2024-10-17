package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { //연결 예외를 잡음
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: "+ e.getMessage());
        } catch (SendExceptionV3 e) { //전송 예외를 잡음
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: "+e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
