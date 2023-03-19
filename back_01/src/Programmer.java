public class Programmer implements Alive {
    String name;
    int age;
    double weight;
    static int count = 0;
    public Programmer(){}
    public Programmer(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void eat(double kg) {
        cook();
        setWeight(kg);
        System.out.printf("%s eats %s kg, weight %s\n", this.name, kg, this.weight);
    }

    private static void cook() {
        System.out.println("я приготовил");
    }

    @Override
    public void breath() {

    }
    private void setWeight(double kg){
        this.weight += kg;
    }
    public void print(){
        System.out.printf("%s %s\n", this.name, this.age);
    }
}
