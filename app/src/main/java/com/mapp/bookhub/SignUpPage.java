package com.mapp.bookhub;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends Fragment {


    public SignUpPage()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sign_up,container,false);

        final EditText name = rootView.findViewById(R.id.signupname_edit);
        final EditText username = rootView.findViewById(R.id.signupusername_edit);
        final EditText password = rootView.findViewById(R.id.signuppassword_edit);

        Button createAccount = rootView.findViewById(R.id.create_account);
        Button sig_in=rootView.findViewById(R.id.sigin);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UsersDatabaseHelper usersDatabaseHelper = new UsersDatabaseHelper(getActivity());

                if(usersDatabaseHelper.searchUname(username.getText().toString()))
                {
                    Toast.makeText(getActivity(), "Username already exists !!", Toast.LENGTH_LONG).show();
                }
                else {

                    UserInfo userInfo = new UserInfo();

                    userInfo.setName(name.getText().toString());
                    userInfo.setUsername(username.getText().toString());
                    userInfo.setPassword(password.getText().toString());


                    usersDatabaseHelper.insertUserData(userInfo);
                    Toast.makeText(getActivity(), "Account created successfully !!", Toast.LENGTH_LONG).show();
                    ((LoginPage)getActivity()).accountCreated(username.getText().toString(),password.getText().toString());


                }
            }
        });
        sig_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(getActivity(),
                        LoginPage.class);
                startActivity(myIntent);
            }
        });

        return rootView;

    }
}
