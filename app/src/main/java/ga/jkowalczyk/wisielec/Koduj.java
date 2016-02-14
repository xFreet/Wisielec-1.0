package ga.jkowalczyk.wisielec;

import android.util.Log;

/**
 * Created by jaaku on 12.02.2016.
 */
public class Koduj {

    public String koduj_slowo (String slowo)
    {
        String zakodowane="";
        for(int i=0; i<slowo.length();i++)
        {
            zakodowane=zakodowane+"-";
        }
        Log.e("zakodowane", zakodowane);
        return zakodowane;
    }
}
