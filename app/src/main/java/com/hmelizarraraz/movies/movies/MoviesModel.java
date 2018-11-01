package com.hmelizarraraz.movies.movies;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

public class MoviesModel implements MoviesMVP.Model {

    private MoviesRepository repository;

    public MoviesModel(MoviesRepository repository) {
        this.repository = repository;
    }


    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(repository.getResultData(), repository.getCountryData(), new BiFunction<Result, String, ViewModel>() {
            @Override
            public ViewModel apply(Result result, String country) {
                // todo cambiar result.toString() por pojo de datos
                return new ViewModel(result.toString(), country);
            }
        });
    }
}
