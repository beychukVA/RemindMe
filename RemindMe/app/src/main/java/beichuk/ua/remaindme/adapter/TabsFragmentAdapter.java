package beichuk.ua.remaindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import beichuk.ua.remaindme.dto.RemindDTO;
import beichuk.ua.remaindme.fragment.AbstractTabFragment;
import beichuk.ua.remaindme.fragment.BirthdaysFragment;
import beichuk.ua.remaindme.fragment.HistoryFragment;
import beichuk.ua.remaindme.fragment.IdeasFragment;
import beichuk.ua.remaindme.fragment.TodoFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter
{
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;
    private List<RemindDTO> data;
    private HistoryFragment historyFragment;

    public TabsFragmentAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.context = context;
        this.data = new ArrayList<>();
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position)
    {
        return tabs.get(position);
    }

    @Override
    public int getCount()
    {
        return tabs.size();
    }

    private void initTabsMap(Context context)
    {
        tabs = new HashMap<>();
        historyFragment = HistoryFragment.getInstance(context, data);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    public void setData(List<RemindDTO> data)
    {
        this.data = data;
        historyFragment.refreshData(data);
    }
}
