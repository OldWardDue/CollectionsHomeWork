import java.util.LinkedList;
import java.util.Random;
import java.util.List;

public class LinkListTesting {
    public static void linkList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {             //задаем и добавляем кучу значений
            linkedList.add(i);
        }

        int nums = 1000;
        LinkListTesting objectLink = new LinkListTesting();


        System.out.println(objectLink.getElementsRandomly(linkedList, nums));      //вывод

    }

    public List<Integer> getElementsRandomly(List<Integer> list, int items) {          //также метод выбора рандомышей
        Random rand = new Random();

        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < items; i++) {

            int randInd = rand.nextInt(list.size());

            list2.add(list.get(randInd));

        }
        return list2;
    }
}