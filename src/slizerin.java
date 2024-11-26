public class slizerin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public slizerin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
    }

    public static void compareStudents(slizerin student1, slizerin student2) {
        int score1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int score2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;

        System.out.println("Сравнение студентов Слизерина:");
        if (score1 > score2) {
            System.out.println(student1.name + " лучше, чем " + student2.name);
        } else if (score1 < score2) {
            System.out.println(student2.name + " лучше, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по качествам.");
        }
    }
}