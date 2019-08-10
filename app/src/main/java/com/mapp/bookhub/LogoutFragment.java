package com.mapp.bookhub;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LogoutFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

                Logout();
                return super.onCreateView(inflater, container, savedInstanceState);
        }
        public void Logout()
        {
                SharedPreferences sp = getActivity().getSharedPreferences("key", 0);
                SharedPreferences.Editor editor = sp.edit();
                editor.remove("Login").commit();
                editor.remove("Username").commit();
                editor.remove("Password").commit();
                Intent intent = new Intent(getActivity(), LoggingOff.class);
                startActivity(intent);

        }


}
