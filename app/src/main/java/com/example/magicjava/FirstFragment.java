package com.example.magicjava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.magicjava.databinding.FragmentFirstBinding;

import java.util.concurrent.atomic.AtomicInteger;

public class FirstFragment extends Fragment {
    private TextView vidap1;
    private ImageButton quitarVidaP1;

    private FragmentFirstBinding binding;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vidap1 = binding.VidaP1;
        quitarVidaP1 = binding.QuitarVidaP1;
        String infovidap1[] = vidap1.toString().split("/");
        AtomicInteger saludp1 = new AtomicInteger(Integer.parseInt(infovidap1[0]));
        AtomicInteger venenop1 = new AtomicInteger(Integer.parseInt(infovidap1[1]));

        quitarVidaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {

            }
        });


        binding.VenenoMasP1.setOnClickListener(v ->
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public static void sumar(){

    }

}