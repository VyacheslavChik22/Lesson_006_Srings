import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
// Задание 1 Бухгалтерия попросила написать программу, в которо можно работать с Ф.И.О. сотрудников.
        System.out.println("\n*** Задание 1: Фамилия, имя, отчество сотрудника ***");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName +  middleName;
        System.out.println(fullName);

// Задание 2 Ф.И.О. сотрудника должны быть выведены в верхнем регистре.

        System.out.println("\n*** Задание 2: Фамилия, имя, отчество сотрудника вывести в верхнем регистре ***");

        String fullNameUpp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpp);

// Задание 3 Система, в которой мы работаем, не принимает символ “ё”.
//Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
//В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        System.out.println("\n*** Задание 3: Написать программу, которая заменяет символ “ё” на символ “е” ***");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);


    }
}
