public class Hambriento implements TamagotchiState{

    private Tamagotchi tamagotchi;
    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void darDeBeber() {
        tamagotchi.setEstado(new Triste());
        System.out.println("Que tristeza. Nuevo estado: Triste");

    }

    @Override
    public void darDeComer() {
        tamagotchi.setEstado(new Feliz());
        System.out.println("¡Que felicidad!. Nuevo estado: Feliz");

    }

    @Override
    public void acariciar() {
        System.out.println("No hubo cambios en el animo del Tamagotchi. Estado "+getClass().getSimpleName());
    }
}
