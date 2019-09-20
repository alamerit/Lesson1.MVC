package geekbrains.ru.lesson1mvc.lessonOne;
import android.util.Log;

import java.util.Map;
import java.util.Set;



class Presenter
{
    private Model model;
    private MainView view;
    private final String  TAG = this.getClass().getSimpleName();

    Presenter(MainView view){

        model = new Model();
        this.view = view;
    }

    private void updateNewElementValue(int idx, int id){
        int newValue = model.getElementValueAtIndex(idx) + 1;
        model.setElementValueAtIndex(idx, newValue);
        view.setButtonText(id, newValue);
    }

    void onClick(int q,int id) {
        updateNewElementValue(q,id);
    }

    void update(Map hashId) {
        Set<Map.Entry<Integer, Integer>> set = hashId.entrySet();

        for (Map.Entry<Integer, Integer> me : set) {
            Log.i(TAG, me.getValue()+" : " + me.getKey());
            view.setButtonText((int)me.getKey(), model.getElementValueAtIndex(me.getValue()));
        }


    /*    for (int i = 0; i < hashId.size() ; i++) {
            view.setButtonText((int)hashId.get(i), model.getElementValueAtIndex(i));


        }*/
    }
}
