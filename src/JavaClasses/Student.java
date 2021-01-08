package JavaClasses;

public class Student {

    private int id;
    private String surname;
    private String name;
    private String secondName;
    private int year;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private int group;

    public Student(){
        System.out.println();
    }

    public Student ( int id, String surname, String name, String secondName, int year,
                     String address, int phone, String faculty, int course, int group ){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.year = year;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void studentsSomeFaculty(String someFaculty){
        if (someFaculty.equals(faculty)){
            System.out.println("Faculty: " + faculty + ", Student: " + name + " " + surname);
        }
    }

    public void historicalFaculty(){
        if (faculty.equals("Historical")){
            System.out.println(name + " " + surname);
        }
    }

    public void culturalFaculty(){
        if (faculty.equals("Cultural")){
            System.out.println(name + " " + surname);
        }
    }

    public void youngStudents(int years){
        if(years < year){
            System.out.println(name + " " + surname);
        }
    }

    public void studentsSomeGroup(int someGroup){
        if(someGroup == group){
            System.out.println("Group: " + group + ", Student: " + name + " " + surname);
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
