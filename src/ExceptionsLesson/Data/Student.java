package ExceptionsLesson.Data;

import ExceptionsLesson.Exceptions.StudentHasNotSubject;
import ExceptionsLesson.Specifications.ListSubjects;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentName;
    private HashMap <ListSubjects, Integer> subjectScoreList;

    public Student(String studentName, HashMap<ListSubjects, Integer> scoreList) throws StudentHasNotSubject {
        this.studentName = studentName;
        this.subjectScoreList = scoreList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public HashMap<ListSubjects, Integer> getSubjectScoreList() {
        return subjectScoreList;
    }

    public void setSubjectScoreList(HashMap<ListSubjects, Integer> subjectScoreList) {
        this.subjectScoreList = subjectScoreList;
    }

    public double averageScore(){
        double averageSum = 0;
        for (Map.Entry<ListSubjects, Integer> entry : subjectScoreList.entrySet()){
            averageSum += entry.getValue().doubleValue();
        }
        return averageSum / subjectScoreList.size();
    }

    public boolean hasStudentSubject(ListSubjects listSubjects){
        boolean hasSubject = false;
        for (Map.Entry<ListSubjects, Integer> entry : subjectScoreList.entrySet()){
            if (entry.getKey().equals(listSubjects)){
                return true;
            }
        }
        return hasSubject;
    }

    public int getScore(ListSubjects listSubjects){
        int score = 0;
        for (Map.Entry<ListSubjects, Integer> entry : subjectScoreList.entrySet()){
            if (entry.getKey().equals(listSubjects)){
                score = entry.getValue();
            }
        }
        return score;
    }
}
