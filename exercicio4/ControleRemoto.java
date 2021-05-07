public class ControleRemoto {
    
    Televisao tv = new Televisao();

    public void aumentarVolume() {
        int volume = tv.getVolume() + 1;
        tv.setVolume(volume);
    }

    public void diminuirVolume() {
        int volume = tv.getVolume() - 1;
        tv.setVolume(volume);
    }

    public void aumentarCanal() {
        int canal = tv.getCanal() + 1;
        tv.setCanal(canal);
    }

    public void diminuirCanal() {
        int canal = tv.getCanal() - 1;
        tv.setCanal(canal);
    }

    public void trocarCanal(int canal) {
        tv.setCanal(canal);
    }

    public int consultarVolume() {
        return tv.getVolume();
    }

    public int consultarCanal() {
        return tv.getCanal();
    }

}
