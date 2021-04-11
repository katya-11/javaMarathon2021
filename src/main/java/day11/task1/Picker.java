package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse = new Warehouse();
    private int countPickedOrders = warehouse.getCountPickedOrders();


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата сборщика= " + getSalary() +
                ", сборщику был выплачен бонус или нет= " + isPayed() +
                " , количество собранных товаров= " + warehouse.getCountPickedOrders();
    }

    @Override
    public void doWork() {
        salary += 80;
        countPickedOrders++;
        warehouse.setCountPickedOrders(countPickedOrders);
    }

    @Override
    public void bonus() {
        if (isPayed()) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountPickedOrders() == 10000) {
            salary += 70000;
            isPayed = true;
        }
    }
}
