

public class Person {

        private String name;

        public static String getName(Person pname) {
            return pname.name;
        }

        public String getName() {
//TODO: return the person's name
            return this.name;
        }

        public void setName(String nname) {
//TODO: change the name field to the passed value
            this.name = nname;
        }

        public void sayHello() {
//TODO: print a message to the console using the person's name
            System.out.println("Hello from " + this.name + "!");
        }

    public static void main(String[] args) {
        Person john = new Person("John");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
