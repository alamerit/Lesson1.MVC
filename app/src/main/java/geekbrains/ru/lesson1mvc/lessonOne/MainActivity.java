package geekbrains.ru.lesson1mvc.lessonOne;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import geekbrains.ru.lesson1mvc.R;


public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener{
        private Presenter presenter;
        Map<Integer,Integer> hashId = new HashMap<>();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            findViewById(R.id.btnCounter1).setOnClickListener(this);
            findViewById(R.id.btnCounter2).setOnClickListener(this);
            findViewById(R.id.btnCounter3).setOnClickListener(this);
            hashId.put(R.id.btnCounter1,0);
            hashId.put(R.id.btnCounter2,1);
            hashId.put(R.id.btnCounter3,2);
            presenter = new Presenter(this);
        }


    @Override
    public void onClick(View v) {
        int w = v.getId();
        if(hashId.get(v.getId())!= null){
        presenter.onClick(hashId.get(w),w);}
        }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        presenter.update(hashId);
    }

    @Override
    public void setButtonText(int id, int value) {
        Button button = findViewById(id);
        if(button == null){
            //print error
            //show toast with error
            //send event to analytic
            return;
        }
        button.setText("Количество = " + value);
    }
}

