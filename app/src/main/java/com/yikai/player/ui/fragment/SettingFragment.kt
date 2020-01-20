package com.yikai.player.ui.fragment

import android.view.LayoutInflater
import android.view.View
import com.yikai.player.R
import com.yikai.player.base.BaseFragment

class SettingFragment : BaseFragment() {

    override fun initView(): View? {
        return LayoutInflater.from(activity).inflate(R.layout.setting_fragment, null)
    }

}