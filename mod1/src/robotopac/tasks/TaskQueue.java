package robotopac.tasks;

import robotopac.robots.RoboPainterImpl;
import robotopac.robots.RoboWelderImpl;

public interface TaskQueue {
    public RoboPainterImpl getRoboPainter();
    public RoboWelderImpl getRoboWelder();
    public int getRobotCount();
    public void killRobot(int robotId);
    public String getTaskType(Task task);
    public void setTaskType(String taskType);
    public Task getTask();
}
