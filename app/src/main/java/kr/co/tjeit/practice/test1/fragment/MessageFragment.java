package kr.co.tjeit.practice.test1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.practice.R;
import kr.co.tjeit.practice.test1.adapters.MessageAdapter;
import kr.co.tjeit.practice.test1.datas.MessageData;

/**
 * Created by the on 2017-08-04.
 */

public class MessageFragment extends Fragment {

    MessageAdapter messageAdapter;
    private android.widget.ListView messageListVeiw;
    List<MessageData> messageDatas = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_message, container, false);
        this.messageListVeiw = (ListView) v.findViewById(R.id.messageListVeiw);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        messageDatas.clear();
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());
        messageDatas.add(new MessageData());

        messageAdapter = new MessageAdapter(getActivity(), messageDatas);
        messageListVeiw.setAdapter(messageAdapter);
    }
}
