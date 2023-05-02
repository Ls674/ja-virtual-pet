public class Character {
    private String name;
    private String job;
    private int age;

    public Character(String name , String job , int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }
    public String toString(){
        return "This characters name is " + name;
    }


}
