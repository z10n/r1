package robofactory.robots;

public class RoboPainterImpl extends Robot implements RoboPainter {

    @Override
    public void mixColors() {
        System.out.println("mixing colors");
    }

    @Override
    public void paintDetail() {
        System.out.println("painting");
    }
}
