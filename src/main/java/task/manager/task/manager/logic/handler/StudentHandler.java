package task.manager.task.manager.logic.handler;

import task.manager.task.manager.model.Student;

import java.util.concurrent.PriorityBlockingQueue;

public class StudentHandler {

    PriorityBlockingQueue<Student> StudentsQueue;
    private static StudentHandler studentsHandler;
    public void addStudent(Student task)
    {
        StudentsQueue.add(task);
    }
    private StudentHandler()
    {
        StudentsQueue =new PriorityBlockingQueue<Student>();
    }
    public static synchronized StudentHandler getInstance()
    {
        if(studentsHandler ==null)
        {
            studentsHandler = new StudentHandler();
        }
        return studentsHandler;
    }
}
