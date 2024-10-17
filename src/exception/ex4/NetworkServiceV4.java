package exception.ex4;


import exception.ex4.NetworkClientV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); //SendExceptionV3
        } finally {
            client.disconnect();
        }
    }
}
