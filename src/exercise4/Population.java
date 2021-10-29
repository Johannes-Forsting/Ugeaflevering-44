package exercise4;

public class Population {
    public static void main(String[] args) {
        int currentPopulation = 331002651;
        int amountOfYearsInTheFuture = 5;
        int secondsPrBirth = 7;
        int secondsPrDeaths = 13;

        int populationInTheFuture = getPopulationInTheFuture(currentPopulation, amountOfYearsInTheFuture, secondsPrDeaths, secondsPrBirth);
        System.out.println("The expected population of the USA in " + amountOfYearsInTheFuture + " is years " + populationInTheFuture + " people.");
    }

    static int getPopulationInTheFuture(int currentPopulation, int amountOfYearsInTheFuture, int secondsPrDeath, int secondsPrBirth){
        int secondsInAMinutes = 60;
        int minutesInAnHour = 60;
        int hoursInADay = 24;
        int daysInAYear = 365;
        int secondsInFuture = secondsInAMinutes * minutesInAnHour * hoursInADay * daysInAYear * amountOfYearsInTheFuture;
        int deathsIn5Years = secondsInFuture / secondsPrDeath;
        int birthsIn5Years = secondsInFuture / secondsPrBirth;
        currentPopulation = currentPopulation + birthsIn5Years - deathsIn5Years;
        return currentPopulation;
    }
}
