package kr.co.woobi.imyeon.fragmentexamintextbook;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ColorFragment extends Fragment {
    private int mColor = Color.BLUE;
    private TextView mTextViewHello;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_color,container, false);
        mTextViewHello=view.findViewById(R.id.text_hello);
        mTextViewHello.setBackgroundColor(mColor);
        return view;
    }

    public static ColorFragment newInstance(){
        ColorFragment colorFragment=new ColorFragment();
        return  colorFragment;
    }

    public  void setColor(int color){
        mColor=color;
        if(mTextViewHello!=null){

            mTextViewHello.setBackgroundColor(color);
        }
    }
}
