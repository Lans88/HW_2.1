public class Main {
    public static void main(String[] args) {
        int priceTicket = 41_773;
        int mileInRub = 20;
        int mile = 0;
        if (priceTicket > 20) {
            mile = priceTicket / mileInRub;
        } else {
            System.out.println("Мили не начислены!");
        }
        System.out.println("Всего начислено миль: " + mile);
    }
}