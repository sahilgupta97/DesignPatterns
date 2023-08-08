package behavioural.StrategyPattern.GoogleMaps;

public class TwoWheelPathCalculator implements PathCalculator {
    @Override
    public String findPath(String from, String to) {
        return "Two wheeler path from " + from + " to " + to;
    }
}
