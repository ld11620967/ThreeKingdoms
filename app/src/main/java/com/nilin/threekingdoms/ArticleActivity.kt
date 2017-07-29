package com.nilin.threekingdoms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_article.*
import java.io.InputStream


class ArticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
        val catalog=intent.getIntExtra("catalog",0)
        var txt: InputStream = resources.assets.open("sanguoyanyi$catalog.txt")
        val size = txt.available()
        val buffer = ByteArray(size)
        //  把内存从inputstream内读取到数组上
        txt.read(buffer)
        txt.close()
        val content = String(buffer)
        article_tv.text=content
    }

}
