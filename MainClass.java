package lesson4;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Михайлов", "223344");
        phonebook.add("Михайлов", "22334411");
        phonebook.add("Песков", "22334499");
        phonebook.add("Угрюмов", "22334488");
        phonebook.add("Михайлов", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Михайлов");
        System.out.println(phonebook.get("Михайлов"));
        System.out.println("Песков");
        System.out.println(phonebook.get("Песков"));
        System.out.println("Угрюмов");
        System.out.println(phonebook.get("Угрюмов"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Михайлов", "223344");
        System.out.println("Михайлов");
        System.out.println(phonebook.get("Михайлов"));
    }
}