public class BmiService {
    public double Bmi (double weight, double growth) {
        double growthMetr = growth / 100;
        double result = weight / Math.pow(growthMetr, 2);
        return result;
    }
}
