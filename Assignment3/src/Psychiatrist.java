public class Psychiatrist {

    public void examine(moodyObject moodyObject){

        System.out.println("How are you feeling today?");
        moodyObject.queryMood();

    }

    public void observe(moodyObject moodyObject){

        System.out.println("Observation: " + moodyObject.toString());

    }

}
