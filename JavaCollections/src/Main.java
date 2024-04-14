//все запускается отсюда
/* Выводы для задания 2:
        В данном задании были рассмотрены методы добавления элементов в листы, а также выбор элементов.
        Если с добавлением add() у обоих листов все нормально (хоть и Linked немного выигрывает), то с получением элементов
        все иначе. LinkedList сработал во много раз хуже ArrayList из-за способов перебора элементов: у 1-го итерация проходит по
        связным ссылкам до искомого элемента, а у 2-го - по индексу, что насного проще и быстрее.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        HashM.hashM();

        System.out.println("Задание 2.1: ArrayList");
        ArrListTesting.arrList();
        long startTime = System.nanoTime();         // nanoTime() поточнее будет, чем currentTimeMillis() :)
        ArrListTesting.arrList();
        long endTime = System.nanoTime();
        System.out.println("Total time = " + (int) (endTime-startTime));

        System.out.println("Задание 2.1: LinkedList");
        LinkListTesting.linkList();
        startTime = System.nanoTime();
        LinkListTesting.linkList();
        endTime = System.nanoTime();
        System.out.println("Total time = " + (int) (endTime-startTime));

        System.out.println("Задание 3: удаление дубикатов в ArrayList без contains()");
        NoDubs.noDubs();
    }
}
