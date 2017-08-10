package com.example.androidthings.simplepio;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class LogErrorSubscriber<T> implements Observer<T> {

    private String tag;

    public LogErrorSubscriber(String tag) {
        this.tag = tag;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        Logger.e(tag, "Got error in subscription", e);
    }

    @Override
    public void onComplete() {

    }
}