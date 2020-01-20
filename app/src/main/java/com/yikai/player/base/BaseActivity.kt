package com.yikai.player.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yikai.player.utils.ToolbarManager
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity


abstract class BaseActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutView())
        initListener()
        initData()
    }

    open protected fun initData() {

    }

    open protected fun initListener() {

    }

    abstract fun getLayoutView(): Int


    protected inline fun <reified T : BaseActivity> statActivityAndFinish() {
        startActivity<T>()
        finish()
    }

}