package ga.jkowalczyk.wisielec;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

/**
 * Created by jaaku on 12.02.2016.
 */
public class Sprawdz {
    int stan=0;
    boolean odgadl=false;
    public int Status (int status)
    {
        stan=status;
        return status;
    }
    public boolean Status2 (boolean status2)
    {
        odgadl=status2;
        return odgadl;
    }


    public String Sprawdzam (String znak, String wyraz, String zakodowane,Context context,TextView tw,ImageView status_img)
    {

        boolean wystapilo=false;
        if (odgadl==true)
        {
            Toast.makeText(context, "Gratulacje udało ci się odgadnąć wyraz ;D", Toast.LENGTH_SHORT).show();
        }

            if((stan<7)&&(odgadl==false)) {
                char[] zakodowanywyraz2 = zakodowane.toCharArray(); //zamiana słowa (zamienionego na kreski) na tablice char
                for (int i = 0; i < wyraz.length(); i++) {
                    if (znak.charAt(0) == wyraz.charAt(i)) //sprawdzanie czy znak podany prze usera znajduje się w wyrazie
                    {
                        zakodowanywyraz2[i] = znak.charAt(0); // jeśli tak wyraz w postaci kresek jest uzupełniany występującymi literami
                        wystapilo = true;
                    }
                }
                zakodowane = ""; //resetowanie zakodowanego wyrazu
                for (int i = 0; i < wyraz.length(); i++) {
                    zakodowane = zakodowane + zakodowanywyraz2[i]; //uzupełnianie zakodowanego wyrazu za pomoca tablicy char
                }
                tw.setText("" + zakodowane);
                if (zakodowane.equals(wyraz) == true) {
                    Toast.makeText(context, "Gratulacje udało ci się odgadnąć wyraz ;D", Toast.LENGTH_SHORT).show();
                    odgadl = true;
                    Log.e("Test33", "i am here");
                    Answers.getInstance().logContentView(new ContentViewEvent()
                            .putContentName("Udało się " + wyraz)
                            .putContentType("Udało się"));
                }
                if (wystapilo == false) {
                    wystapilo = false;
                    stan = stan + 1;
                    Log.e("Ilość nieudanych prób", "" + stan);
                }
            }
        if(stan==1)
        {
            status_img.setImageResource(R.drawable.stan1);
        }
        else if (stan==2)
        {
            status_img.setImageResource(R.drawable.stan2);
        }
        else if (stan==3)
        {
            status_img.setImageResource(R.drawable.stan3);
        }
        else if (stan==4)
        {
            status_img.setImageResource(R.drawable.stan4);
        }
        else if (stan==5)
        {
            status_img.setImageResource(R.drawable.stan5);
        }
        else if (stan==6)
        {
            status_img.setImageResource(R.drawable.stan6);
        }

        else if ((stan >= 7)&&(odgadl!=true)) {
            status_img.setImageResource(R.drawable.stan7);
            Toast.makeText(context, "Niestety zostałeś powieszony ;D", Toast.LENGTH_SHORT).show();
            tw.setText("" + wyraz);
            Answers.getInstance().logContentView(new ContentViewEvent()
                    .putContentName("Nie udało się" + wyraz)
                    .putContentType("Nie udało się"));
        }
            return zakodowane;
    }
}
