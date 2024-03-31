public class Feliz implements TamagotchiState{

    private Tamagotchi tamagotchi;
    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void darDeBeber() {
        tamagotchi.setEstado(new Hambriento());
        System.out.println("¡Que hambre tengo!. Nuevo estado: hambriento");
    }

    @Override
    public void darDeComer() {
        tamagotchi.setEstado(new Sediento());
        System.out.println("Ahora tengo sed. Nuevo estado: sediento");
    }

    @Override
    public void acariciar() {
        System.out.println("No hubo cambios en el animo del Tamagotchi. Estado "+getClass().getSimpleName());
    }
}
