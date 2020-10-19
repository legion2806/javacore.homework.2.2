import java.util.ArrayList;

public class Main {

    public static void main(String a[]) {

        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);

        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        // старый код: ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
        // list1.add(sample1);
        // list1.add(sample2);
        // ошибка несоответсвия типов

        ArrayList<Box> list2 =  new ArrayList<>();
        list2.add(sample1);
        list2.add(sample2);


    }
}
