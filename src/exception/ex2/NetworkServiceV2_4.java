package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        // 정상흐름과 예외흐름 분리
        try {
            //정상흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) { //정상이면 catch 안 감
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        // ⬇️ 예외 처리가 끝난 다음에 정상 흐름의 마지막에 호출
        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();   // => 항상 호출
    }
}
