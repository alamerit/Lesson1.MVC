package geekbrains.ru.lesson1mvc.LessonTwo.observable.tuskTwo;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Observ {

    public Observer getObserver(){
        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        return observer;
    }

}
