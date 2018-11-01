package com.hmelizarraraz.movies.http;

import com.hmelizarraraz.movies.http.apimodel.TopsMoviesRated;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesApiService {

    @GET("top_rated")
    Observable<TopsMoviesRated> getTopMoviesTated(@Query("page") Integer page);
}
