package com.example.network.oberver;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 统一回调
 * @param <T>
 */
public abstract class BaseOberver<T> implements Observer<T>
{
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    @Override
    public void onError(Throwable e) {
        onFail(e);
    }

    @Override
    public void onComplete() {

    }


    public abstract void onSuccess(T t);

    public abstract void onFail(Throwable e);

}
