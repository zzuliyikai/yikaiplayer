package com.yikai.player.utils

import android.content.Intent
import androidx.appcompat.widget.Toolbar
import com.yikai.player.R
import com.yikai.player.ui.activity.SettingActivity

interface ToolbarManager {

    val toolbar:Toolbar

    fun initMainToolbar(){
        toolbar.title = toolbar.context.getString(R.string.app_name)
        toolbar.inflateMenu(R.menu.main)

        toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.setting -> {

                    toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))

                }
            }
            return@setOnMenuItemClickListener true
        }



    }






}