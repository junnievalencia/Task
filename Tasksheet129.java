public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.pet();
        gorilla.groom();
        gorilla.feed(true);
    } 
}

class Gorilla implements Animal {

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla. Lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla. Pet at your own risk!");
    }

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Gorilla food has been placed into the cage.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
