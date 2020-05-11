import java.util.*;

/**
 * assignment 3 1409
 *
 * @author Bibiana Souza
 * @version 1
 */
public class LamborghiniDealershipGroup {

    private String dealershipGroupName;
    private ArrayList<LamborghiniCarLot> carLots;

    /**
     * Constructor for objects of class LamborghiniDealershipGroup
     */
    public LamborghiniDealershipGroup() {
        carLots = new ArrayList<LamborghiniCarLot>();
    }

    /**
     * Constructor with the dealershipGroupName parameter, sets the car lot and and
     * dealership name
     */
    public LamborghiniDealershipGroup(String dealershipGroupName) {
        setDealershipName(dealershipGroupName);

        carLots = new ArrayList<LamborghiniCarLot>();
        // Create the first car lot
        LamborghiniCarLot carlot1 = new LamborghiniCarLot();

        carlot1.setLotName("Jason's vintage lambos.");
        carlot1.addLamborghini(new Lamborghini(1965, "350GT", 365.3, true));
        carlot1.addLamborghini(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        carlot1.addLamborghini(new Lamborghini(1967, "MIURA", 367.3, true));
        carlot1.addLamborghini(new Lamborghini(1968, "espada", 368.3, false));
        carlot1.addLamborghini(new Lamborghini(1969, "islero", 369.3, true));
        carlot1.addLamborghini(new Lamborghini(1970, "jarama", 370.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1973, "countache", 373.3, false));
        carlot1.addLamborghini(new Lamborghini(1974, "silhouette", 374.3, false));
        carlot1.addLamborghini(new Lamborghini(1975, "jalpa", 375.3, true));
        carlot1.addLamborghini(new Lamborghini(1976, "silhouette", 476.3, false));
        carlot1.addLamborghini(new Lamborghini(1977, "silhouette", 377.3, true));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 478.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 578.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 378.3, true));
        carlot1.addLamborghini(new Lamborghini(1979, "silhouette", 479.3, false));

        // Create the second car lot
        LamborghiniCarLot carlot2 = new LamborghiniCarLot();

        carlot2.setLotName("Taylor's brand new lambos.");

        carlot2.addLamborghini(new Lamborghini(2006, "gallardo", 506.3, true));
        carlot2.addLamborghini(new Lamborghini(2007, "gallardo", 507.3, true));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 308.3, false));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 508.3, true));
        carlot2.addLamborghini(new Lamborghini(2009, "gallardo", 409.3, true));
        carlot2.addLamborghini(new Lamborghini(2010, "murcielago", 310.3, false));
        carlot2.addLamborghini(new Lamborghini(2011, "aventador", 411.3, false));
        carlot2.addLamborghini(new Lamborghini(2012, "sesto elemento", 512.3, true));

        // Add them to the arraylist
        carLots.add(carlot1);
        carLots.add(carlot2);

    }

    /////////////////////////////////// ACCESSORS///////////////////////////////////////
    /**
     * @return dealershipGroupName returns the current dealership name
     */
    public String getDealershipGroupName() {
        return dealershipGroupName;
    }

    /**
     * @return carLots returns the current array
     */
    public ArrayList<LamborghiniCarLot> getCarLot() {
        return carLots;
    }

    //////////////////////////////////// MUTATORS///////////////////////////////////////
    /**
     * @param dealershipGroupName takes a string and set as the dealership name if
     *                            not null
     */
    public void setDealershipName(String dealershipGroupName) {
        if (dealershipGroupName != null) {
            this.dealershipGroupName = dealershipGroupName;
        }
    }

    /**
     * @param setCarLots sets the carLot
     */
    public void setCarLots(ArrayList<LamborghiniCarLot> setCarLots) {
        this.carLots = carLots;
    }
    ///////////////////////////////////////////////////////////////////////////////////////

    /**
     * @param carLot adds the carLot to the arraylist if not null
     */
    public void addCarLot(LamborghiniCarLot carLot) {
        if (carLot != null) {
            carLots.add(carLot);
        }
    }

    /**
     * @return count returns the total carLot in inventory
     */
    public int getTotalInventoryCount() {
        int count = 0;
        for (LamborghiniCarLot item : carLots) {
            int list = item.getLamborghiniList().size();
            count = count + list;
        }

        if (count == 0) {
            return 0;
        }
        return count;
    }

    /**
     * @return boolean returns true if the model name is found in the arraylist,
     *         returns false if carlots is null or name is not found
     */
    public boolean hasModelName(String modelName) {
        if (carLots == null) {
            return false;
        }

        for (LamborghiniCarLot item : carLots) {
            for (int i = 0; i < item.getLamborghiniList().size(); i++) {
                if (item.getLamborghiniList().get(i).getModelName().equalsIgnoreCase(modelName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return returnIt returns an array of cars within the horsepower range in the
     *         year given
     */
    public LamborghiniCarLot[] getAllCarLotsWithAverageHorsepowerInRangeForYear(int modelYear, double lowHP,
            double highHP) {
        int arrayIndex = 0;

        for (LamborghiniCarLot item : carLots) {
            for (int i = 0; i < item.getLamborghiniList().size(); i++) {
                if (item.getLamborghiniList().get(i).getModelYear() == modelYear
                        && item.getLamborghiniList().get(i).getHorsepower() >= lowHP
                        && item.getLamborghiniList().get(i).getHorsepower() <= highHP) {
                    arrayIndex++;
                }
            }
        }

        LamborghiniCarLot[] returnIt = new LamborghiniCarLot[arrayIndex];
        int count = 0;

        for (LamborghiniCarLot item : carLots) {
            for (int i = 0; i < item.getLamborghiniList().size(); i++) {
                if ((arrayIndex != 0) && (item.getLamborghiniList().size() != 0)
                        && (item.getLamborghiniList().get(i).getModelYear() == modelYear)
                        && (item.getLamborghiniList().get(i).getHorsepower() >= lowHP)
                        && (item.getLamborghiniList().get(i).getHorsepower() <= highHP)) {
                    returnIt[count] = item;
                    count++;
                    System.out.println(item);
                }
            }
        }
        return returnIt;
    }
}
