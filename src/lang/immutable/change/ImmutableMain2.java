package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutavleObj obj1 = new ImmutavleObj(10);
        obj1.add(20); //값이 안바뀜

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = "+ obj1.getValue());
    }
}
