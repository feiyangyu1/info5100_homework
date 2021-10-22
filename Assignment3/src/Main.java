public class Main {

    public static void main(String[] args) {

        Psychiatrist thePsychiatrist = new Psychiatrist();

        Sad theSad = new Sad();
        Happy theHappy = new Happy();

        thePsychiatrist.examine(theHappy);
        theHappy.ExpressFeelings();
        thePsychiatrist.observe(theHappy);

        thePsychiatrist.examine(theSad);
        theSad.ExpressFeelings();
        thePsychiatrist.observe(theSad);
    }
}
