public class Triste implements TamagotchiState{
    private Tamagotchi tamagotchi;

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void darDeBeber() {
        System.out.println("el artefacto hace 3 beep y titila el display");
    }

    @Override
    public void darDeComer() {
        System.out.println("hace 2 beep y el display muestra a la mascota vomitando");
    }

    @Override
    public void acariciar() {
        tamagotchi.setEstado(new Feliz());
        System.out.println("¡Que felicidad!. Nuevo estado: Feliz");
    }
}
