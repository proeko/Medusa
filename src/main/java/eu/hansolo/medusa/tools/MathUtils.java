package eu.hansolo.medusa.tools;

public class MathUtils {
	public static double normalize(double x, double xMin, double xMax, double yMin, double yMax) {
		return yMin + ((x - xMin) * (yMax - yMin)) / (xMax - xMin);
	}
}
