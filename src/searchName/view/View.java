package searchName.view;

public class View {
    //цей метод печатоє результат, якщо conter нарахував >0
    // тоді він печатає ім'я та його кількість співпадінь
    //якщо ні тоді текст не совподіння
    public void print(String name, int count) {
        if (count > 0) {
            System.out.println("Ім'я: " + name + " співпадає:" + count);
        } else {
            System.out.println("Такого імені немає в списку!");
        }
    }
}
