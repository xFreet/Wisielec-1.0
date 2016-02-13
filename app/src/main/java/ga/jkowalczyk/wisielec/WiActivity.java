package ga.jkowalczyk.wisielec;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WiActivity extends AppCompatActivity {
    String wyraz="",zakodowanywyraz="";
    int how_much=0;
    TextView slowo;
    ImageView stan;
    Context context;
    Sprawdz sprawdz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        stan=(ImageView)findViewById(R.id.stan);
        Koduj koduj = new Koduj();
        Random_S random_s = new Random_S();
        sprawdz = new Sprawdz();
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        slowo.setText("" + koduj.koduj_slowo("" + wyraz));
        context = getApplicationContext();

    }

    public void A(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("a",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ą(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ą",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void B(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("b",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void C(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("c",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ć(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ć",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void D(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("d",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void E(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("e",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ę(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ę",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void F(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("f",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void G(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("g",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void H(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("h",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void I(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("i",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void J(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("j",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void K(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("k",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void L(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("l",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ł(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ł",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void M(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("m",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void N(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("n",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ń(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ń",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void O(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("o",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ó(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ó",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void P(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("p",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void R(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("r",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void S(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("s",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ś(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ś",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void T(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("t",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void U(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("u",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void W(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("w",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Y(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("y",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Z(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("z",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ź(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ź",wyraz,zakodowanywyraz,context,slowo,stan);
    }

    public void Ż(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ż",wyraz,zakodowanywyraz,context,slowo,stan);
    }
}
