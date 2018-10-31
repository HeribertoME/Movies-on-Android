package com.hmelizarraraz.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.hmelizarraraz.movies.movies.MoviesMVP;
import com.hmelizarraraz.movies.movies.ViewModel;
import com.hmelizarraraz.movies.root.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MoviesMVP.View {

    private final String TAG = MainActivity.class.getName();

    @BindView(R.id.root_view)
    ViewGroup rootView;

    @BindView(R.id.rv_movies)
    RecyclerView recyclerView;

    @Inject
    MoviesMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((App)getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.loadData();
    }

    @Override
    public void updateData(ViewModel viewModel) {

    }

    @Override
    public void showSnackbar(String s) {

    }
}
