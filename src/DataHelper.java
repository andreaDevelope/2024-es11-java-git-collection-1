import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti

    public static List<Integer> getRandomInteger(int size) {
        List<Integer> listNumRnd = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int rnd1 = rnd.nextInt(11); 
            listNumRnd.add(rnd1);
        }
        return listNumRnd; // Restituisce la lista
    }

    public static List<Integer> getRandomInteger(int size, int max) {
        List<Integer> listNumRnd2 = new ArrayList<>();
        Random rnd2 = new Random();
        for (int i = 0; i < size; i++) {
            int rnd_max = rnd2.nextInt(max + 1); 
            listNumRnd2.add(rnd_max);
        }
        return listNumRnd2;
    }

    public static List<Integer> getRandomInteger(int size, int min, int max) {
        List<Integer> listNumMinMax = new ArrayList<>();
        Random rnd3 = new Random();
        for(int i = 0; i < max; i++){
            int rnd_min_max = rnd3.nextInt(min, max + 1);
            listNumMinMax.add(rnd_min_max);
        }
        return listNumMinMax;
        
    }

    public static Set<Integer> getRandomUniqueInteger(int size) {
        Set<Integer> setNumRnd = new HashSet<>();
        Random rnd4 = new Random();
        for(int i = 0; i < size; i++){
            int setRnd = rnd4.nextInt(11);
            setNumRnd.add(setRnd);
        }
        return setNumRnd;
    
    }

    public static Set<Integer> getRandomUniqueInteger(int size, int max) {
        Set<Integer> setNumRndMax = new HashSet<>();
        Random rnd5 = new Random();
        for(int i = 0; i < size; i++){
            int setRndMax = rnd5.nextInt(max + 1);
            setNumRndMax.add(setRndMax);
        }
        return setNumRndMax;
    }

    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {
        Set<Integer> setNumRndMinMax = new HashSet<>();
        Random rnd6 = new Random();
        for(int i = 0; i < size; i++){
            int setRndMinMax = rnd6.nextInt(min, max);
            setNumRndMinMax.add(setRndMinMax);
        }
    
        return setNumRndMinMax;
    }

    public static Map<Integer, Integer> getFrequencyMap(List<Integer> getRandomUniqueInteger) {
        Map<Integer, Integer> mapNumRnd = new HashMap<>();
        for(int i = 0; i < getRandomUniqueInteger.size(); i++){
            mapNumRnd.put(i, getRandomUniqueInteger.get(i)); 
        }
        return mapNumRnd;
    }

}
