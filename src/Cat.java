

public class Cat  {
    private static int mood;
    private static int hungry;
    private static int energy;
   // am introdus si settere dar nu cred ca avem nevoie sa setam noi valorile mood ,hungry si energy; :))
    public static int getMood() {
        System.out.println("mood :" + mood);
        return mood;
    }

    public static void setMood(int mood) {
        Cat.mood = mood;
    }

    public static int getHungry() {
        System.out.println("Hungry :" + hungry);
        return hungry;
    }

    public static void setHungry(int hungry) {
        Cat.hungry = hungry;
    }

    public static int getEnergy() {
        System.out.println("Energy :" + energy);
        return energy;
    }

    public static void setEnergy(int energy) {
        Cat.energy = energy;
    }

    private static void meow() {
        System.out.println("meow");
    }

    public static void Feed() {
        hungry--;
        mood++;
        meow();

    }

    public static void Play() {
        energy--;
        mood++;
        meow();
    }

    public static void Sleep() {
        energy++;
        hungry++;
        meow();
    }
}
