public class Main {
    public static void main(String[] args) {
        grifindor harry = new grifindor("Гарри Поттер", 80, 70, 90, 85, 95);
        grifindor ron = new grifindor("Рон Уизли", 70, 65, 75, 80, 85);
        harry.describeStudent();
        ron.describeStudent();
        grifindor.compareStudents(harry, ron);

        slizerin draco = new slizerin("Драко Малфой", 85, 75, 95, 90, 85, 80, 70);
        slizerin goyle = new slizerin("Грегори Гойл", 70, 65, 60, 55, 50, 45, 40);
        draco.describeStudent();
        goyle.describeStudent();
        slizerin.compareStudents(draco, goyle);
    }
}