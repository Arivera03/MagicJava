package com.example.magicjava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    private ImageButton anadirVidaP1;
    private Button venenoMenosP2;
    private Button venenoMasP2;
    private ImageButton pasarVidaP2aP1;

    private FragmentFirstBinding binding;
    private int saludp1 = 20;
    private int venenop1 = 0;


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
        anadirVidaP1 = binding.AnadirVidaP1;

        quitarVidaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                String infovidap1[] = vidap1.getText().toString().split("/");
                int saludp1 = Integer.parseInt(infovidap1[0]);
                saludp1--;
                vidap1.setText(saludp1 + "/" + venenop1);
            }
        });

        quitarVidaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                String infovidap1[] = vidap1.getText().toString().split("/");
                int saludp1 = Integer.parseInt(infovidap1[0]);
                saludp1--;
                vidap1.setText(saludp1 + "/" + venenop1);
            }
        });

        quitarVidaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                String infovidap1[] = vidap1.getText().toString().split("/");
                int saludp1 = Integer.parseInt(infovidap1[0]);
                saludp1--;
                vidap1.setText(saludp1 + "/" + venenop1);
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

}