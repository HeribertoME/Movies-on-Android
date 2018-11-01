package com.hmelizarraraz.movies.movies;

import com.hmelizarraraz.movies.http.MoviesApiService;
import com.hmelizarraraz.movies.http.MoviesExtraInfoApisService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MoviesModule {

    @Provides
    public MoviesMVP.Presenter provideMoviesPresenter(MoviesMVP.Model moviesModel) {
        return new MoviesPresenter(moviesModel);
    }

    @Provides
    public MoviesMVP.Model provideMovieModel(Repository repository) {
        return new MoviesModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideMovieRepository(MoviesApiService moviesApiService, MoviesExtraInfoApisService moviesExtraInfoApisService) {
        return new MoviesRespository(moviesApiService, moviesExtraInfoApisService);
    }

}
