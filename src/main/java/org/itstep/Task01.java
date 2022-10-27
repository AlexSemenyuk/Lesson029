package org.itstep;

/**
 * Java. Lesson029. Task01
 * Exception
 * Semenyuk Alexander
 * Date 26.10.2022
 */
public class Task01 {
    public static void main(String[] args) {

        System.out.println("Start program");
        List<String> stringLists = new List<>(10);
        // Добавление с перебором
        for (int i = 0; i < stringLists.getSize() + 2; i++) {
            stringLists.add("A" + i);
        }
        stringLists.printArray();
        // Удаление с перебором
        for (int i = 0; i < stringLists.getSize() + 2; i++) {
            stringLists.removeLast();
        }
        stringLists.printArray();
        System.out.println("End program");
    }
}
