package rtc.nuntaporn.pangrang.engforfun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import rtc.nuntaporn.pangrang.engforfun.R;
import rtc.nuntaporn.pangrang.engforfun.utility.MyAlert;

/**
 * Created by User on 1/11/2560.
 */

public class RegisterFragment extends Fragment {

    //    Explicit
    private String nameString, emailString, userNameString, passwordString, confirmPasswordString;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Save Controller
        saveController();


    }   // Main Method

    private void saveController() {
        Button button = getView().findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Initial View
                EditText nameEditText = getView().findViewById(R.id.edtName);
                EditText emailEditText = getView().findViewById(R.id.edtEmail);
                EditText userNameEditText = getView().findViewById(R.id.edtUserName);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);
                EditText comfirmPasswordEditText = getView().findViewById(R.id.edtComfirmPassword);

//                Get Value From EditText
                nameString = nameEditText.getText().toString().trim();
                emailString = emailEditText.getText().toString().trim();
                userNameString = userNameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                confirmPasswordString = comfirmPasswordEditText.getText().toString().trim();

//                Check Space
                if (!nameString.isEmpty() &&
                        !emailString.isEmpty() &&
                        !userNameString.isEmpty() &&
                        !passwordString.isEmpty() &&
                        !confirmPasswordString.isEmpty()) {
//                    No Space
//                    Check Mapping Password
                    if (passwordString.equals(confirmPasswordString)) {
//                        Password Mapping

                    } else {
                        MyAlert myAlert = new MyAlert(getActivity());
                        myAlert.myDialog("Password Not Mapping",
                                "Please Type Password Mapping");
                    }

                } else {
//                    Have Space
//                    Toast.makeText(getActivity(), "Have Space", Toast.LENGTH_SHORT).show();
                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.myDialog("Have Space",
                            "Please Fill All Blank");

                }






            }   // onClick
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}
