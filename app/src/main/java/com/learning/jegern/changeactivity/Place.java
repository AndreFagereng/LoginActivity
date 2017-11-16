package com.learning.jegern.changeactivity;

/**
 * Created by Jegern on 08.11.2017.
 */

public class Place {

     String  mNameOfPlace;
     String nNameOfImage;
     String mPopup;
     int mZipCode;

    public Place(String mNameOfPlace, int mZipCode, String nNameOfImage, String mPopup) {
        this.mNameOfPlace = mNameOfPlace;
        this.nNameOfImage = nNameOfImage;
        this.mPopup = mPopup;
        this.mZipCode = mZipCode;
    }
}
