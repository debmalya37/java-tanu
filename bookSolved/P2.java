package bookSolved;

public class P2 {
    private float p; // Initial population
    private float r; // Growth rate

    public P2(float initialPopulation, float growthRate) {
        this.p = initialPopulation;
        this.r = growthRate;
    }

    public float calculatePopulation(int endYear) {
        float population = p;
        for (int year = 2000; year <= endYear; year++) {
            population += population * r;
        }
        return population;
    }

    public static void main(String[] args) {
        P2 countryPopulation = new P2(1000000f, 0.02f); // Example initial population: 1,000,000, growth
                                                        // rate: 0.02 (2%)
        int endYear = 2007;
        float populationAtEndYear = countryPopulation.calculatePopulation(endYear);
        System.out.println("Population at the end of year " + endYear + ": " + populationAtEndYear);
    }
}
