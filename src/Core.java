import java.util.*;

public class Core {
    public static void main(String[] args) {
        System.out.println("Application Enabled");

        // Input Matrix
        int[][] tsp = {
                { -1, 10, 15, 20 },
                { 10, -1, 35, 25 },
                { 15, 35, -1, 30 },
                { 20, 25, 30, -1 }
        };

        // Function Call
        findMinRoute(tsp);
    }
    // Function to find the minimum
    // cost path for all the paths
    static void findMinRoute(int[][] tsp) {
        int sum = 0;
        int counter = 0;
        int j = 0, i = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> visitedRouteList
                = new ArrayList<>();

        // Starting from the 0th indexed
        // city i.e., the first city
        visitedRouteList.add(0);
        int[] route = new int[tsp.length];

        // Traverse the adjacency
        // matrix tsp[][]
        while (i < tsp.length
                && j < tsp[i].length) {

            // Corner of the Matrix
            if (counter >= tsp[i].length - 1) {
                break;
            }

            // If this path is unvisited then
            // and if the cost is less than
            // update the cost
            if (j != i
                    && !(visitedRouteList.contains(j))) {
                if (tsp[i][j] < min) {
                    min = tsp[i][j];
                    route[counter] = j + 1;
                }
            }
            j++;

            // Check all paths from the
            // ith indexed city
            if (j == tsp[i].length) {
                sum += min;
                min = Integer.MAX_VALUE;
                visitedRouteList.add(route[counter] - 1);
                j = 0;
                i = route[counter] - 1;
                counter++;
            }
        }

        // Update the ending city in array
        // from city which was last visited
        i = route[counter - 1] - 1;

        for (j = 0; j < tsp.length; j++) {

            if ((i != j) && tsp[i][j] < min) {
                min = tsp[i][j];
                route[counter] = j + 1;
            }
        }
        sum += min;

        // Started from the node where
        // we finished as well.
        System.out.print("Minimum Cost is : ");
        System.out.println(sum);
    }
}
