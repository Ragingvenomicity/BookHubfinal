package com.mapp.bookhub;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class BottomNavigationFragment extends BottomSheetDialogFragment {

    NavigationView navigationView;
    Fragment fragment;
    FragmentTransaction transaction;
    Intent intent;
    int previousSelectedItem = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.bottom_navigation_fragment,container,false);

        navigationView = rootView.findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int menuId = menuItem.getItemId();
                menuItem.setCheckable(true);

                switch(menuId)
                {
                    case R.id.workshops: fragment = new Chemistry();
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, fragment).commit();
                        previousSelectedItem = menuId;
                        menuItem.setChecked(true);
                        break;

                    case R.id.schedule: fragment = new Physics();
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, fragment).commit();
                        previousSelectedItem = menuId;
                        menuItem.setChecked(true);
                        break;



                    case R.id.sponsors: fragment = new LogoutFragment();
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, fragment).commit();
                        previousSelectedItem = menuId;
                        menuItem.setChecked(true);
                        break;

                    case R.id.combos: fragment = new AccountFragment();
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, fragment).commit();
                        previousSelectedItem = menuId;
                        menuItem.setChecked(true);
                        break;
                    case R.id.convoke: fragment = new Mathematics();
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, fragment).commit();
                        previousSelectedItem = menuId;
                        menuItem.setChecked(true);
                        break;



                }

                getDialog().cancel();
                return true;
            }
        });


        return rootView;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);

    }
}
