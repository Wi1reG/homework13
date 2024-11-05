public class Gryffindor extends hogwarts {

    private String name;
    private String surname;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int power, int transgress, String name, String surname, int honor, int nobility, int bravery) {
        super(power, transgress);
        this.name = name;
        this.surname = surname;
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
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
            System.out.println(student1.name + " лучше грифиндорец чем " + student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " лучше грифиндорец чем " + student1.name);
        } else {
            System.out.println("студенты равны");

        }


    }
}
