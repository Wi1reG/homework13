public class Gryffindor extends hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int power, int transgress, String name, String surname, int honor, int nobility, int bravery) {
        super(power, transgress, name, surname);
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", power=" + getPower() +
                ", transgress=" + getTransgress() +
                '}';
    }

    public int getSumScore() {
        int sum = 0;
        sum = this.bravery + this.honor + this.nobility;
        return sum;


    }

    public static void equals(Gryffindor student1, Gryffindor student2) {

        int sum1 = student1.getSumScore();
        int sum2 = student2.getSumScore();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучше грифиндорец чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучше грифиндорец чем " + student1.getName());
        } else {
            System.out.println("студенты равны");

        }


    }
}
