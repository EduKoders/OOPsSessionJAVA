// "static void main" must be defined in a public class.
public class Main implements car,person {
    public void start(){
        System.out.println("starting");
    }
    public void walk(){
        System.out.println("walking");
    }
    public static void main(String[] args) {
        /*Person p1 = new Person();
        p1.age = 24;
        p1.name = "Jay";
        //System.out.println(p1.age+" "+p1.name);
        
        //Person p2 = new Person();
        p2.age = 31;
        p2.name = "Ayesha";
        //System.out.println(p2.age+" "+p2.name);
        
        //p1.walk();
        //p2.eat();
        //p1.walk(23);
        //p2.walk(32);
        //Person p3 = new Person(23,"phi");
        //System.out.println(p3.age+" "+p3.name);*/
        //Developer d1=new Developer(25,"ashita");
        //d1.walk();
        //d1.walk(23);
        //Person p1 = new Person();
        //p1.age=30;  error
        //p1.name ="JAYYY"; error
        //System.out.println(p1.age+" "+p1.name); error
        //p1.setAge(23);
        //p1.setName("Jay");
        //System.out.println(p1.getAge()+" "+p1.getName());
        //bmw c1 = new bmw(); 
        //c1.start(); 
        Main m=new Main();
        m.start();
        m.walk();
    }
}

/*class Developer extends Person{
    public Developer(int age,String name) {
        super(age, name);
    }
    void walk(){
        System.out.println("Developer "+name + " is walking.");
    }
}

class Person {
    String name;
    int age;
    public Person(){
        System.out.println("constructor called");
    }
    
    public Person(int age, String name){
        this.age= age;
        this.name=name;
    }
    
    void walk(){
        System.out.println(name + " is walking.");
    }
    
    void eat(){
        System.out.println(name + " is eating.");
    }
    
    void walk(int steps){
         System.out.println(name + " walked "+steps+" steps.");
    }
}*/

/*class Person {
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}*/
/*class audi extends car{
    void start(){
        
    }
}

class bmw extends car{
    void start(){
        
    }
}

abstract class car{
    int price;
    abstract void start();
}*/

interface car {
    void start ();
}
interface person{
    void walk();
}
