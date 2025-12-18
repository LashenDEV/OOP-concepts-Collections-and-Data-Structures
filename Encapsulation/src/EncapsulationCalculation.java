public class EncapsulationCalculation {
    private int mathMarks;
    private int scienceMarks;
    private float percentage;
    private String grade;

    public EncapsulationCalculation(int mathMarks, int scienceMarks) {
        if(mathMarks < 0){
            this.mathMarks = 0;
        } else if(scienceMarks < 0){
            this.scienceMarks = 0;
        } else if (mathMarks > 100){
            this.mathMarks = 100;
        } else if(scienceMarks > 100){
            this.scienceMarks = 100;
        } else {
            this.mathMarks = mathMarks;
            this.scienceMarks = scienceMarks;
        }
    }

    private float calculatePercentage() {
        return ((this.mathMarks + this.scienceMarks) / 200.0f) * 100.0f;
    }

    public String calculateGrade() {
        this.percentage = calculatePercentage();
        if(percentage >= 90 && percentage <= 100){
            grade = "A";
        } else if(percentage >= 80 && percentage <= 89){
            grade = "B";
        } else if(percentage >= 70 && percentage <= 79){
            grade = "C";
        } else if(percentage >= 60 && percentage <= 79){
            grade = "D";
        } else {
            grade = "F";
        }

        return "Percentage: " + this.percentage + "\nGrade: " + this.grade;
    }
}
