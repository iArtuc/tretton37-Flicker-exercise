package com.tretton37.flickr

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tretton37.flickr.model.PhotoItem

class PhotoDetailActivity : AppCompatActivity() {

    companion object {
        const val PHOTO_ITEM = "PHOTO_ITEM"

        fun newIntent(context: Context,
                      photoItem: PhotoItem): Intent {
            val intent = Intent(context, PhotoDetailActivity::class.java)
            intent.putExtra(PHOTO_ITEM, photoItem)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_detail)

        //ToDo(11) get data from intent

        //ToDo(12) show image using glide and data you got from intent
    }


}



