package com.hmelizarraraz.movies.movies;

import com.hmelizarraraz.movies.http.MoviesApiService;
import com.hmelizarraraz.movies.http.MoviesExtraInfoApisService;
import com.hmelizarraraz.movies.http.apimodel.Result;

import io.reactivex.Observable;

public class MoviesRespository implements Repository {

    private MoviesApiService moviesApiService;
    private MoviesExtraInfoApisService extraInfoApisService;

    public MoviesRespository(MoviesApiService mService, MoviesExtraInfoApisService eService) {
        this.moviesApiService       = mService;
        this.extraInfoApisService   = eService;
    }

    @Override
    public Observable<Result> getResultData() {
        return null;
    }

    @Override
    public Observable<String> getCountryData() {
        return null;
    }
}
