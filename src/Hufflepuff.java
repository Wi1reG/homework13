public class Hufflepuff extends hogwarts {

    private int hardworking;
    private int loyalty;
    private int honest;

    public Hufflepuff(int power, int transgress, String name, String surname, int hardworking, int loyalty, int honest) {
        super(power, transgress, name, surname);

        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }


    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honest=" + honest +
                ", power=" + getPower() +
                ", transgress=" + getTransgress() +
                '}';
    }

    public int getSumScore() {
        int sum = 0;
        sum = this.hardworking + this.loyalty + this.honest;
        return sum;



    }

    public static void equals(Hufflepuff student1, Hufflepuff student2) {

        int sum1 = student1.getSumScore();
        int sum2 = student2.getSumScore();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучше пуффендуец чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучше пуффендуец чем " + student1.getName());
        } else {
            System.out.println("студенты равны");

        }

    }
}
