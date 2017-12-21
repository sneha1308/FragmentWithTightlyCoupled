package fragment.com.doublefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_one_fl, fragmentOne, "fragment one");
        fragmentTransaction.add(R.id.fragment_two_fl, fragmentTwo, "fragment two");
        fragmentTransaction.commit();
    }

    public void onOtherFragment(String s){
       FragmentTwo fragmentTwo= (FragmentTwo) getFragmentManager().findFragmentByTag("fragment two");
       fragmentTwo.message(s);
    }
}

