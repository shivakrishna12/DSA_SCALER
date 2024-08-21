package Encap;

public class InstanceOFF implements Cloneable {
    public static void main(String5[] args) throws CloneNotSupportedException {
        InstanceOFF ii = new InstanceOFF();
        System.out.println(ii instanceof InstanceOFF);
        InstanceOFF i2 = (InstanceOFF) ii.clone();
        System.out.println(i2 instanceof InstanceOFF);
    }
}
