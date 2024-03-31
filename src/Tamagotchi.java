public class Tamagotchi {
    private TamagotchiState estado;

    public Tamagotchi() {
        setEstado(new Feliz());
    }


    public void darDeBeber(){
        this.estado.darDeBeber();
    }

    public void darDeComer(){
        this.estado.darDeComer();
    }

    public void acariciar(){
        this.estado.acariciar();
    }


    public void setEstado(TamagotchiState estado){
        this.estado = estado;
        this.estado.setTamagotchi(this);
    }

    public TamagotchiState getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "El estado actual es: "+ estado.getClass().getSimpleName();
    }
}
