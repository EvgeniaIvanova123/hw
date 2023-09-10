public class BonusMilesService {
    public int calculate(int price) {
        int rublesForMiles = 20;
        int bonusMiles = price / rublesForMiles;
        return bonusMiles;
    }
}