package v1;

public class Client {
    public static void main (String[] args) {
        System.out.println("Adapter Design Pattern Example V1 ");

        // Created instances of devices
        Iphone iPhone = new Iphone();
        Googlephone googlePhone = new Googlephone();
        EarPlug earPlug = new EarPlug();

        // Ear plug is able to take iPhone sound signal
        String soundSignal = iPhone.getSoundOutput();
        earPlug.takeSoundInput(soundSignal);

        // Ear plug is not able to take google phone sound signal
        Integer soundSignals = googlePhone.getSoundOutput();

        // Created adapter to convert signals expected by client
        EarPlugAdapter earPlugAdapter = new EarPlugAdapter();
        earPlug.takeSoundInput(earPlugAdapter.convertSoundSignal(soundSignals));

    }
}