package com.example.shiva.miwok;



public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private final int NO_IMAGE_VALUE=-1;
    private int mImageResourceId=NO_IMAGE_VALUE;
    private int mAudioResourceId;
    public Word (String defaultTransition,String miwokTransition,int AudioResourceId) {
        mDefaultTranslation = defaultTransition;
        mMiwokTranslation = miwokTransition;
        mAudioResourceId=AudioResourceId;
    }


    public Word (String defaultTransition,String miwokTransition,int ImageResourceId,int AudioResourceId) {
        mDefaultTranslation = defaultTransition;
        mMiwokTranslation = miwokTransition;
        mImageResourceId = ImageResourceId;
        mAudioResourceId=AudioResourceId;

    }

    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    /**
     * Get the Android version number
     */
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public int getImageResourceID(){

        return mImageResourceId;
    }

    /**
     * Get the image resource ID
     */
    public boolean hasImage(){

        return mImageResourceId!=NO_IMAGE_VALUE;
    }
    public int getAudioResourceID(){

        return mAudioResourceId;
    }


}


