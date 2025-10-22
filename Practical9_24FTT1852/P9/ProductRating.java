package P9;

public class ProductRating {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        String[] criteria = {"Product", "Packaging", "Delivery"};

        System.out.println("Rating\tProduct\tPackaging\tDelivery");

        double[] avgCriteria = new double[3];
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                avgCriteria[j] += ratings[i][j];
            }
        }

        System.out.print("Average\t");
        for (int i = 0; i < avgCriteria.length; i++) {
            System.out.printf("%.2f\t", avgCriteria[i] / ratings.length);
        }
        System.out.println("\n");

        for (int i = 0; i < ratings.length; i++) {
            double total = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                total += ratings[i][j];
            }
            System.out.printf("Customer %d provide the average rating %.2f\n",
                    (i + 1), total / ratings[i].length);
        }
    }
}

