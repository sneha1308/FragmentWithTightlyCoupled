package fragment.com.doublefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by smartron on 21/12/17.
 */

public class FragmentTwo extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two, container, false);
        textView=view.findViewById(R.id.fragment_two_tv);
        return view;
    }

    public void message(String s) {

        textView.setText(s);



    }
}
