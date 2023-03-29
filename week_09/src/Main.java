import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("cow", 1));
    animals.add(new Animal("tiger", 6));
    animals.add(new Animal("pig", 2));
    animals.add(new Animal("dog", 4));
    animals.add(new Animal("duck", 5));
    animals.add(new Animal("zebra", 7));
    animals.add(new Animal("cat", 3));
    animals.add(new Animal("elephant", 8));
    animals.add(new Animal("hippo", 9));
    animals.add(new Animal("horse", 10));

//    ----------- задача 1 ------------------
  int age = checkAge(animals, "lion");
  System.out.println(age);

//    ----------- задача 2 -----------------
    List<Animal> sortedAnimals = animals.stream().sorted(Comparator.comparing(Animal::getAge)).collect(Collectors.toList());
    sortedAnimals.stream().forEach(animal -> System.out.println(animal.getName() + " " + animal.getAge()));

//    ----------- задача 3 ------------------
    long animalsCount = animals.stream().filter(an -> an.getAge() > 4).count();
    System.out.println("Count " + animalsCount);

//    ----------- задача 4 ------------------
        Map<String, Integer> animalsMap = convertAnimals2Hashmap(animals);
        System.out.println("Map " + animalsMap);

//    ----------- задача 5 ------------------
    String animalsStr = animals.stream()
                .map(Animal::getName)
                .reduce("reduce", (a, b) -> a + "_" + b);
        System.out.println(animalsStr);
    }

    public static Map convertAnimals2Hashmap(List<Animal> arrayList){
        Map<String, Integer> animalsMap = new HashMap<>();
        for(Animal animal : arrayList){
            animalsMap.put(animal.getName(), animal.getAge());
        }
        return animalsMap;
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

