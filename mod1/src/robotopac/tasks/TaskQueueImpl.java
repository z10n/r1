package robotopac.tasks;

import robotopac.robots.RoboPainterImpl;
import robotopac.robots.RoboWelderImpl;
import robotopac.robots.Robot;

public class TaskQueueImpl implements TaskQueue {
    @Override
    public RoboPainterImpl getRoboPainter() {
        return new RoboPainterImpl();
    }

    @Override
    public RoboWelderImpl getRoboWelder() {
        return new RoboWelderImpl();
    }

    @Override
    public int getRobotCount() {
        return Robot.robotCount;
    }

    @Override
    public void killRobot(int robotId) {

    }

    @Override
    public String getTaskType(Task task) {
        return task.getTaskType();
    }

    @Override
    public void setTaskType(String type) {

    }

    @Override
    public Task getTask() {
        return null;
    }
}
