public class grifindor extends hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public grifindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + courage);
    }

    public static void compareStudents(grifindor student1, grifindor student2) {
        int score1 = student1.nobility + student1.honor + student1.courage;
        int score2 = student2.nobility + student2.honor + student2.courage;

        System.out.println("Сравнение студентов Гриффиндора:");
        if (score1 > score2) {
            System.out.println(student1.name + " лучше, чем " + student2.name);
        } else if (score1 < score2) {
            System.out.println(student2.name + " лучше, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по качествам.");
        }
    }
}