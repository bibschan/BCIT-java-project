import java.util.*;

/**
 * LamborghiniCarLot class Assignment 3
 *
 * @author Bibiana Souza
 * @version 1
 */

public class LamborghiniCarLot {

    private String lotName;
    private ArrayList<Lamborghini> inventory;

    /**
     * Default constructor, no parameters taken. Initializes the arraylist
     */
    public LamborghiniCarLot() {
        inventory = new ArrayList<Lamborghini>();
    }

    /**
     * constructor with parameter lotName
     * 
     * @param lotName accepts a string, if equal to Taylor's Used Lambos will set as
     *                Jason's Used Lambos instead
     */
    public LamborghiniCarLot(String lotName) {
        setLotName(lotName);
        inventory = new ArrayList<Lamborghini>();

        inventory.add(new Lamborghini(1965, "350GT", 365.3, true));
        inventory.add(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        inventory.add(new Lamborghini(1967, "MIURA", 367.3, true));
        inventory.add(new Lamborghini(1968, "espada", 368.3, false));
        inventory.add(new Lamborghini(1969, "islero", 369.3, true));
        inventory.add(new Lamborghini(1970, "jarama", 370.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1973, "countache", 373.3, false));
        inventory.add(new Lamborghini(1974, "silhouette", 374.3, false));
        inventory.add(new Lamborghini(1975, "jalpa", 375.3, true));
        inventory.add(new Lamborghini(1976, "silhouette", 476.3, false));
        inventory.add(new Lamborghini(1977, "silhouette", 377.3, true));
        inventory.add(new Lamborghini(1978, "countache", 478.3, false));
        inventory.add(new Lamborghini(1978, "countache", 578.3, false));
        inventory.add(new Lamborghini(1978, "countache", 378.3, true));
        inventory.add(new Lamborghini(1979, "silhouette", 479.3, false));
        inventory.add(new Lamborghini(1980, "countache", 580.3, false));
        inventory.add(new Lamborghini(1981, "jalpa", 381.3, true));
        inventory.add(new Lamborghini(1981, "jalpa", 481.3, true));
        inventory.add(new Lamborghini(1982, "countache", 582.3, true));
        inventory.add(new Lamborghini(1983, "countache", 383.3, false));
        inventory.add(new Lamborghini(1984, "countache", 484.3, false));
        inventory.add(new Lamborghini(1985, "countache", 585.3, false));
        inventory.add(new Lamborghini(1986, "lm002", 386.3, true));
        inventory.add(new Lamborghini(1987, "jalpa", 487.3, false));
        inventory.add(new Lamborghini(1988, "countache", 588.3, false));
        inventory.add(new Lamborghini(1989, "countache", 389.3, true));
        inventory.add(new Lamborghini(1990, "diablo", 490.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 391.3, true));
        inventory.add(new Lamborghini(1991, "lm002", 491.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, true));
        inventory.add(new Lamborghini(1992, "lm002", 392.3, false));
        inventory.add(new Lamborghini(1993, "lm002", 493.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 594.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 394.3, true));
        inventory.add(new Lamborghini(1995, "diablo", 495.3, false));
        inventory.add(new Lamborghini(1996, "diablo", 596.3, false));
        inventory.add(new Lamborghini(1997, "diablo", 397.3, false));
        inventory.add(new Lamborghini(1998, "diablo", 498.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 400.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 500.3, false));
        inventory.add(new Lamborghini(2001, "murcielago", 501.3, false));
        inventory.add(new Lamborghini(2002, "murcielago", 502.3, false));
        inventory.add(new Lamborghini(2003, "gallardo", 303.3, true));
        inventory.add(new Lamborghini(2004, "murcielago", 404.3, true));
        inventory.add(new Lamborghini(2005, "murcielago", 505.3, true));
        inventory.add(new Lamborghini(2006, "gallardo", 506.3, true));
        inventory.add(new Lamborghini(2007, "gallardo", 507.3, true));
        inventory.add(new Lamborghini(2008, "reventon", 308.3, false));
        inventory.add(new Lamborghini(2008, "reventon", 508.3, true));
        inventory.add(new Lamborghini(2009, "gallardo", 409.3, true));
        inventory.add(new Lamborghini(2010, "murcielago", 310.3, false));
        inventory.add(new Lamborghini(2011, "aventador", 411.3, false));
        inventory.add(new Lamborghini(2012, "sesto elemento", 512.3, true));
    }

    ////////////////////////////// ACCESSOR METHODS////////////////////////////////
    /**
     * @return lotName returns the current value of lotName
     */
    public String getLotName() {
        return lotName;
    }

    /**
     * @return inventory returns the current arraylist
     */
    public ArrayList<Lamborghini> getLamborghiniList() {
        return inventory;
    }

    ////////////////////////////// MUTATOR METHODS////////////////////////////////
    /**
     * @param lotName sets the lot name if not equal to taylor's used lambos,
     *                otherwise sets to jason's used lambos
     */
    public void setLotName(String lotName) {
        if (lotName.equals("Taylor's Used Lambos")) {
            this.lotName = "Jason's Used Lambos";
        } else {
            this.lotName = lotName;
        }
    }

    /**
     * @param inventory sets the arraylist
     */
    public void setArrayList(ArrayList<Lamborghini> inventory) {
        this.inventory = inventory;
    }

    /**
     * @param sets the array
     */
    public void setInventory(ArrayList<Lamborghini> inventory) {
        this.inventory = inventory;
    }

    /**
     * @param newLamborghini adds a new lamborghini object to the arraylist
     */
    public void addLamborghini(Lamborghini newLamborghini) {
        if (newLamborghini != null) {
            inventory.add(newLamborghini);
        }
    }

    /**
     * @return startYear the starting year that will be used to get the cars
     * @return endYear the end year that will be used to get the cars
     */
    public int howManyBetweenTheseYears(int startYear, int endYear) {
        int howManyLambos = 0;
        for (Lamborghini item : inventory) {
            if (item.getModelYear() >= startYear && item.getModelYear() <= endYear) {
                howManyLambos++;
            }
        }
        return howManyLambos;
    }

    /**
     * @return isRearWheel returns how many cars are rear wheeled
     */
    public int howManyAreRearWheelDrive() {
        int isRearWheel = 0;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getIsRearWheelDrive() == true) {
                isRearWheel++;
            }
        }
        return isRearWheel;
    }

    /**
     * @param year gets all the cars from the year param, returns a lamborghini
     *             arraylist
     */
    public ArrayList<Lamborghini> getCarsFromThisYear(int year) {
        ArrayList<Lamborghini> newLambos = new ArrayList<Lamborghini>();

        for (Lamborghini item : inventory) {
            if (item.getModelYear() == year) {
                newLambos.add(item);
            }
        }

        if (newLambos == null) {
            newLambos = null;
        }
        return newLambos;
    }

    /**
     * @return horsePowerList returns an array of all the cars within the lowHP and
     *         highHP range of horsepower
     */
    public Lamborghini[] getCarsWithHorsepowerRange(double lowHP, double highHP) {
        int index = 0;
        for (Lamborghini item : inventory) {
            if (item.getHorsepower() >= lowHP && item.getHorsepower() <= highHP) {
                index++;
            }
        }

        Lamborghini[] horsePowerList = new Lamborghini[index];
        int indexP = 0;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getHorsepower() >= lowHP && inventory.get(i).getHorsepower() <= highHP) {
                horsePowerList[indexP] = inventory.get(i);
                indexP++;
            }
        }

        if (horsePowerList == null) {
            horsePowerList = null;
        }
        return horsePowerList;
    }

    /**
     * @return modelName will search for the car model in the arraylist, returns
     *         true if found
     */
    public boolean hasCarModel(String modelName) {
        for (Lamborghini item : inventory) {
            if (item.getModelName().equalsIgnoreCase(modelName)) {
                return true;
            }
        }
        if (inventory == null) {
            return false;
        }
        return false;
    }

    /**
     * @return average returns the average horsepower within the given year
     */
    public double getAverageHorsepowerOfYear(int modelYear) {
        double average = 0.0;
        double total = 0.0;
        int i = 0;

        if (modelYear == 0) {
            return 0.0;
        }

        for (Lamborghini item : inventory) {
            if (item.getModelYear() == modelYear) {
                total = total + item.getHorsepower();
                i++;
            }
        }
        average = total / i;
        return average;
    }
}
