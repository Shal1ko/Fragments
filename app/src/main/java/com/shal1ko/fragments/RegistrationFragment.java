package com.shal1ko.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegistrationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button registrationButton = view.findViewById(R.id.registrationButton);
        Button backButton = view.findViewById(R.id.backButton);

        EditText newUsername = view.findViewById(R.id.newUsername);
        EditText newPassword = view.findViewById(R.id.newPassword);

        registrationButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Deleting System32", Toast.LENGTH_LONG).show();
            Toast.makeText(getContext(), "System32 suscessfully deleted", Toast.LENGTH_SHORT).show();
        });

        backButton.setOnClickListener(v -> {
            ((MainActivity)getActivity()).back();
        });
    }
}
