package task.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.PriorityQueue;

@SpringBootApplication
public class TaskManager {
    static void priorirtyTaskTester()
    {
        PriorityQueue<Double> intqueue = new PriorityQueue<Double>();
        intqueue.add(3.12);
        intqueue.add(1.12);
        intqueue.add(2.12);
        intqueue.add(-2.12);
        intqueue.add(32.12);

        intqueue.add(50.12);
    }
    public static void main(String[] args)
    {
        priorirtyTaskTester();
        SpringApplication.run(TaskManager.class, args);
    }

}
