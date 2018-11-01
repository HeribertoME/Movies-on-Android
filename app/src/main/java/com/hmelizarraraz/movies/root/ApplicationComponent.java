package com.hmelizarraraz.movies.root;

import com.hmelizarraraz.movies.MainActivity;
import com.hmelizarraraz.movies.http.MovieExtraInfoApiModule;
import com.hmelizarraraz.movies.http.MovieTitleApiModule;
import com.hmelizarraraz.movies.movies.MoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        MoviesModule.class,
        MovieTitleApiModule.class,
        MovieExtraInfoApiModule.class
})
public interface ApplicationComponent {

    void inject(MainActivity target);
}
