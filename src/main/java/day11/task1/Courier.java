package day11.task1;

public class Courier extends Warehouse implements Worker {
    private double salary;
    private boolean isPayed;
    private int countDeliveredOrders = getCountDeliveredOrders();

    public Courier(Warehouse warehouse) {
        super();
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата курьера= " + salary +
                ", курьеру был выплачен бонус или нет= " + isPayed +
                " , количество доставленных товаров= " + countDeliveredOrders;
    }

    @Override
    public void doWork() {
        salary += 100;
        countDeliveredOrders++;
        countDeliveredOrders = getCountDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (isPayed() == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (countDeliveredOrders == 10000) {
            salary += 50000;
            isPayed = true;
        }
    }
}
