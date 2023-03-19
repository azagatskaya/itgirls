public class Dog implements Alive{

    String name;
    int age;
    double weight;
    static int count = 0;
    public Dog() {
    }

    @Override
    public void eat(double kg) {
        getBone();
        setWeight(kg);
        System.out.printf("%s eats %s kg, weight %s\n", this.name, kg, this.weight);
    }

    private static void getBone() {
        System.out.println("Я взял косточку");
    }

    @Override
    public void breath() {

    }

    public Dog(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    private void setWeight(double kg){
        this.weight += kg;
    }
}
