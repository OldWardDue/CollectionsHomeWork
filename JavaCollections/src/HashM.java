import java.util.HashMap;
import java.util.Map;

//1 задание: метод, который меняет местами ключи и значения
public class HashM {
    public static void hashM() {
        HashMap<Integer, String> latestGamesPlayed = new HashMap<>();

        latestGamesPlayed.put(1, "Cyberpunk 2077");       //заполняем мапу
        latestGamesPlayed.put(2, "Mass Effect 1-3");
        latestGamesPlayed.put(3, "Baldur's Gate 3");
        latestGamesPlayed.put(4, "Civilization V");
        latestGamesPlayed.put(5, "Bioshock Infinity");

        HashMap<String, Integer> latestGamesPlayed2 = new HashMap<>();       //создаем новую мапу

        for(Map.Entry<Integer, String> change : latestGamesPlayed.entrySet()) {  //с помощью цикла проходимся по мапе
            latestGamesPlayed2.put(change.getValue(), change.getKey());           //и вкладываем измененные местами данные
        }

        System.out.println(latestGamesPlayed);       //смотрим изменения:)
        System.out.println(latestGamesPlayed2);
    }
}