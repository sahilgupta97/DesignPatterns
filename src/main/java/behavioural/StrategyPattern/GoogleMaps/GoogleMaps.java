package behavioural.StrategyPattern.GoogleMaps;

public class GoogleMaps {

    String findPath(String from, String to, Mode mode) {
        PathCalculator pathCalculator = PathCalculatorFactory.createPathCalculatorForMode(mode);
        String path = pathCalculator.findPath(from, to);
        return path;
    }
}
