package Net;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2016/11/21.
 */

public class Net {
    public static  Net net;
    public RequestQueue requestQueue;
    public Application application;
    private Net(Application application) {

        /**
         * 在构造函数里面 吧要使用的东西, 统一初始化出来, 不要等到使用的时候 去创建对象
         * */
        this.application = application;
        requestQueue = Volley.newRequestQueue(application);
    }

    /**
     * 命名的时候 尽量 是 aBcdef 或者  a_bcdef 这样 不要同时都用
     *
     * 另外, 在对一切获取成员变量  设置 和获取的方法是:  可以使用快捷前  alt + insert 设置getter
     *  或者setter 方法 来设置.
     *
     *  构造方法也尽量使用  该方法来创建
     * */
    public static synchronized Net getInstance(Application application){
        if(net == null){
            net = new Net(application);
        }
        return net;
    }

//    public static synchronized Net get_Instance(Application application){
//        if(net == null){
//            net = new Net(application);
//        }
//        return net;
//    }

    /**
     * 同上
     * */
//    public RequestQueue get_RequestQueue(){

        /**
         * 当执行这段代码的时候, requestQueue 肯定不会 为null ? 为什么?
         * 所以去掉不必要的判断
         * */
//        synchronized (requestQueue){
//            if(requestQueue == null){
//
//            }
//        }
//        return  requestQueue;
//    }


    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
