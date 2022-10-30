public class Time {
    public static void main(String[] args) {
        int distance = 23; // км
        double taxiSpeed = 63.2; // км/ч
        double time = (distance / taxiSpeed); // ч
        double nightK = 0.85;
        double nightTime = (time * nightK * 60); // * 60, чтобы перевести часы в минуты
        System.out.println("Время за которое тестировщик добирается из офиса домой " + nightTime + " минут");
    }
}