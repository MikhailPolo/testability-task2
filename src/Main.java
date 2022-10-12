public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 166; // рост в сантиметрах
        double weight = 80; // вес в килограммах
        double Bmi = service.Bmi(weight, growth);
        System.out.println(Bmi);
    }
}