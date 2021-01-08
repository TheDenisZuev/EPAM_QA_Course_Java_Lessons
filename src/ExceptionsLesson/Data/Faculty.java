package ExceptionsLesson.Data;

import ExceptionsLesson.Exceptions.FacultyHasNotGroup;
import ExceptionsLesson.Specifications.ListFaculties;
import ExceptionsLesson.Specifications.ListGroups;

import java.util.List;

public class Faculty {
    private ListFaculties listFaculties;
    private List<Group> groups;

    public Faculty(ListFaculties listFaculties, List<Group> groups) throws FacultyHasNotGroup {
        this.listFaculties = listFaculties;
        this.groups = groups;
    }

    public ListFaculties getListFaculties() {
        return listFaculties;
    }

    public void setListFaculties(ListFaculties listFaculties) {
        this.listFaculties = listFaculties;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public int getSortNumberGroup (ListGroups listGroups){
        int numberGroup = -1;
        for (Group group : groups){
            if(group.getListGroups().equals(listGroups)){
                numberGroup = groups.indexOf(group);
            }
        }
        return numberGroup;
    }
}
