public class Main {
    public static void main(String[] args) {
        int start = 600;
        int summa = 1600;
        int bonus = summa > 1000 ? summa / 100 : 0;
        int total = start + summa + bonus;
        System.out.println(bonus);
        System.out.println(total);
    }
}