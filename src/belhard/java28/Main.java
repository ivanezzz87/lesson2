package belhard.java28;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1987;
        int monthOfBirthday = 1;
        int dayOfBirthday = 9;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        boolean monthBiggerDay = false;
        if (monthOfBirthday > dayOfBirthday) {
            monthBiggerDay = true;
        }
        System.out.println("Сумма моего года, месяца и дня рождения:" + sum);
        System.out.println("Месяц моего рождения больше даты рождения:" + monthBiggerDay);
        char [] name = new char[]{'И', 'В', 'А', 'Н'};
        System.out.println("Массив с моим именем:" + String.valueOf(name));
        double myAge = 34.0;
        double partYear = 2.0 / 12.0;
        myAge += partYear;
        System.out.println("Мне " + myAge + " лет");
}
