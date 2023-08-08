package behavioural.StrategyPattern.GoogleMaps;

public class FourWheelPathCalculator implements PathCalculator{
    @Override
    public String findPath(String from, String to) {
        return "Four wheeler path from " + from + " to " + to;
    }
}
