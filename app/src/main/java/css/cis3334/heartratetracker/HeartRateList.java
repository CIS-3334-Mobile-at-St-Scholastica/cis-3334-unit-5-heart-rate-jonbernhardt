package css.cis3334.heartratetracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  Holds an arraylist of heart rates
 *
 * Created by Tom Gibbons in Feb 2017.
 * For the CIS 3334 class at St. Scholastica
 */

public class HeartRateList {
    // The array list of HeartRate objects that we are tracking
    private ArrayList<HeartRate> heartRateList = new ArrayList<HeartRate>();

    /**
     * Constructor that initializes the array list
     */
    public HeartRateList() {
        heartRateList = new ArrayList<HeartRate>();
    }

    /**
     * A utility to initialize the array to a 20 random heart rate readings typical of a student
     */
    public void InitRandomYouth() {
        Random randGenerator = new Random();
        for (int i=0; i<20; i++) {
            heartRateList.add(new HeartRate( randGenerator.nextInt(180-110) + 110, 25));
        }
    }
    /**
     * A utility to initialize the array to a 20 random heart rate readings typical of an older professor
     */
    public void InitRandomElderly() {
        Random randGenerator = new Random();
        for (int i=0; i<20; i++) {
            heartRateList.add(new HeartRate( randGenerator.nextInt(150-80) + 80, 50));
        }
    }

    /**
     * Provides direct acces to the entire arralist of heart rates
     * @return a List of HeartRate objects
     */
    public List getList() {
        return heartRateList;
    }

    /**
     *  Procides access to one heart rate object
     * @param index The array index of the heart rate object in the array list
     * @return The HeartRate object corresponding to the array index given
     */
    public HeartRate getHeartRate(Integer index) {
        return heartRateList.get(index);
    }


    public void remove(Integer index){
        heartRateList.remove(index);
    }

}
