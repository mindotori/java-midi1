package lang.immutable.test;

public class ImmutableMyDate {
//불변 클래스
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //값을 바꿔서 기존 값에 넣어서 새로운 값 반환 = with~
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear,month,day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year,newMonth,day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year,month,newDay);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;

    }
}
