package ga.jkowalczyk.wisielec;

import android.util.Log;

import java.util.Random;

/**
 * Created by jaaku on 13.02.2016.
 */
public class Random_S {
    public String Dawaj_Slowo()
    {
        String[]  slowa1={"góry","samochód","gardło","podbródek","stan","missisipi","spis","obywatel",
                "założenie","wybrzeże","stolik","skrzynki","kwiaty","profil","zdjęcia","taras",
                "szklanka","artykuł","strona","dziennikarz","sala","obecność","wybory","ekspert",
                "problematyka","zagadnienia","kierunek","podsumowanie","dowody","rzecznik","dolar",
                "rozmowa", "handel", "interes", "kredyt", "petruwszedzie","kanapa","sufit", "korytarz",
                "dym","świadek","pamięć","dzwonek","prezydent","koszula","wzrok","ziemia","kamery",
                "tajemnica","ubranie","biały","hazard","aparat","wino","miejsce","pogłoski","pytanie",
                "rzeczownik", "informacje","plotka","ruch","automat","pieść","straż","jutro","student"};

        Random generator = new Random();
        int i = generator.nextInt(65) + 1;
        String slowo = slowa1[i];
        Log.e("slowo",":"+slowo+":"+slowa1.length);
        return slowo;
    }
}
