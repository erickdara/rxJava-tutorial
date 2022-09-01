package com.learning.rxjava.observables;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableUsingJust {

    private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingJust.class);

    public static void main(String... args) {
        Observable.just("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        LOGGER.info("onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull String s) {
                        LOGGER.info("onNext -> {}", s);
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        LOGGER.info("onError {}", throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        LOGGER.info("onComplete");
                    }
                });
    }
}
