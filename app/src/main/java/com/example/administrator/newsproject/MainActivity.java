package com.example.administrator.newsproject;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.RequestQueue;

import Net.Net;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private Application app;
    private String url = "http://apis.baidu.com/txapi/apple/apple?num=50&page=1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        initData();

    }

    private void initData() {
        /**
         * 这个地方的问题 特别严重!!!
         *                   - 对象名.非静态成员方法()
         * 函数调用有两种 {
         *                  - 类名.静态成员方法()
         *
         *         不管以上哪一种使用方式, 都不会出现下面的那种语法!
         *
         *         切记!
         *
         * */
//         Net.get_Instance(Net.App.getApp()).get_RequestQueue();
//        正确写法如下
        RequestQueue requestQueue = Net.getInstance(getApplication()).getRequestQueue();
        

    }

    private void initView() {
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(null);
    }
}
