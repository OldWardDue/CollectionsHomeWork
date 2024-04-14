import java.util.ArrayList;
import java.util.HashSet;

public class NoDubs {
    public static void noDubs() {
        ArrayList<String> latestWatchedFilmsAndSeries = new ArrayList<>();

        latestWatchedFilmsAndSeries.add("Moon (2009)");
        latestWatchedFilmsAndSeries.add("Blood Diamond (2006)");
        latestWatchedFilmsAndSeries.add("Better Call Saul (2015)");
        latestWatchedFilmsAndSeries.add("Breaking Bad (2008)");
        latestWatchedFilmsAndSeries.add("Blue Eye Samurai (2023)");
        latestWatchedFilmsAndSeries.add("Breaking Bad (2008)");

        System.out.println(latestWatchedFilmsAndSeries);   //посмотрим до изменений

        HashSet<String> hashSetOfArrList = new HashSet<>();              //создадим HashSet, т.к. он все элементы в нем уникальны,
        hashSetOfArrList.addAll(latestWatchedFilmsAndSeries);            //а если и есть дубликаты, то он их просто удалит
        latestWatchedFilmsAndSeries.clear();                             //добавляем содержимое листа в сет, лист чистим
        latestWatchedFilmsAndSeries.addAll(hashSetOfArrList);            //добавляем (теперь уникальные) данные из сета обратно в лист

        System.out.println(latestWatchedFilmsAndSeries);                 //смотрим, что изменилось
    }
}
