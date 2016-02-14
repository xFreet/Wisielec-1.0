package ga.jkowalczyk.wisielec;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {
int stan=0;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        context =getApplicationContext();
    }

    public void tosty(View view)
    {
        stan++;
        if((stan==2)||(stan==4)||(stan==6)||(stan==8)||(stan==10)||(stan==12))
        {
            CharSequence text2="1101 \n Jakub Kowalczyk \n Sebastian Smulski";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if( v != null) v.setGravity(Gravity.CENTER);
            toast.show();
        }
        else if (stan==13)
        {
            CharSequence text2="4a616b20772066696c6d6163682e20437a61726e7920756d69657261207069657277737a79";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if( v != null) v.setGravity(Gravity.CENTER);
            toast.show();
        }
        else
        {
            CharSequence text2="Jakub Kowalczyk \n Sebastian Smulski";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if( v != null) v.setGravity(Gravity.CENTER);
            toast.show();
        }
    }
}
