package mno.mohamed_youssef.firebase;

import com.firebase.client.Firebase;

/**
 * Created by Mohamed Yossif on 27/04/2016.
 */
public class data extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);


    }
}
