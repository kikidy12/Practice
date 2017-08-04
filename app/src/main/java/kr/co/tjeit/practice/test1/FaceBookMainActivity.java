package kr.co.tjeit.practice.test1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import kr.co.tjeit.practice.R;
import kr.co.tjeit.practice.test1.fragment.LockFragment;
import kr.co.tjeit.practice.test1.fragment.MessageFragment;
import kr.co.tjeit.practice.test1.fragment.NewsFragment;
import kr.co.tjeit.practice.test1.fragment.SeeMoreFragment;
import kr.co.tjeit.practice.test1.fragment.SetupFragment;

public class FaceBookMainActivity extends AppCompatActivity {

    private android.support.v4.view.ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book_main);
        this.mainViewPager = (ViewPager) findViewById(R.id.mainViewPager);

        mainViewPager.setAdapter(new FaceBookAdapter(getSupportFragmentManager()));

    }

    class FaceBookAdapter extends FragmentStatePagerAdapter{
        public FaceBookAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0 :
                    return new NewsFragment();
                case 1 :
                    return new SetupFragment();
                case 2 :
                    return new MessageFragment();
                case 3 :
                    return new LockFragment();
                case 4 :
                    return new SeeMoreFragment();
                default:
                    return null;
            }
        }
    }
}
