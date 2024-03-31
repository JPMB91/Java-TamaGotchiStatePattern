public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        System.out.println(tamagotchi);

        tamagotchi.darDeBeber();
        tamagotchi.darDeComer();
        tamagotchi.acariciar();

        System.out.println(tamagotchi);

        tamagotchi.darDeComer();
        tamagotchi.darDeComer();
        System.out.println(tamagotchi);


    }
}
