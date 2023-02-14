
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        Money newMoney = new Money(euros , cents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if (this.euros() < compared.euros()){
            return true;
        }if (this.euros() <= compared.euros() && this.cents() < compared.cents()){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        Money minusMoney = new Money(this.euros(), this.cents());
        int cents = this.cents();
        int euros = this.euros();
        if(this.lessThan(decreaser)){
            minusMoney = new Money(0, 0);
            return minusMoney;
        }
        if(this.cents < decreaser.cents()){
            cents += 100;
            cents -= decreaser.cents;
            euros -= 1;
            euros -= decreaser.euros;
        } else{
            cents -= decreaser.cents;
            euros -= decreaser.euros;
        }
        minusMoney = new Money(euros, cents);
        return minusMoney;
    }

}
