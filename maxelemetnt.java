public class maxelemetnt  {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
    
            // Assuming first element as maximum
            int max = array[0];
    
            // Loop through the array to find the maximum element
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
    
            // Print the maximum element
            System.out.println("Maximum element in the array: " + max);
        }
    }
}
