import java.util.Arrays;

public class java_assessment_practice {
    private String name;
    private String species;

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String newName){
        this.name = newName;
    }
    //Getter
    public String getSpecies(){
        return species;
    }
    //Setter
    public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }
    public String roar(){
       System.out.printf("I am %s, hear me roar!%n", name);
       return name;
    }
    //DIVIDE EXAMPLE METHOD ------
    //public static int half(int x){
        //return x/2;
    //}
    //public static void main(String[] args){
    //    System.out.println("half(4) = " + half(4));
    //}
    //EXAMPLE TO CHANGE A STRING -------
    public static String shout (String s){
        return s.toUpperCase() + "!!!";
    }



    public static void main (String[] args){
        System.out.println("shout(\"baby\") = " + shout("baby"));
        java_assessment_practice lion = new java_assessment_practice();
        lion.setName("Lion");//sets value for obj lion
        System.out.println("lion.getName() = " + lion.getName());
        System.out.println("roar() = " + lion.roar());//connecting roar method with animal obj animal=java_assessment_practice...
    }
}
