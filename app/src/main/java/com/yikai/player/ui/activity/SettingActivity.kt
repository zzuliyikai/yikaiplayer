package com.yikai.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yikai.player.R
import com.yikai.player.base.BaseActivity
import com.yikai.player.ui.fragment.SettingFragment
import com.yikai.player.utils.ToolbarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(), ToolbarManager {
    override val toolbar: Toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    private val mSettingFragment: SettingFragment by lazy {
        SettingFragment()
    }

    override fun getLayoutView(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_content,mSettingFragment)
        transaction.commit()


    }
}