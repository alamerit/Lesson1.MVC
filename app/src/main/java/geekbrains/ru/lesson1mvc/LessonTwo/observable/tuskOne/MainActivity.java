package geekbrains.ru.lesson1mvc.LessonTwo.observable.tuskOne;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import geekbrains.ru.lesson1mvc.R;

/*Задание не понял.

* Как здесь использовать Observable?
   Последний вопрос возникает из-за того, что я не представляю такую архитектуру,
   MVP\RxJava библиотека совсем не вписывается.
   */

public class MainActivity extends AppCompatActivity  {
    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);
        initUi();
    }

    private void initUi() {
        editText = findViewById(R.id.editTextAdText);
        textView = findViewById(R.id.textViewLookText);
        editText.addTextChangedListener(textWatcher);
        textView.setVisibility(View.GONE);
        editText.addTextChangedListener(textWatcher);
        textView.setTextSize(45);
    }
    private final TextWatcher textWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            textView.setVisibility(View.VISIBLE);
        }
        public void afterTextChanged(Editable s) {
            if (s.length() == 0) {
                textView.setVisibility(View.GONE);
            }
            else{

                textView.setText( editText.getText());
            }
        }
    };


}

