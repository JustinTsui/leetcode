package ps_1601_1700.alg_1603_design_parking_system;

/**
 * https://leetcode.com/problems/design-parking-system
 */
public class ParkingSystem {
    private final int[] capacity;

    public ParkingSystem(int big, int medium, int small) {
        capacity = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (capacity[carType - 1] > 0) {
            capacity[carType - 1]--;
            return true;
        }
        return false;
    }
}

/*
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */