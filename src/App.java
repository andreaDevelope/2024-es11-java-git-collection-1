import java.util.List;

public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {
        testRandomInteger();
        testRandomUniqueInteger();
        testFrequencyMap();

    }

    public static void testRandomInteger() {
        System.out.println("Test getRandomInteger:");
        System.out.println(DataHelper.getRandomInteger(5));
        System.out.println(DataHelper.getRandomInteger(5, 20));
        System.out.println(DataHelper.getRandomInteger(5, 10, 20));
    }

    public static void testRandomUniqueInteger() {
        System.out.println("Test getRandomUniqueInteger:");
        System.out.println(DataHelper.getRandomUniqueInteger(5));
        System.out.println(DataHelper.getRandomUniqueInteger(5, 20));
        System.out.println(DataHelper.getRandomUniqueInteger(5, 10, 20));
    }

    public static void testFrequencyMap() {
        System.out.println("Test getFrequencyMap:");
        List<Integer> randomNumbers = DataHelper.getRandomInteger(100, 0, 10);
        System.out.println(DataHelper.getFrequencyMap(randomNumbers));
    }
}
