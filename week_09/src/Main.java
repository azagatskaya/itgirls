import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("cow", 1));
    animals.add(new Animal("pig", 2));
    animals.add(new Animal("cat", 3));
    animals.add(new Animal("dog", 4));
    animals.add(new Animal("duck", 5));
    animals.add(new Animal("tiger", 6));
    animals.add(new Animal("zebra", 7));
    animals.add(new Animal("elephant", 8));
    animals.add(new Animal("hippo", 9));
    animals.add(new Animal("horse", 10));

    int age = checkAge(animals, "lion");
        System.out.println(age);
}
    public static int checkAge(List<Animal> animals, String name){
        Optional<Animal> first = animals.stream().filter(animal -> animal.getName().equals(name)).findFirst();
        if(first.isPresent()){
            return first.get().getAge();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

