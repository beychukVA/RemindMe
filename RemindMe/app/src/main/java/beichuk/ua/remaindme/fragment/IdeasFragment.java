package beichuk.ua.remaindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import beychuk.ua.remindme.R;

public class IdeasFragment extends AbstractTabFragment
{
    private static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context)
    {
        context = context;
        Bundle bundle = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(bundle);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_example, container, false);
        return view;
    }

    public void setContext(Context context)
    {
        this.context = context;
    }
}
