package beichuk.ua.remaindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import beychuk.ua.remindme.R;

public class ExampleFragment extends Fragment
{
    private static final int LAYOUT = R.layout.fragment_example;
    private View view;

    public static ExampleFragment getInstance()
    {
        Bundle bundle = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_example, container, false);
        return view;
    }
}
