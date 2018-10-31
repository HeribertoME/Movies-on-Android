package com.hmelizarraraz.movies.root;

import com.hmelizarraraz.movies.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);
}
