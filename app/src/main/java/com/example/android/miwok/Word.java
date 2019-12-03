package com.example.android.miwok;

import android.widget.ImageView;

public class Word {

    private String mEnglishWord;
    private String mMiwokWord;
    private int mImageres=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String EnglishWord, String MiwokWord) {
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
    }

    public Word(String EnglishWord, String MiwokWord , int imageres) {
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
        mImageres = imageres;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }

    public int getmIageres(){ return mImageres;}

    public boolean imagepresent()
    {
        if(mImageres!=NO_IMAGE_PROVIDED)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}