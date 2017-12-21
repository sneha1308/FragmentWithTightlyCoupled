package fragment.com.doublefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by smartron on 21/12/17.
 */

public class FragmentOne extends Fragment implements View.OnClickListener {
    public static final String TAG = "fragment one";
    Button button;
    EditText editText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        button = view.findViewById(R.id.click_btn);
        editText = view.findViewById(R.id.fragment_one_et);
        button.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        ((MainActivity) getActivity()).onOtherFragment(editText.getText().toString());
    }
}
