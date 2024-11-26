public class hogwarts {
    protected String name;
    protected int magicPower;
    protected int transgressionDistance;


    public hogwarts() {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName(){
        return name;
    }
    public void String setName(String name){
        this.name=name;
    }

    public void describeStudent() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }
}