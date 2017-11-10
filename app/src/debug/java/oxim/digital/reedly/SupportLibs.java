package oxim.digital.reedly;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class SupportLibs {
    public static void init(Application application) {
        Stetho.initializeWithDefaults(application);
    }
}