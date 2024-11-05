public class hogwarts {

    private int power;
    private int transgress;

    public hogwarts(int power, int transgress) {

        this.power = power;
        this.transgress = transgress;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int getPowerScore() {
        int sum = 0;
        sum = this.power + this.transgress;
        return sum;


    }


}
