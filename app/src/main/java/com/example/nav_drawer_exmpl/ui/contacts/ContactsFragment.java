package com.example.nav_drawer_exmpl.ui.contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nav_drawer_exmpl.NextActivity;
import com.example.nav_drawer_exmpl.R;
import com.example.nav_drawer_exmpl.databinding.FragmentContactsBinding;


import com.example.nav_drawer_exmpl.databinding.FragmentGalleryBinding;
import com.example.nav_drawer_exmpl.ui.gallery.GalleryViewModel;

public class ContactsFragment extends Fragment {

    private ContactsViewModel contactsViewModel;
    private FragmentContactsBinding binding;

    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContactsViewModel contactsViewModel =
                new ViewModelProvider(this).get(ContactsViewModel.class);

        binding = FragmentContactsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContacts;
        contactsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    /*public void onStart()
    {
        super.onStart();
        Button btn = (Button) context.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, NextActivity.class);
                startActivity(intent);
            }
        });*/
    }