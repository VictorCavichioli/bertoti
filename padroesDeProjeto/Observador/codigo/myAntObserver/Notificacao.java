package myAntObserver;

public abstract class Notificacao {
    
    public String notificar(String nota){
        String novaNota = ("Sua nota é " + nota);

        return novaNota;
    }

}
