public class hogwarts {

    private int power;
    private int transgress;
    private String name;
    private String surname;

    public hogwarts(int power, int transgress, String name, String surname) {

        this.power = power;
        this.transgress = transgress;
        this.name = name;
        this.surname = surname;
    }

    public static void equals(hogwarts student1, hogwarts student2) {
        int sum1 = student1.getPowerScore();
        int sum2 = student2.getPowerScore();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучше маг чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучше маг чем " + student1.getName());
        } else {
            System.out.println("студенты равны");

        }
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
