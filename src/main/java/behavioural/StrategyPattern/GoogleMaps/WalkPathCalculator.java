package behavioural.StrategyPattern.GoogleMaps;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public String findPath(String from, String to) {
        return "Walking path from " + from + " to " + to;
    }
}
