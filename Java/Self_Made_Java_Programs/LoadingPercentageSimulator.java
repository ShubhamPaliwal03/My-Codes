import java.io.IOException;

class LoadingPercentageSimulator {

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 0; i <= 100; i++) {

            clearConsoleWindows();  // Call the clear console method

            System.out.print("\nLoading : " + i + " %");

            try {

                Thread.sleep(50);  // Pause for 100 ms

            } catch (InterruptedException e) {

                System.out.println("Error: " + e);
            }
        }
    }

    // Method to clear the console on Windows

    public static void clearConsoleWindows() throws IOException, InterruptedException {
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
