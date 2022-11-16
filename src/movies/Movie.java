package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        setterNam(name);
        setterCat(category);
    }

    public void setterNam(String setterNam){
        this.name = setterNam;
    }
    public void setterCat(String setterCat){
        this.category = setterCat;
    }

    public static String getterNam(Movie e){
        return e.name;
    }
    public static String getterCat(Movie e){
        return e.category;
    }
}
