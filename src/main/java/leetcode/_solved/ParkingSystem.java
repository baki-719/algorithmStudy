package leetcode._solved;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 3:
                if(small == 0) return false;
                small--;
                break;
            case 2:
                if(medium == 0) return false;
                medium--;
                break;
            case 1:
                if(big == 0) return false;
                big--;
                break;
        }
        return true;
    }
}
