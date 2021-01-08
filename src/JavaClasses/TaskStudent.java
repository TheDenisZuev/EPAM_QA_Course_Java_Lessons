package JavaClasses;


// Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//
//        Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//        Создать массив объектов. Вывести:
//        a) список студентов заданного факультета;
//        b) списки студентов для каждого факультета и курса;
//        c) список студентов, родившихся после заданного года;
//        d) список учебной группы.


public class TaskStudent {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student(1, "Zuev", "Denis", "Yurevich",
                1986, "Yuryuzan", 12345, "Historical", 1, 103);
        student[1] = new Student(2, "Grechuschev", "Shasha", "Sergeevich",
                1989, "Kundravy", 54321, "Cultural", 2, 201);
        student[2] = new Student(3, "Lukin", "Evgeny", "Aleksandrovich",
                1987, "Nyazepetrovsk", 12344, "Historical", 3, 303);
        student[3] = new Student(4, "Chichilanov", "Nikita", "Anatolievuch",
                1988, "Chelyabinsk", 33345, "Law", 4, 402);
        student[4] = new Student(5, "Shkirmontov", "Vitalii", "Sergeevich",
                1989, "Chesma", 55512, "Historical", 1, 103);

        for (Student s : student){
            s.studentsSomeFaculty("Cultural");
        }
        System.out.println();
        System.out.println("Students Historical faculty:");
        for (Student s: student){
            s.historicalFaculty();
        }
        System.out.println();
        System.out.println("Students Cultural faculty:");
        for (Student s: student){
            s.culturalFaculty();
        }
        System.out.println();
        System.out.println("Young students:");
        for (Student s : student){
            s.youngStudents(1986);
        }
        System.out.println();
        for (Student s : student){
            s.studentsSomeGroup(103);
        }
    }
}
