package Net;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/11/21.
 */

public class App extends Application {


    public static Application app;
    public static Context context;

    public static Application getApp() {
        return app;
    }

    public static Context getContext() {
        return context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        context = this;

    }

}
