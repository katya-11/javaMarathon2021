package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse = new Warehouse();
    private int countDeliveredOrders = warehouse.getCountDeliveredOrders();

    public Courier(Warehouse warehouse) {
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
        return "заработная плата курьера= " + getSalary() +
                ", курьеру был выплачен бонус или нет= " + isPayed() +
                " , количество доставленных товаров= " + countDeliveredOrders;
    }

    @Override
    public void doWork() {
        salary += 100;
        countDeliveredOrders++;
        warehouse.setCountDeliveredOrders(countDeliveredOrders);

    }

    @Override
    public void bonus() {
        if (isPayed()) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
        }
    }
}
