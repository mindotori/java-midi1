package nested;
//변수의 이름이 같기 때문에 어떤 변수를 먼저 사용할지 우선순위가 필요하다.
//다른 변수들을 가려서 보이지 않게 하는 것을 섀도잉(Shadowing)이라 한다.
public class ShadowingMain {
    public int value = 1;
    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
