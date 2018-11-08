package task.manager.task.manager.enums;

public class PriorityValue {
    public static int getPriorityValue(EGrades priority)
    {
        switch (priority)
        {
            case High:
                return 3;
            case Medium:
                return 2;
            case Low:
                return 1;
            default:
                return 0;
        }
    }
}
