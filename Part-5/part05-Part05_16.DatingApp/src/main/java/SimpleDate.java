
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate cloneDate = new SimpleDate(this.day, this.month, this.year);
        cloneDate.advance(days);
        return cloneDate;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;
        while (this.day > 30){
            this.day = this.day -30;
            this.month += 1;
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }
    }
}
