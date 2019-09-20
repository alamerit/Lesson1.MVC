package geekbrains.ru.lesson1mvc.LessonTwo.observable.tuskTwo;


import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class TuskTwoPresenter {

    private  static  final  String TAG = "Presenter";

    public Observable<Object> getActiv() {

         Observable<Object> observable = Observable.create((emitter) -> {


            try {
                for (int i = 0; i < 4; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String obs = " Activ " + i;
                    Log.d(TAG, Thread.currentThread().getName() + " + " + obs);


                }
            } catch (InterruptedException e) {
                Log.d(TAG, "Not Disp");
            }
        }).subscribeOn(Schedulers.io());
        Subject subject = PublishSubject.create();
        observable.safeSubscribe(subject);
         return observable;
    }




}
