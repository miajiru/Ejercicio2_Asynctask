package es.schooleando.ejercicio2;

import android.os.AsyncTask;
import android.os.SystemClock;

/**
 * Created by angel on 07/11/2016.
 */
public class TareaDescarga extends AsyncTask<Integer, Void, Void>{

    @Override
    protected Void doInBackground(Integer... params) {
        SystemClock.sleep(params[0]);
        return null;
    }
}
