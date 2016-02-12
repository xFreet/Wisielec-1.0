package ga.jkowalczyk.wisielec;

import android.content.Context;
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
    Context context;
    Sprawdz sprawdz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        Koduj koduj = new Koduj();
        Random_S random_s = new Random_S();
        sprawdz = new Sprawdz();
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        slowo.setText("" + koduj.koduj_slowo(""+wyraz));
        context = getApplicationContext();

    }

    public void A(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("a",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ą(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ą",wyraz,zakodowanywyraz,context,slowo);
    }

    public void B(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("b",wyraz,zakodowanywyraz,context,slowo);
    }

    public void C(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("c",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ć(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ć",wyraz,zakodowanywyraz,context,slowo);
    }

    public void D(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("d",wyraz,zakodowanywyraz,context,slowo);
    }

    public void E(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("e",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ę(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ę",wyraz,zakodowanywyraz,context,slowo);
    }

    public void F(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("f",wyraz,zakodowanywyraz,context,slowo);
    }

    public void G(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("g",wyraz,zakodowanywyraz,context,slowo);
    }

    public void H(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("h",wyraz,zakodowanywyraz,context,slowo);
    }

    public void I(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("i",wyraz,zakodowanywyraz,context,slowo);
    }

    public void J(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("j",wyraz,zakodowanywyraz,context,slowo);
    }

    public void K(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("k",wyraz,zakodowanywyraz,context,slowo);
    }

    public void L(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("l",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ł(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ł",wyraz,zakodowanywyraz,context,slowo);
    }

    public void M(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("m",wyraz,zakodowanywyraz,context,slowo);
    }

    public void N(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("n",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ń(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ń",wyraz,zakodowanywyraz,context,slowo);
    }

    public void O(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("o",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ó(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ó",wyraz,zakodowanywyraz,context,slowo);
    }

    public void P(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("p",wyraz,zakodowanywyraz,context,slowo);
    }

    public void R(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("r",wyraz,zakodowanywyraz,context,slowo);
    }

    public void S(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("s",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ś(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ś",wyraz,zakodowanywyraz,context,slowo);
    }

    public void T(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("t",wyraz,zakodowanywyraz,context,slowo);
    }

    public void U(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("u",wyraz,zakodowanywyraz,context,slowo);
    }

    public void W(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("w",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Y(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("y",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Z(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("z",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ź(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ź",wyraz,zakodowanywyraz,context,slowo);
    }

    public void Ż(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ż",wyraz,zakodowanywyraz,context,slowo);
    }
}
