package kr.co.tjeit.practice.test1.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.practice.R;
import kr.co.tjeit.practice.test1.datas.NewsData;

/**
 * Created by the on 2017-08-04.
 */

public class NewsAdapter extends ArrayAdapter<NewsData> {

    Context mContext;
    List<NewsData> mList = new ArrayList<>();
    LayoutInflater inf;

    public NewsAdapter(Context context, List<NewsData> lsit) {
        super(context, R.layout.news_list_item, lsit);
        mContext = context;
        mList = lsit;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if(row == null) {
            row = inf.inflate(R.layout.news_list_item, null);
        }

        return row;
    }
}
