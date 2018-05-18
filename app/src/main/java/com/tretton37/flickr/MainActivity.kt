package com.tretton37.flickr

import android.os.Bundle

class MainActivity : BaseAppCompatActivity() {

    companion object {
        const val LOG_TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        createRecyclerView()
        loadNextPage()
        addRecyclerPositionListener()

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }


    private fun createRecyclerView() {
//        ToDo(2) create recyclerView Properties
        /**
         *  recycler view needs an adapter to show items
         *  layout manager to show items
         */

//        ToDo(9) start new activity on item click
    }

    private fun addRecyclerPositionListener() {
//        ToDo add PaginationScrollListener to recyclerView

    }

    private fun loadNextPage() {
//        ToDo(4) use rest api from application to get pictures

    }

}
