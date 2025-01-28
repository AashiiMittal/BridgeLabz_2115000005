public class RandomNumbers {
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        result[0] = sum / numbers.length;
        result[1] = min;
        result[2] = max;
        return result;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int size = 5;
        int[] numbers = randomNumbers.generate4DigitRandomArray(size);
        System.out.println("Generated 4-digit random numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        double[] result = randomNumbers.findAverageMinMax(numbers);
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
