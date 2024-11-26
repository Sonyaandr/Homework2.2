public class puffenduy extends hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public puffenduy(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public static void compareStudents(puffenduy student1, puffenduy student2) {
        int score1 = student1.diligence + student1.loyalty + student1.honesty;
        int score2 = student2.diligence + student2.loyalty + student2.honesty;

        System.out.println("Сравнение студентов Пуффендуя:");
        if (score1 > score2) {
            System.out.println(student1.name + " лучше, чем " + student2.name);
        } else if (score1 < score2) {
            System.out.println(student2.name + " лучше, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по качествам.");
        }
    }
}