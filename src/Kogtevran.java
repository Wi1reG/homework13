public class Kogtevran extends hogwarts{

    private int smart;
    private int wise;
    private int witty;
    private int creation;

    public Kogtevran(int power, int transgress, String surname, String name, int smart, int wise, int witty, int creation) {
        super(power, transgress, name, surname);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creation=" + creation +
                ", power=" + getPower() +
                ", transgress=" + getTransgress() +
                '}';
    }

    public int getSumScore() {
        int sum = 0;
        sum = this.smart + this.wise + this.witty + this.creation;
        return sum;



    }

    public static void equals(Kogtevran student1, Kogtevran student2) {

        int sum1 = student1.getSumScore();
        int sum2 = student2.getSumScore();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучше когтевранец чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучше когтевранец чем " + student1.getName());
        } else {
            System.out.println("студенты равны");

        }

    }
}
