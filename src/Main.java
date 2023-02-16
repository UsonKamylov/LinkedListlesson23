import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat>cats=new ArrayList<>();
        Cat cat=new Cat("Tom",2);
        Cat cat2=new Cat("Tosm",3);
        Cat cat3=new Cat("Tosm",4);
        Cat cat4=new Cat("Tomx",6);
        Cat cat5=new Cat("To",5);
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        Name(cats,"Tom");


    }
    public static void Name(ArrayList<Cat> cats, String name){
        for (Cat c:cats ) {
            if(c.getName().equals(name)){
                System.out.println(c);
            }
        }

    }
    public static void Age(ArrayList<Cat> cats, int age){
        for (Cat s:cats) {
            if (s.getAge()==age){
                System.out.println(s);
            }

        }
    }
}