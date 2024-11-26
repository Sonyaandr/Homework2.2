public class kogtevran extends hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public kogtevran(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public static void compareStudents(kogtevran student1, kogtevran student2) {
        int score1 = student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int score2 = student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        System.out.println("Сравнение студентов Когтеврана:");
        if (score1 > score2) {
            System.out.println(student1.name + " лучше, чем " + student2.name);
        } else if (score1 < score2) {
            System.out.println(student2.name + " лучше, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по качествам.");
        }
    }
}