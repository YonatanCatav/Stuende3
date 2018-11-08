package task.manager.task.manager.model;

import task.manager.task.manager.enums.EGrades;

public class Student implements Comparable<Student> {
    public Student() {

    }

    private EGrades studentGrades;
    private int id;

    public void setId(int i_id) {
        id = i_id;
    }

    public int getId() {
        return id;
    }

    public void setStudentGrades(EGrades i_grades) {
        studentGrades = i_grades;
    }

    public EGrades getStudentGrades() {
        return studentGrades;
    }

    @Override
    public int compareTo(Student o) {
        EGrades compareToPriority = o.getStudentGrades();
        EGrades thisPriority = this.getStudentGrades();
        return thisPriority.compareTo(compareToPriority);
    }
}
