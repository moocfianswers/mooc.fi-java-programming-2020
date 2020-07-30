
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
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

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;

        if (this.day > 30) {
            this.month = this.month + 1;
            this.day = 1;

            if (this.month > 12) {
                this.year = this.year + 1;
                this.month = 1;
            }
        }
    }

    public void advance(int howManyDays) {
        int counter = 0;
        while (counter < howManyDays) {
            this.advance();
            counter = counter + 1;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate date = new SimpleDate(this.day, this.month, this.year);

        int counter = 0;
        while (counter < days) {
            date.advance();
            counter = counter + 1;
        }

        return date;
    }
}
