package kr.co.woobi.imyeon.fragmentexamintextbook;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
    }

    public void changeBackColor(View view) {
        int r = new Random().nextInt(256);
        int g = new Random().nextInt(256);
        int b = new Random().nextInt(256);
        ColorFragment colorFragment= ColorFragment.newInstance();
        colorFragment.setColor(Color.rgb(r, g, b));
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, colorFragment).commit();
    }

    @Override
    public void onBackPressed() {
        ExitDialogFragment fragment=new ExitDialogFragment();
        fragment.show(getSupportFragmentManager(),"exit");
    }
}
