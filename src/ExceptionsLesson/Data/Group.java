package ExceptionsLesson.Data;

import ExceptionsLesson.Exceptions.GroupHasNotStudents;
import ExceptionsLesson.Specifications.ListGroups;
import ExceptionsLesson.Specifications.ListSubjects;

import java.util.List;

public class Group {
    private ListGroups listGroups;
    private List<Student> listStudents;

    public Group(ListGroups listGroups, List<Student> listStudents,
                 ListSubjects [] listSubjects) throws GroupHasNotStudents {
        this.listGroups = listGroups;
        this.listStudents = listStudents;
    }

    public ListGroups getListGroups() {
        return listGroups;
    }

    public void setListGroups(ListGroups listGroups) {
        this.listGroups = listGroups;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public boolean hasStudentGroup(String group){
        boolean studentGroup = false;
        for (Student student : listStudents){
            if(student.getStudentName().equals(group)){
                studentGroup = true;
            }
        }
        return studentGroup;
    }

    public double averageStudentScore(String studentName){
        Double average = Double.valueOf(0);
        for (Student student : listStudents){
            if(student.getStudentName().equals(studentName)){
                average = student.averageScore();
            }
        }
        return average;
    }

}
