package exception.basic.unchecked;

public class Client {
    public void call(){ //throws 안해도 됨
        throw new MyUncheckedException("ex");
    }
}
