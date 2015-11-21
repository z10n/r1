package robotopac;

public class RoboWelderImpl extends Robot implements RoboWelder {
    @Override
    public void takeDetails() {
        System.out.println("taking details");
    }

    @Override
    public void putDetailsTogether() {
        System.out.println("putting details together");
    }

    @Override
    public void weldDetails() {
        System.out.println("welding");
    }
}
