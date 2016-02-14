package ga.jkowalczyk.wisielec;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;


public class WiActivity extends AppCompatActivity {
    String wyraz="",zakodowanywyraz="";
    TextView slowo,stan_text;
    ImageView stan_img;
    Context context;
    Sprawdz sprawdz;
    Blokuj blokuj;
    Random_S random_s;
    Koduj koduj;
    Button buttona,buttoną,buttonb,buttonc,buttonć,buttond,buttone,
            buttonę,buttonf, buttong,buttonh,buttoni,buttonj,buttonk;
    Button buttonl,buttonł,buttonm,buttonn,buttonń,buttono,buttonó,
            buttonp,buttonr,buttons,buttonś,buttont,buttonu,buttonw,buttony,
            buttonz,buttonż,buttonź;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        stan_img =(ImageView)findViewById(R.id.stan);
        stan_text =(TextView)findViewById(R.id.stan_text);
        Log.e("start","1");
        koduj = new Koduj();
        random_s = new Random_S();
        sprawdz = new Sprawdz();
        blokuj = new Blokuj();
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        slowo.setText("" + zakodowanywyraz);
        context = getApplicationContext();
        buttona=(Button)findViewById(R.id.A);
        buttoną=(Button)findViewById(R.id.Ą);
        buttonb=(Button)findViewById(R.id.B);
        buttonc=(Button)findViewById(R.id.C);
        buttonć=(Button)findViewById(R.id.Ć);
        buttond=(Button)findViewById(R.id.D);
        buttone=(Button)findViewById(R.id.E);
        buttonę=(Button)findViewById(R.id.Ę);
        buttonf=(Button)findViewById(R.id.F);
        buttong=(Button)findViewById(R.id.G);
        buttonh=(Button)findViewById(R.id.H);
        buttoni=(Button)findViewById(R.id.I);
        buttonj=(Button)findViewById(R.id.J);
        buttonk=(Button)findViewById(R.id.K);
        buttonl=(Button)findViewById(R.id.L);
        buttonł=(Button)findViewById(R.id.Ł);
        buttonm=(Button)findViewById(R.id.M);
        buttonn=(Button)findViewById(R.id.N);
        buttonń=(Button)findViewById(R.id.Ń);
        buttono=(Button)findViewById(R.id.O);
        buttonó=(Button)findViewById(R.id.Ó);
        buttonp=(Button)findViewById(R.id.P);
        buttonr=(Button)findViewById(R.id.R);
        buttons=(Button)findViewById(R.id.S);
        buttonś=(Button)findViewById(R.id.Ś);
        buttont=(Button)findViewById(R.id.T);
        buttonu=(Button)findViewById(R.id.U);
        buttonw=(Button)findViewById(R.id.W);
        buttony=(Button)findViewById(R.id.Y);
        buttonz=(Button)findViewById(R.id.Z);
        buttonż=(Button)findViewById(R.id.Ż);
        buttonź=(Button)findViewById(R.id.Ź);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void A(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("a",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttona.setClickable(false);
        buttona.setBackgroundColor(Color.GRAY);
    }

    public void Ą(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ą",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttoną.setClickable(false);
        buttoną.setBackgroundColor(Color.GRAY);
    }

    public void B(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("b",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonb.setClickable(false);
        buttonb.setBackgroundColor(Color.GRAY);
    }

    public void C(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("c",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonc.setClickable(false);
        buttonc.setBackgroundColor(Color.GRAY);
    }

    public void Ć(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ć",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonć.setClickable(false);
        buttonć.setBackgroundColor(Color.GRAY);
    }

    public void D(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("d",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttond.setClickable(false);
        buttond.setBackgroundColor(Color.GRAY);
    }

    public void E(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("e",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttone.setClickable(false);
        buttone.setBackgroundColor(Color.GRAY);
    }

    public void Ę(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ę",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonę.setClickable(false);
        buttonę.setBackgroundColor(Color.GRAY);
    }

    public void F(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("f",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonf.setClickable(false);
        buttonf.setBackgroundColor(Color.GRAY);
    }

    public void G(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("g",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttong.setClickable(false);
        buttong.setBackgroundColor(Color.GRAY);
    }

    public void H(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("h",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonh.setClickable(false);
        buttonh.setBackgroundColor(Color.GRAY);
    }

    public void I(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("i",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttoni.setClickable(false);
        buttoni.setBackgroundColor(Color.GRAY);
    }

    public void J(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("j",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonj.setClickable(false);
        buttonj.setBackgroundColor(Color.GRAY);
    }

    public void K(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("k",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonk.setClickable(false);
        buttonk.setBackgroundColor(Color.GRAY);
    }

    public void L(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("l",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonl.setClickable(false);
        buttonl.setBackgroundColor(Color.GRAY);
    }

    public void Ł(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ł",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonł.setClickable(false);
        buttonł.setBackgroundColor(Color.GRAY);
    }

    public void M(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("m",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);;
        buttonm.setClickable(false);
        buttonm.setBackgroundColor(Color.GRAY);
    }

    public void N(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("n",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonn.setClickable(false);
        buttonn.setBackgroundColor(Color.GRAY);
    }

    public void Ń(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ń",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonń.setClickable(false);
        buttonń.setBackgroundColor(Color.GRAY);
    }

    public void O(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("o",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttono.setClickable(false);
        buttono.setBackgroundColor(Color.GRAY);
    }

    public void Ó(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ó",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonó.setClickable(false);
        buttonó.setBackgroundColor(Color.GRAY);
    }

    public void P(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("p",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonp.setClickable(false);
        buttonp.setBackgroundColor(Color.GRAY);
    }

    public void R(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("r",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonr.setClickable(false);
        buttonr.setBackgroundColor(Color.GRAY);
    }

    public void S(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("s",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttons.setClickable(false);
        buttons.setBackgroundColor(Color.GRAY);
    }

    public void Ś(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ś",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonś.setClickable(false);
        buttonś.setBackgroundColor(Color.GRAY);
    }

    public void T(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("t",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttont.setClickable(false);
        buttont.setBackgroundColor(Color.GRAY);
    }

    public void U(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("u",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonu.setClickable(false);;
        buttonu.setBackgroundColor(Color.GRAY);
    }

    public void W(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("w",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonw.setClickable(false);
        buttonw.setBackgroundColor(Color.GRAY);
    }

    public void Y(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("y",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttony.setClickable(false);
        buttony.setBackgroundColor(Color.GRAY);
    }

    public void Z(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("z",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonz.setClickable(false);
        buttonz.setBackgroundColor(Color.GRAY);
    }

    public void Ź(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ź",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonź.setClickable(false);
        buttonź.setBackgroundColor(Color.GRAY);
    }

    public void Ż(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ż",wyraz,zakodowanywyraz,context,slowo, stan_img,stan_text);
        buttonż.setClickable(false);
        buttonż.setBackgroundColor(Color.GRAY);
    }

    public void nowy(View view) {
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        sprawdz.Status(0);
        sprawdz.Status2(false);
        stan_img.setImageResource(R.drawable.stan1);
        slowo.setText("" + koduj.koduj_slowo(wyraz));

        buttona.setClickable(true);
        buttona.setBackgroundColor(Color.WHITE);
        buttoną.setClickable(true);
        buttoną.setBackgroundColor(Color.WHITE);
        buttonb.setClickable(true);
        buttonb.setBackgroundColor(Color.WHITE);
        buttonc.setClickable(true);
        buttonc.setBackgroundColor(Color.WHITE);
        buttonć.setClickable(true);
        buttonć.setBackgroundColor(Color.WHITE);
        buttond.setClickable(true);
        buttond.setBackgroundColor(Color.WHITE);
        buttone.setClickable(true);
        buttone.setBackgroundColor(Color.WHITE);
        buttonę.setClickable(true);
        buttonę.setBackgroundColor(Color.WHITE);
        buttonf.setClickable(true);
        buttonf.setBackgroundColor(Color.WHITE);
        buttong.setClickable(true);
        buttong.setBackgroundColor(Color.WHITE);
        buttonh.setClickable(true);
        buttonh.setBackgroundColor(Color.WHITE);
        buttoni.setClickable(true);
        buttoni.setBackgroundColor(Color.WHITE);
        buttonj.setClickable(true);
        buttonj.setBackgroundColor(Color.WHITE);
        buttonk.setClickable(true);
        buttonk.setBackgroundColor(Color.WHITE);
        buttonl.setClickable(true);
        buttonl.setBackgroundColor(Color.WHITE);
        buttonł.setClickable(true);
        buttonł.setBackgroundColor(Color.WHITE);
        buttonm.setClickable(true);
        buttonm.setBackgroundColor(Color.WHITE);
        buttonn.setClickable(true);
        buttonn.setBackgroundColor(Color.WHITE);
        buttonń.setClickable(true);
        buttonń.setBackgroundColor(Color.WHITE);
        buttono.setClickable(true);
        buttono.setBackgroundColor(Color.WHITE);
        buttonó.setClickable(true);
        buttonó.setBackgroundColor(Color.WHITE);
        buttonp.setClickable(true);
        buttonp.setBackgroundColor(Color.WHITE);
        buttonr.setClickable(true);
        buttonr.setBackgroundColor(Color.WHITE);
        buttons.setClickable(true);
        buttons.setBackgroundColor(Color.WHITE);
        buttonś.setClickable(true);
        buttonś.setBackgroundColor(Color.WHITE);
        buttont.setClickable(true);
        buttont.setBackgroundColor(Color.WHITE);
        buttonu.setClickable(true);
        buttonu.setBackgroundColor(Color.WHITE);
        buttonw.setClickable(true);
        buttonw.setBackgroundColor(Color.WHITE);
        buttony.setClickable(true);
        buttony.setBackgroundColor(Color.WHITE);
        buttonz.setClickable(true);
        buttonz.setBackgroundColor(Color.WHITE);
        buttonż.setClickable(true);
        buttonż.setBackgroundColor(Color.WHITE);
        buttonź.setClickable(true);
        buttonź.setBackgroundColor(Color.WHITE);

    }

    public void info(MenuItem item) {
        Intent intent= new Intent(context,About.class);
        startActivity(intent);
    }
}
