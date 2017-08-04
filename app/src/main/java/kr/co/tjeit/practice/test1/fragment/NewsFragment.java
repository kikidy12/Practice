package kr.co.tjeit.practice.test1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import kr.co.tjeit.practice.R;
import kr.co.tjeit.practice.test1.adapters.NewsAdapter;
import kr.co.tjeit.practice.test1.datas.NewsData;

/**
 * Created by the on 2017-08-04.
 */

public class NewsFragment extends Fragment{

    private android.widget.ListView newsListView;
    private NewsAdapter newsAdapter;
    List<NewsData> newsDataList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news, container, false);
        this.newsListView = (ListView) v.findViewById(R.id.newsListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        newsDataList.clear();
        newsDataList.add(new NewsData("rk", Calendar.getInstance(), "dd", R.drawable.people));
        newsDataList.add(new NewsData("rk", Calendar.getInstance(), "dd", R.drawable.people));
        newsDataList.add(new NewsData("rk", Calendar.getInstance(), "dd", R.drawable.people));
        newsDataList.add(new NewsData("rk", Calendar.getInstance(), "dd", R.drawable.people));

        newsAdapter = new NewsAdapter(getActivity(), newsDataList);
        newsListView.setAdapter(newsAdapter);

    }
}
