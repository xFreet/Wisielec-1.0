package ga.jkowalczyk.wisielec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WiActivity extends AppCompatActivity {
    String wyraz="",zakodowanywyraz="",znak="";
    char pznak;
    TextView slowo;
    EditText dawaj_znak;
    char[] zakodowanywyraz2;
    Button dalej;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        wyraz="jeden";
        for(int i=0; i<wyraz.length();i++)
        {
            zakodowanywyraz=zakodowanywyraz+"-"; //wyświetlanie długości słowa za pomocą kresek
        }
        slowo.setText("" + zakodowanywyraz);   //jw
    }

    public void dalej(View view) {
       dalej=(Button)findViewById(R.id.dalej);
    dawaj_znak= (EditText)findViewById(R.id.znak);
    znak=dawaj_znak.getText().toString(); //pobranie znaku od usera
        zakodowanywyraz2=zakodowanywyraz.toCharArray(); //zamiana słowa (zamienionego na kreski) na tablice char
        for(int i=0;i<wyraz.length();i++)
        {
            if(znak.charAt(0)==wyraz.charAt(i)) //sprawdzanie czy znak podany prze usera znajduje się w wyrazie
            {
            zakodowanywyraz2[i]=znak.charAt(0); // jeśli tak wyraz w postaci kresek jest uzupełniany występującymi literami
            }
        }
        zakodowanywyraz=""; //resetowanie zakodowanego wyrazu
        for(int i=0;i<wyraz.length();i++)
        {
            zakodowanywyraz=zakodowanywyraz+zakodowanywyraz2[i]; //uzupełnianie zakodowanego wyrazu za pomoca tablicy char
        }
        Log.e("Test22",""+zakodowanywyraz+"//"+wyraz);
        if(zakodowanywyraz.equals(wyraz)==true)
        {
            Toast.makeText(getApplicationContext(), "Gratulacje udało ci się odgadnąć wyraz ;D", Toast.LENGTH_SHORT).show();
            dalej.setClickable(false);
            Log.e("Test33", "i am here");
        }
        slowo.setText(""+zakodowanywyraz); //wyświetlenia słowa za pomocą kresek i podanych przez usera liter
        dawaj_znak.setText(""); // resetowanie pola w którym user podaje znak
    }

}
