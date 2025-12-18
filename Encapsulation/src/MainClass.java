public class MainClass {
    public static void main(String[] args) {
//        MarksCalculation calculation = new MarksCalculation();
//        calculation.mathMarks = 80;
//        calculation.scienceMarks = 60;
//        calculation.calculatePercentage();
//        calculation.calculateGrade();
//        calculation.mathMarks = 150;
//        calculation.scienceMarks = 190;
//        System.out.println("Percentage: " + calculation.percentage);
//        System.out.println("Grade: " + calculation.grade);


        EncapsulationCalculation ec = new EncapsulationCalculation(90, 80);

        String result = ec.calculateGrade();
        System.out.println(result);
    }
}
