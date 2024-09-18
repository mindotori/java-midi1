package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));//-1 찾으면 -1 반환
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));//없으니 -1 반환

    }

    private static int findValue(int[] intArr, int target){
        for (int value : intArr) {
            if(value == target){
                return value;
            }
        }
        return -1; // 루프에서 못찾으면 -1 반환
    }

    //입력값이 -1일때도 -1을 반환하고, 100일때도 -1을 반환한다.
    //명확하지 않다
    //객체의 경우에는 데이터가 없다는 null이 명확하게 존재한다.
}
