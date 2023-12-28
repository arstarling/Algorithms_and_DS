package Practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int n = 100000; // Количество элементов в списке
        int middle = n / 2;
        Random random = new Random();

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: Время вставки в начало: " + (endTime - startTime) + " мс");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, random.nextInt());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: Время вставки в начало: " + (endTime - startTime) + " мс");

        // Далее можно провести аналогичные операции для конца, середины, удаления и поиска.
    }
}
