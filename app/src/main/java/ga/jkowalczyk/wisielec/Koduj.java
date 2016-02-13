package ga.jkowalczyk.wisielec;

import android.util.Log;

/**
 * Created by jaaku on 12.02.2016.
 */
public class Koduj {
    String zakodowane="";
    public String koduj_slowo (String slowo)
    {
        for(int i=0; i<slowo.length();i++)
        {
            zakodowane=zakodowane+"-";
        }
        Log.e("zakodowane", zakodowane);
        return zakodowane;
    }
}
