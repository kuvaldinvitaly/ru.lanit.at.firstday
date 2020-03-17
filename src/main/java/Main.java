import somepackage.Other;
import somepackage.Some;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Some some = new Some();
        System.out.println(some);

        some.setNoMoreSecrets("Это наш первый секрет");
        System.out.println(some.getNoMoreSecrets());

        some.setNoMoreSecrets(123);
        System.out.println(some.getNoMoreSecrets());

        some.getSecret(false);
        System.out.println(some.getSecret());

        some.getSecret(true);
        System.out.println(some.getSecret());

        Some some1 = new Some("Это наш второй секрет");
        System.out.println(some1.getSecret());
        System.out.println(some1.getДаТакТожеМожно());

        some.soTellMeAboutInterfaces();

        int someCount = some.count();
        for (int i = 0; i < 10; i++){
            someCount++;
            System.out.print(someCount + " ");
        }
        System.out.println();

        System.out.println(some.hashCode());
        System.out.println(some.equals(some1));
        System.out.println(some.getClass());
        
    }
}
