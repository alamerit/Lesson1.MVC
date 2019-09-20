package geekbrains.ru.lesson1mvc.LessonTwo.observable.tuskTwo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import geekbrains.ru.lesson1mvc.R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainActivity extends AppCompatActivity  {

    private TuskTwoPresenter tuskTwoPresenter;
    private Observ observ;
    private Observer observer;
    private Observable<Object> observable;
    private  Disposable disposable;




    private static final String TAG = "MainActivity";
    public void  unsubskribe (View view){}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two_tusk_two);
        tuskTwoPresenter = new TuskTwoPresenter();

        observable = tuskTwoPresenter.getActiv();
        observer =  observ.getObserver();






    }



}

