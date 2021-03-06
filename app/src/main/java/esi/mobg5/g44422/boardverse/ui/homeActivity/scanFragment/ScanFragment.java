package esi.mobg5.g44422.boardverse.ui.homeActivity.scanFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class ScanFragment extends Fragment {

    private ScanFragmentViewModel scanFragmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        scanFragmentViewModel = ViewModelProviders.of(this).get(ScanFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scan, container, false);
        final TextView textView = root.findViewById(R.id.text_scan);
        scanFragmentViewModel.getText().observe(this, s -> textView.setText(s));
        return root;
    }
}