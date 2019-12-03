package com.example.android.miwok;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);
        //Finding the text view for english word
        TextView english_word  = (TextView) listItemView.findViewById(R.id.english_word);
        //get english word from word object and set this text to english_word textview
        english_word.setText(word.getmEnglishWord());

        //Finding text view for miwok word
        TextView miwok_word = (TextView) listItemView.findViewById(R.id.miwok_word);

        //get miwok word from word object and set this text to miwok_word textview
        miwok_word.setText(word.getmMiwokWord());


                //finding imageview
                ImageView image = (ImageView) listItemView.findViewById(R.id.imageview);
                if(word.imagepresent()) {
                    //getting image from word object and setting this to imageres
                    image.setImageResource(word.getmIageres());
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.GONE);
                }
        return listItemView;



    }
}
