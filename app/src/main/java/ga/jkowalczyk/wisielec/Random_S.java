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
        "dym","świadek","pamięć","dzwonek"};
        Random generator = new Random();
        int i = generator.nextInt(42) + 1;
        String slowo = slowa1[i];
        Log.e("slowo",":"+slowo);
        return slowo;
    }
}
