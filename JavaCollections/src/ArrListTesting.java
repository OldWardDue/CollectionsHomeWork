import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/* 2 задание (часть 1): Реализуй метод, в котором создаются ArrayList, LinkedList
* и заполняются 1 000 000 случайными элементами одного и того же типа.
* После из ArrayList и LinkedList 1000 раз выбираем элемент по случайному индексу.
* Замерь время для ArrayList и LinkedList. Сравни результаты и предположи, почему они могут отличаться.*/
public class ArrListTesting {
    public static void arrList() {

        ArrayList<Integer> arrayL = new ArrayList<>();

        for(int i = 0; i < 1000000; i++){               //с помощью цикла добавляем много-много чисел
            arrayL.add(i);
        }

        int nums = 1000;
        ArrListTesting objectArr = new ArrListTesting();

        System.out.println(objectArr.getElementsRandomly(arrayL, nums));   //выводим


    }
    public List<Integer> getElementsRandomly(List<Integer> list, int items) {        //пропишем метод
        Random rand = new Random();

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < items; i++) {

            int randInd = rand.nextInt(list.size());

            list2.add(list.get(randInd));

        }
        return list2;
    }
}