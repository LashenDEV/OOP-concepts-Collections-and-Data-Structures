public class MarksCalculation {
    public int mathMarks;
    public int scienceMarks;
    public float percentage;
    public String grade;

    public void calculatePercentage() {
        percentage = ((mathMarks + scienceMarks) / 200.0f) * 100.0f;
    }

    public void calculateGrade() {
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
    }
}
