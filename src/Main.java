public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 90;
        double bmi = service.calculate(height, (int) weight);
        System.out.println("Bmi index тела: " + bmi);
    }
}