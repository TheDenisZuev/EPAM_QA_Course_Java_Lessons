package ExceptionsLesson;

// В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы. У каждого студента есть
// несколько учебных предметов по которым он получает оценки.
// Необходимо реализовать иерархию студентов, групп и факультетов.
//
//        Посчитать средний балл по всем предметам студента
//        Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
//        Посчитать средний балл по предмету для всего университета

import ExceptionsLesson.Data.Faculty;
import ExceptionsLesson.Data.Group;
import ExceptionsLesson.Data.Student;
import ExceptionsLesson.Data.University;
import ExceptionsLesson.Exceptions.FacultyHasNotGroup;
import ExceptionsLesson.Exceptions.GroupHasNotStudents;
import ExceptionsLesson.Exceptions.StudentHasNotSubject;
import ExceptionsLesson.Exceptions.UniversityHasNotFaculty;
import ExceptionsLesson.Specifications.ListFaculties;
import ExceptionsLesson.Specifications.ListGroups;
import ExceptionsLesson.Specifications.ListSubjects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static ExceptionsLesson.Specifications.ListSubjects.*;

public class TaskException {

    private static List<Student> studentsFirst;

    static {
        try {
            studentsFirst = Arrays.asList(
                        new Student("Zuev D.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 5);
                            put(ARCHEOLOGY, 7);
                            put(RUSSIAN, 7);
                        }}),
                        new Student("Grechushev A.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 6);
                            put(ARCHEOLOGY, 8);
                            put(RUSSIAN, 8);
                        }}),
                        new Student("Chichilanov N.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 4);
                            put(ARCHEOLOGY, 6);
                            put(RUSSIAN, 6);
                        }})
                );
        } catch (StudentHasNotSubject studentHasNotSubject) {
            studentHasNotSubject.printStackTrace();
        }
    }

    private static List<Student> studentsSecond;

    static {
        try {
            studentsSecond = Arrays.asList(
                        new Student("Ivanov I.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 4);
                            put(ARCHEOLOGY, 2);
                            put(RUSSIAN, 2);
                        }}),
                        new Student("Petrov P.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 1);
                            put(ARCHEOLOGY, 2);
                            put(RUSSIAN, 3);
                        }}),
                        new Student("Sidorov S.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 5);
                            put(ARCHEOLOGY, 6);
                            put(RUSSIAN, 7);
                        }})
                );
        } catch (StudentHasNotSubject studentHasNotSubject) {
            studentHasNotSubject.printStackTrace();
        }
    }

    private static List<Student> studentsThird;

    static {
        try {
            studentsThird = Arrays.asList(
                        new Student("Shevtcov S.", new HashMap<ListSubjects, Integer>(){{
                            put(PHILOSOPHY, 4);
                            put(ARCHEOLOGY, 2);
                            put(RUSSIAN, 2);
                        }}),
                        new Student("Lapenko L.", new HashMap<ListSubjects, Integer>(){{
                        }})
                );
        } catch (StudentHasNotSubject studentHasNotSubject) {
            studentHasNotSubject.printStackTrace();
        }
    }

    private static List<Group> groupHistory;

    static {
        try {
            groupHistory = Arrays.asList(
                        new Group(ListGroups.FIRST, studentsFirst, new ListSubjects[]{ARCHEOLOGY,RUSSIAN}),
                        new Group(ListGroups.SECOND, studentsSecond, new ListSubjects[]{ARCHEOLOGY,RUSSIAN})
                );
        } catch (GroupHasNotStudents groupHasNotStudents) {
            groupHasNotStudents.printStackTrace();
        }
    }

    private static List<Group> groupLaw;

    static {
        try {
            groupLaw = Arrays.asList(
                        new Group(ListGroups.SECOND, studentsSecond, new ListSubjects[]{PHILOSOPHY,RUSSIAN}),
                        new Group(ListGroups.THIRD, studentsThird, new ListSubjects[]{PHILOSOPHY,RUSSIAN})
                );
        } catch (GroupHasNotStudents groupHasNotStudents) {
            groupHasNotStudents.printStackTrace();
        }
    }

    public  static List<Faculty> faculties;

    static {
        try {
            faculties = Arrays.asList(
                        new Faculty(ListFaculties.HISTORICAL, groupHistory),
                        new Faculty(ListFaculties.LAW, groupLaw)
                );
        } catch (FacultyHasNotGroup facultyHasNotGroup) {
            facultyHasNotGroup.printStackTrace();
        }
    }

    public static void main(String[] args) throws UniversityHasNotFaculty {
        University university = new University(faculties);

        university.averageScoreSubjectsStudent("Zuev D.");
        university.averageScoreSubjectGroupFaculty(ListFaculties.HISTORICAL, ListGroups.FIRST, ARCHEOLOGY);
        university.averageScoreSubjectInUniversity(RUSSIAN);
    }
}
