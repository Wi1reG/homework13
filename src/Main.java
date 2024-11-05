//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {

                new Gryffindor(90, 100, "Гарри", "Поттер", 90, 90, 90),
                new Gryffindor(100, 100, "Гермиона", "Грейнджер ", 100, 100, 100),
                new Gryffindor(100, 100, "Рон ", "Уизли ", 100, 100, 100)


        };
        System.out.println(gryffindors[0]);

        Hufflepuff[] hufflepuffs = {

                new Hufflepuff(100,100, "Захария", "Смит", 100,100,100),
                new Hufflepuff(100,100, "Седрик ", "Диггори", 100,100,100),
                new Hufflepuff(100,100, "Джастин ", "Финч-Флетчли", 100,100,100)

        };
        System.out.println(hufflepuffs[0]);

        Kogtevran[] kogtevrans = {

                new Kogtevran(100,100, "Чжоу", "Чанг", 100,100,100,100),
                new Kogtevran(100,100, "Падма ", "Патил ", 100,100,100,100),
                new Kogtevran(100,100, "Маркус ", "Белби", 100,100,100,100)

        };
        System.out.println(kogtevrans[0]);

        Slytherin[] slytherins = {

                new Slytherin(100,100,"Драко", "Малфой", 100,100,100,100,100),
                new Slytherin(100,100,"Грэхэм ", "Монтегю", 100,100,100,100,100),
                new Slytherin(100,100,"Грегори ", "Гойл ", 100,100,100,100,100)

        };
        System.out.println(slytherins[0]);

        Gryffindor.equals(gryffindors[0], gryffindors[1]);
        Hufflepuff.equals(hufflepuffs[0],hufflepuffs[1]);
        Kogtevran.equals(kogtevrans[0], kogtevrans[1]);
        Slytherin.equals(slytherins[0],slytherins[1]);
        hogwarts.equals(gryffindors[0], slytherins[0]);


    }
}