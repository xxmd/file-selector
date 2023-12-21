package io.github.xxmd;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.github.xxmd.databinding.ActivityFileSelectorBinding;

public class FileSelectorActivity extends AppCompatActivity {
    private ActivityFileSelectorBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFileSelectorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }

    private void initView() {

    }
}
