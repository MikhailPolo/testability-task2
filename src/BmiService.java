public class BmiService {
    public double Bmi (double weight, double growth) {
        double g = growth / 100;
        double result = weight / (g * g);
        return result;
    }
}
