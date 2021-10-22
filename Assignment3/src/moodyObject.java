public abstract class moodyObject {

    public abstract String getMood();

    public abstract void ExpressFeelings();

    public void queryMood(){
        System.out.println("I feel " + getMood() + " today");
    }

}
