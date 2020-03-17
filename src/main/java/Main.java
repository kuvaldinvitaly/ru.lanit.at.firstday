import somepackage.Other;
import somepackage.Some;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Some some = new Some("Это новый секрет"); //вызов род класса Abstract, ДаТактожеможно=Это уже не секрет, secret=Это новый секрет

        some.getSecret(false); // достаем секрет=Это новый секрет без присваивания secret = noMoreSecrets
        System.out.println(some.getSecret()); //печатаем секрет 2 строка

        some.getSecret(true); // достаем секрет=Это новый секрет с присваиванием secret = noMoreSecrets, где noMoreSecrets=null
        System.out.println(some.getSecret()); //печатаем секрет 3 строка = null

        some.setNoMoreSecrets("Это наш первый секрет"); // присваиваем новое стринговое значение в noMoreSecret
        System.out.println(some.getNoMoreSecrets()); // печатаем 4 строку

        some.getSecret(true); // достаем секрет=Это новый секрет с присваиванием secret = noMoreSecrets, где noMoreSecrets= "Это наш первый секрет"
        System.out.println(some.getSecret()); //печатаем 5 строку

        some.setNoMoreSecrets(123); // присваиваем новое числовое значение в noMoreSecret
        System.out.println(some.getNoMoreSecrets());  // печатаем 6 строку

        System.out.println(some.getДаТакТожеМожно()); // достаем значение из род класса Abstract

        some.soTellMeAboutInterfaces(); // вызов метода имплементированного интерфейса

        int someCount = some.count(); //реализуем счетчик
        for (int i = 0; i < 10; i++){
            someCount++;
            System.out.print(someCount + " ");
        }
        System.out.println();

        System.out.println(some.hashCode());
        System.out.println(some.getClass());

    }
}
