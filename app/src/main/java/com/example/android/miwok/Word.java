package com.example.android.miwok;

public class Word {

    private String mEnglishWord;
    private String mMiwokWord;

    public Word(String EnglishWord , String MiwokWord)
    {
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
    }

    public String getmMiwokWord()

    {
        return mMiwokWord;
    }

    public String getmEnglishWord()
    {
        return mEnglishWord;
    }



}