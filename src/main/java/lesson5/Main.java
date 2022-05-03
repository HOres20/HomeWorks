package lesson5;

public class Main {
    public static void main(String[] args) {
    Employee person1 = new Employee("Джон Смит", "Разработчик ПО", "people@gmail.com", "8708562876", 89328.30,35 );
    Employee person2 = new Employee("Джон Грин", "обработчик сетей", "people@gmail.com", "8708562876", 50000,22 );
    Employee person3 = new Employee("Аделя Жанузакова", "бухгалтер", "people@gmail.com", "8708562876", 80000,47 );
    Employee person4 = new Employee("Гульман", "уборщик", "people@gmail.com", "8708562876", 15000,60 );
    person1.displayInfo();
    person2.displayInfo();
    person3.displayInfo();
    person4.displayInfo();

    Employee[] persons = new Employee[4];
    persons [0] = person1;
    persons [1] = person2;
    persons [2] = person3;
    persons [3] = person4;

        System.out.println("Наши Ветераны:\n");
        for (Employee person :
             persons) {
            person.checkInfo();
        }

    }


}
