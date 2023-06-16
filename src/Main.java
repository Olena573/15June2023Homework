// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Formatter; // import of Formatter

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        //Here we initialize methods:
        greetingsMethod();
        concatenationMediumValue ();
        studentList ();

    }

    // Here is a method for 3 ways of concatenation.
    public static void greetingsMethod() {
        String wordOne = "Hello ";
        String wordTwo = "World";
        // simple concatenation with +:
        String wordConcatenation = wordOne + wordTwo;
        System.out.println(wordConcatenation);
        // second simple way of concatenation:
        wordOne += wordTwo;
        System.out.println(wordOne);

        String wordSome = "H3LLO";
        String wordSomeTwo = "WorlD!";

        // here is the third way of concatenation of String values:

        String wordThree = wordOne.concat(wordSome);
        System.out.println (wordThree);
        System.out.println(wordSome.concat(wordSomeTwo).concat(wordOne).concat(wordTwo));
        // here is the fourth way of concatenation:
        System.out.println(String.format("Hello wonderful %s around us.", "World"));

    }
    //Here is the method which returns the letters from the middle.
    public static void concatenationMediumValue (){
        String wordPractice = "Concatenation";

        int number = 1;
        int wordLength = wordPractice.length();
        int divide = wordLength %2;
        System.out.println(divide);
        if (divide == 1) {
            int middle = wordLength / 2;
            int nearMiddle = middle - 1;
            char result = wordPractice.charAt(middle);
            char secondResult = wordPractice.charAt(nearMiddle);
            String resultOne = Character.toString(result);
            String resultTwo = Character.toString(secondResult);
            System.out.println(resultTwo + resultOne);
        }else {
            //I've made this part for the case of words which has uneven quantity of letters,
            // and for the practice of If statement
            int middle = wordLength / 2;
            char result = wordPractice.charAt(middle);
            String resultOne = Character.toString(result);
            System.out.println(resultOne);
        }
    }
    //creation of the Student's list;
    public static void studentList () {
        String[] studentNames = {"Igor", "Pavlo", "Semen", "Ilona", "Iryna", "Oleksandra", "Lesya", "Fedir", "Ostap", "Maryna"};
        String[] studentSurname = {"Ostapchuk", "Shevchenko", "Victorov", "Rybalko", "Semenko", "Lyashchuk", "Solomenko", "Vyshnevetskiy", "Dovbush", "Yakymenko"};
        String[] studentFaculty = {"Informatics", "Design", "Mathematics", "Economics", "Politology", "Animation", "Ecology", "Mathematics", "Design", "Animation"};
        Formatter f = new Formatter();

        for (int i = 0; i < studentSurname.length;) {

            f.format( (i+1) + ". "+ "Student %s %s %s", studentNames[i], studentSurname[i], studentFaculty[i] + ". " +"\n");
            i++;

        }
        System.out.println("Here is a list of students of different faculties:");
        System.out.println(f);


    }


}
