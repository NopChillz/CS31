public class Lab4Q4_168050062 {
    public static void main(String[] args) {
        int [] testData = {9,26,342,1413};
        int Data;
        int ro = 1;
        for (int i = 0; i < testData.length; i++) {
            Data = testData[i];
            System.out.println("Round : " + ro + " | Data : " + Data);
            if (Data % 9 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            ro++;
        }
    }
}
