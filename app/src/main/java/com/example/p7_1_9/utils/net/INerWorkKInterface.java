package com.example.p7_1_9.utils.net;

public interface INerWorkKInterface {
    //TODO 不考虑回调的情况下，这么写
    public <T> void get(String url,INetCallBack<T> callBack);
}
