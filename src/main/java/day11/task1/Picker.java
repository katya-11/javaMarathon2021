package day11.task1;

public class Picker extends Warehouse implements Worker {
    private double salary;
    private boolean isPayed;
    private int countPickedOrders = getCountPickedOrders();

    public Picker(Warehouse warehouse) {
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
        return "заработная плата сборщика= " + salary +
                ", сборщику был выплачен бонус или нет= " + isPayed +
                " , количество собранных товаров= " + countPickedOrders;
    }

    @Override
    public void doWork() {
        salary += 80;
        countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (isPayed() == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (countPickedOrders == 10000) {
            salary += 70000;
            isPayed = true;
        }
    }
}
