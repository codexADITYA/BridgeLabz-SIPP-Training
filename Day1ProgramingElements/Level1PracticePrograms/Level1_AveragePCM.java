class AveragePCM {
    public static void main(String[] args) {
        // Define student name and marks
        String studentName = "Sam";
        int mathMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        // Calculate average percentage
        double averagePercent = (mathMarks + physicsMarks + chemistryMarks) / 3.0;
        
        // Display result
        System.out.println(studentName + "’s average mark in PCM is " + averagePercent);
    }
}