package com.hmelizarraraz.movies.movies;

import com.hmelizarraraz.movies.http.apimodel.Result;

import io.reactivex.Observable;

public interface Repository {

    Observable<Result> getResultData();

    Observable<String> getCountryData();


}
