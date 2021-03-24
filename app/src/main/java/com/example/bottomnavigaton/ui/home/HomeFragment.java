package com.example.bottomnavigaton.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.bottomnavigaton.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    private FloatingActionButton fab;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        initViews(view);
        setupListeners();
    }
    private void initViews(View view){

        fab = view.findViewById(R.id.fab);
    }
    public void setupListeners(){
        fab.setOnClickListener(v -> {
            navController.navigate(R.id.action_navigation_home_to_fromFragment);
        });
    }

}