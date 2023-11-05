public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Результат выполнения задания 1:");
        task_1();
        System.out.println();
        System.out.println("Результат выполнения задания 2:");
        task_2();
        System.out.println();
        System.out.println("Результат выполнения задания 3:");
        task_3();
        System.out.println();
        System.out.println("Результат выполнения задания 4:");
        task_4();

    }

//        Задание 1
//        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
//        с Ф. И. О. на три — на фамилию, имя и отчество.
//        В качестве исходных данных используйте: Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
//        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
//        переменная firstName — для хранения имени;
//        переменная middleName — для хранения отчества;
//        переменная lastName — для хранения фамилии.
//        Решите задание с помощью метода substring().
//        Результат программы выведите в формате:
//        “Имя сотрудника — …”
//        “Фамилия сотрудника — …”
//        "Отчество сотрудника — ...”
//💡       Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
//        Их должен вычислить компьютер.
//        Определить индексы символов помогут методы indexOf() и lastIndexOf().

    public static void task_1() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstSpaceIndex = fullName.indexOf(' ');
        int secondSpaceIndex = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(firstSpaceIndex + 1, secondSpaceIndex);
        String middleName = fullName.substring(secondSpaceIndex + 1);
        String lastName = fullName.substring(0, firstSpaceIndex);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

//        Задание 2
//        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
//        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
//        в правильный формат.
//        В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно
//        преобразовать в “Ivanov Ivan Ivanovich”.
//        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
//        - Подсказка 1
//        Метод toCharArray() может быть полезен.
//        - Подсказка 2
//        Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.

    public static void task_2() {
        String fullName = "ivanov ivan ivanovich";
        int firstSpaceIndex = fullName.indexOf(' ');
        int secondSpaceIndex = fullName.lastIndexOf(' ');
        char[] fullNameArray = fullName.toCharArray();
        fullNameArray[0] = Character.toUpperCase(fullNameArray[0]);
        fullNameArray[firstSpaceIndex + 1] = Character.toUpperCase(fullNameArray[firstSpaceIndex + 1]);
        fullNameArray[secondSpaceIndex + 1] = Character.toUpperCase(fullNameArray[secondSpaceIndex + 1]);
        String fullNameFixed = new String(fullNameArray);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameFixed);
    }

//    Задание 3
//    Имеется две строки.
//    Первая: "135"
//    Вторая: "246"
//    Соберите из двух строк одну, содержащую данные "123456".
//    Использовать сортировку нельзя.
//    Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
//    Выведите результат в консоль в формате: “Данные строки — ….”
//    - Подсказка
//    Следует использовать StringBuilder.

    public static void task_3() {
        String firstString = "135";
        String secondString = "246";
        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            newString = newString.append(firstStringArray[i]);
            newString = newString.append(secondStringArray[i]);
            }
        System.out.println("Данные строки - " + newString);
    }

//    Задание 4
//    Дана строка из букв английского алфавита "aabccddefgghiijjkk".
//    Нужно найти и напечатать буквы, которые дублируются в строке.
//    Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
//    В итоге в консоль должен быть выведен результат программы: "acdgijk".

    public static void task_4() {
        String initString = "aabccddefgghiijjkk";
        char[] initStringArray = initString.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < (initStringArray.length - 1); i++) {
            int currentSymbolIndex = resultString.indexOf(String.valueOf(initStringArray[i]));
            if (initStringArray[i + 1] == initStringArray[i] && currentSymbolIndex == -1){
                resultString = resultString.append(initStringArray[i]);
            }
        }
        System.out.println(resultString);

    }
}