package com.yikai.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yikai.player.R
import com.yikai.player.base.BaseActivity
import com.yikai.player.utils.ToolbarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(), ToolbarManager {
    override val toolbar: Toolbar by lazy {
       find<Toolbar>(R.id.toolbar)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {

        when(it.itemId) {
            R.id.tab1 -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.tab2 -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.tab3 -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.tab4 -> {
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                return@OnNavigationItemSelectedListener false
            }
        }
    }


    override fun getLayoutView(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolbar()
    }

}
