package robotopac.robots;

import robotopac.tasks.Task;

public abstract class Robot {
    static int robotCount;

    public Robot() {
        robotCount++;
    }

    private int robotId;

    public void executeTask(Task task){
        System.out.println("executing");
    }

    public void die(){
        //TODO: сделать ссылку на текущий объект null
        robotCount--;
    }
}
