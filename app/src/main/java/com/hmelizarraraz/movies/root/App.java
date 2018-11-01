package com.hmelizarraraz.movies.root;

import android.app.Application;

import com.hmelizarraraz.movies.http.MovieExtraInfoApiModule;
import com.hmelizarraraz.movies.http.MovieTitleApiModule;
import com.hmelizarraraz.movies.movies.MoviesModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .moviesModule(new MoviesModule())
                .movieTitleApiModule(new MovieTitleApiModule())
                .movieExtraInfoApiModule(new MovieExtraInfoApiModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
