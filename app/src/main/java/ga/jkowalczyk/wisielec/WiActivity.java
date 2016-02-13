package ga.jkowalczyk.wisielec;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WiActivity extends AppCompatActivity {
    String wyraz="",zakodowanywyraz="";
    TextView slowo,stan_text;
    ImageView stan_img;
    Context context;
    Sprawdz sprawdz;
    Blokuj blokuj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        stan_img =(ImageView)findViewById(R.id.stan);
        stan_text =(TextView)findViewById(R.id.stan_text);
        Log.e("start","1");
        Koduj koduj = new Koduj();
        Random_S random_s = new Random_S();
        sprawdz = new Sprawdz();
        blokuj = new Blokuj();
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        slowo.setText("" + zakodowanywyraz);
        context = getApplicationContext();

    }

    public void A(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("a",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ą(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ą",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void B(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("b",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void C(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("c",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ć(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ć",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void D(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("d",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void E(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("e",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ę(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ę",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void F(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("f",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void G(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("g",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void H(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("h",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void I(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("i",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void J(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("j",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void K(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("k",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void L(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("l",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ł(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ł",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void M(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("m",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void N(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("n",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ń(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ń",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void O(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("o",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ó(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ó",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void P(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("p",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void R(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("r",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void S(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("s",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ś(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ś",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void T(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("t",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void U(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("u",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void W(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("w",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Y(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("y",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Z(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("z",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ź(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ź",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }

    public void Ż(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ż",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
    }
}
