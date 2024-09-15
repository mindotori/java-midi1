package lang.immutable.change;


public class ImmutavleObj {

    private final int value;

    public ImmutavleObj(int value){
        this.value = value;
    }

    public ImmutavleObj add(int addValue){
        int result = value + addValue;
        return new ImmutavleObj((result));
    }

    public int getValue(){
        return value;
    }
}
