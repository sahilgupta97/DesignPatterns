package behavioural.StrategyPattern.GoogleMaps;

public class PathCalculatorFactory {

    public static PathCalculator createPathCalculatorForMode(Mode mode) {
        switch (mode) {
            case FOUR_WHEELER :
                return new FourWheelPathCalculator();
            case TWO_WHEELER:
                return new TwoWheelPathCalculator();
            case WALK:
                return new WalkPathCalculator();
        }

        // Default
        return new WalkPathCalculator();
    }
}
