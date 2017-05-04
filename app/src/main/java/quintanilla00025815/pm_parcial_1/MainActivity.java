package quintanilla00025815.pm_parcial_1;
import Classes.*;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import  android.widget.ListView;

import java.util.ArrayList;

import Classes.Country;

public class MainActivity extends AppCompatActivity {


    //Funcion que conecta con el juego
    public void game(View v){
        Intent game=new Intent(this,QuizActivity.class);
        startActivity(game);
    }

    public void learn(View v){
        Intent learn=new Intent(this,mainLearning.class);
        startActivity(learn);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
