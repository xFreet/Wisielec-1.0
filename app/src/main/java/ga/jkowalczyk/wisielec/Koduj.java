package ga.jkowalczyk.wisielec;

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
        return zakodowane;
    }
}
