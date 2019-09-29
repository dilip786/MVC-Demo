package com.kotlin.mvc_demo.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.mvc_demo.R
import com.kotlin.mvc_demo.adapter.ImagesAdapter
import com.kotlin.mvc_demo.controller.ImageListPresenter
import com.kotlin.mvc_demo.model.ImageDO

class ImagesActivity : AppCompatActivity() {

    private var rvList: RecyclerView? = null;
    private var listAdapter: ImagesAdapter? = null;
    private var images: ArrayList<ImageDO> = ArrayList();
    private var presenter: ImageListPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MVC Demo"

        rvList = findViewById(R.id.rvList)
        rvList!!.layoutManager = GridLayoutManager(this, 2)
        rvList!!.addItemDecoration(GridItemDecoration(10,2))

        listAdapter = ImagesAdapter(this, images = images);
        rvList!!.adapter = listAdapter;

        presenter = ImageListPresenter(this, this)
        presenter!!.fetchImages()
    }

    companion object

    fun setValues(images: ArrayList<ImageDO>) {

        this.images.clear()
        this.images.addAll(images)
        listAdapter!!.notifyDataSetChanged()

    }

    private fun setError(errorMessage: String) {

        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
    }
}
