import com.syrovatka.hillel.Animal;
import com.syrovatka.hillel.Cat;
import com.syrovatka.hillel.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Мася", 7);
        Animal animal2 = new Dog("Барсік", 1);
        Animal animal3 = new Dog("Бім", 12);
        Animal animal4 = new Dog("Тайфун", 3);
        Animal animal5 = new Cat("Рижик", 3);
        Animal animal6 = new Cat("Пончик", 5);
        Animal animal7 = new Dog("Ельза", 10);
        Animal animal8 = new Dog("Блонді", 4);
        Animal animal9 = new Cat("Фріц", 2);
        System.out.println(animal8.toString());
        System.out.println(Animal.getCount());
    }

}