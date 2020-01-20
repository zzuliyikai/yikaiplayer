package com.yikai.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.yikai.player.R
import com.yikai.player.base.BaseActivity
import com.yikai.player.utils.ToolbarManager
import org.jetbrains.anko.find

class SettingActivity:BaseActivity(), ToolbarManager {
    override val toolbar: Toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }
    override fun getLayoutView(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
    }
}