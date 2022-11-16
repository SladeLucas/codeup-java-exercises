import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] arr, String p){
        Person[] copy = Arrays.copyOf(arr, arr.length + 1);
        copy[copy.length-1] = new Person(p);
        System.out.println(p + " was added");
        for (Person pname : copy){
            System.out.println("Look a person = " + Person.getName(pname));
        }
    }

    public static void main(String[] arg){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person person = new Person ("Dave");
        Person person2 = new Person ("Steve");
        Person person3 = new Person ("Mike");
        Person[] Persons = {person, person2, person3};

        addPerson(Persons, "John");
        addPerson(Persons, "Greg");
    }
}
