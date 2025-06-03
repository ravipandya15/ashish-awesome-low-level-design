import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


// Interview question asked in Freight Tiger company - DSA round
public class LoadBalancer {
    public static void main(String[] args) {
        int i = 100;
        int[] server = new int[] {10, 30, 50};
        Map<Integer, Integer> map = new HashMap<>();
        while (i >= 0) {
            int serverIndex = returnServerIndex(server);
            map.put(i, serverIndex);
            System.out.println("request " + i + " served by server: " + serverIndex);
            i--;
        }
    }

    private static int returnServerIndex(int[] server) {
        int totalServerCapacity = 0;
        int[] capacity = new int[server.length];
        for (int i = 0; i < server.length; i++) {
            totalServerCapacity += server[i];
            capacity[i] = totalServerCapacity;
        }
        Random random = new Random();
        int number =  random.nextInt(totalServerCapacity + 1);
        return binarySearch(capacity, number);
    }

    private static int binarySearch(int[] capacity, int number) {
        System.out.println("number: " + number);
        int low = 0;
        int high = capacity.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (capacity[mid] == number) {
                return mid;
            } else if (number < capacity[mid]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
