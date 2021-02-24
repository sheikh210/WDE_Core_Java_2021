package controlFlow;

public class LetterGrades {

    /*
    You are a teacher and you need to assign letter grades (A+, A-, B+, B-, etc) to students' exams.
    The only problem is, that you graded the tests, from 0-100.
    Let's build a program to change the number grades to letter grades, based on a range
     */

    public static void main(String[] args) {
        LetterGrades obj = new LetterGrades();

        String letterGrade = obj.getLetterGrade(110);

        System.out.println(letterGrade);
    }

    public String getLetterGrade(int numberGrade) {

        String errorMessage = "PLEASE ENTER A VALID NUMBER GRADE";
        String letterGrade;

        if (numberGrade < 0 || numberGrade > 100) {
            return errorMessage;
        } else if (numberGrade < 65) {
            letterGrade = "F";
        } else if (numberGrade < 70) {
            letterGrade = "D-";
        } else if (numberGrade < 75) {
            letterGrade = "D+";
        } else if (numberGrade < 80) {
            return "C+";
        } else if (numberGrade < 85) {
            return "B-";
        } else if (numberGrade < 90) {
            return "B+";
        } else if (numberGrade < 95) {
            return "A-";
        } else {
            return errorMessage;
        }

        return letterGrade;
    }

}
