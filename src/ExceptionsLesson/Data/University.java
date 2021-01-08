package ExceptionsLesson.Data;

import ExceptionsLesson.Exceptions.UniversityHasNotFaculty;
import ExceptionsLesson.Specifications.ListFaculties;
import ExceptionsLesson.Specifications.ListGroups;
import ExceptionsLesson.Specifications.ListSubjects;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties = new ArrayList<Faculty>();

    public University(List<Faculty> faculties) throws UniversityHasNotFaculty {
        this.faculties = faculties;
    }

    public void addFacultyUniversity(ArrayList<Faculty> universityList){
        this.faculties = universityList;
    }

    public void averageScoreSubjectsStudent(String nameStudent){
        for (Faculty faculty : faculties){
            for (Group group : faculty.getGroups()){
                if(group.hasStudentGroup(nameStudent)){
                    System.out.println("Average score all subjects to " + nameStudent + " = "
                            + group.averageStudentScore(nameStudent) + " at group " + group.getListGroups());
                }
            }
        }
    }

    public int getFacultyStudent (ListFaculties listFaculties){
        int facultyStudent = -1;
        for (Faculty faculty : faculties){
            if(faculty.getListFaculties().equals(listFaculties)){
                facultyStudent = faculties.indexOf(faculty);
            }
        }
        return facultyStudent;
    }

    public void averageScoreSubjectGroupFaculty(ListFaculties listFaculties, ListGroups listGroups,
                                                ListSubjects listSubjects){
        double sumSubject = 0;
        double average =0;
        int numberFaculty = getFacultyStudent(listFaculties);
        if(numberFaculty >= 0){
            Faculty faculty = faculties.get(numberFaculty);
            int numberGroup = faculty.getSortNumberGroup(listGroups);
            if(numberGroup >= 0){
                Group groupName = faculty.getGroups().get(numberGroup);
                for(Student student : groupName.getListStudents()){
                    if(student.hasStudentSubject(listSubjects)){
                        sumSubject += student.getScore(listSubjects);
                    }
                }
                average = sumSubject / groupName.getListStudents().size();
            }
        }
        System.out.println("Average score on " + listSubjects + " in group "
                + listGroups + " on Faculty " + listFaculties + " equals "+ average);
    }

    public void averageScoreSubjectInUniversity(ListSubjects listSubjects){
        double sumSubject = 0;
        double average = 0;
        int counterStudentsWithSubject = 0;
        for (Faculty faculty : faculties){
            for(Group group : faculty.getGroups()){
                for(Student student : group.getListStudents()){
                        if(student.hasStudentSubject(listSubjects)){
                        sumSubject += student.getScore(listSubjects);
                        counterStudentsWithSubject++;
                    }
                }
            }
        }
        average = sumSubject / counterStudentsWithSubject;
        System.out.println("Average score on subject " + listSubjects
                + " on all University " + average);
    }
}
