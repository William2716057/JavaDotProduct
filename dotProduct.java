public class DotProductCalculator {
    public static double dotProduct(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double result = 0.0;
        for (int i = 0; i < vector1.length; i++) { //make sure is less than vector1
            result += vector1[i] * vector2[i]; //multiplies vectors
        }
        return result;
    }

    public static void main(String[] args) {
	//define vectors
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {4.0, 5.0, 6.0};
	//save result as dotProductResult
        double dotProductResult = dotProduct(vector1, vector2);
        System.out.println("Dot Product: " + dotProductResult);
    }
}
