package com.hmelizarraraz.movies.root;

import com.hmelizarraraz.movies.MainActivity;
import com.hmelizarraraz.movies.http.MovieExtraInfoApiModule;
import com.hmelizarraraz.movies.http.MovieTitleApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, MovieTitleApiModule.class, MovieExtraInfoApiModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);
}
