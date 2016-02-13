package ga.jkowalczyk.wisielec;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jaaku on 12.02.2016.
 */
public class Sprawdz {
    int stan=0;
    public String Sprawdzam (String znak, String wyraz, String zakodowane,Context context,TextView tw,ImageView status_img,TextView status_text)
    {
        boolean wystapilo=false;
    if(stan<5){
            char[] zakodowanywyraz2 = zakodowane.toCharArray(); //zamiana słowa (zamienionego na kreski) na tablice char
            for (int i = 0; i < wyraz.length(); i++) {
                if (znak.charAt(0) == wyraz.charAt(i)) //sprawdzanie czy znak podany prze usera znajduje się w wyrazie
                {
                    zakodowanywyraz2[i] = znak.charAt(0); // jeśli tak wyraz w postaci kresek jest uzupełniany występującymi literami
                    wystapilo=true;
                }
            }
            zakodowane = ""; //resetowanie zakodowanego wyrazu
            for (int i = 0; i < wyraz.length(); i++) {
                zakodowane = zakodowane + zakodowanywyraz2[i]; //uzupełnianie zakodowanego wyrazu za pomoca tablicy char
            }
            tw.setText("" + zakodowane);
            if (zakodowane.equals(wyraz) == true)
            {
                Toast.makeText(context, "Gratulacje udało ci się odgadnąć wyraz ;D", Toast.LENGTH_SHORT).show();

                Log.e("Test33", "i am here");
            }
        if(wystapilo==false)
        {
            wystapilo=false;
            stan=stan+1;
            status_text.setText(""+stan);
            Log.e("Ilość nieudanych prób",""+stan);
        }
            return zakodowane;
    }
        else
{
    Toast.makeText(context, "Niestety zostałeś powieszony ;D", Toast.LENGTH_SHORT).show();
    return wyraz;
}
    }
}
