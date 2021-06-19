package com.shahidshakeel.nearbuyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.ghyeok.stickyswitch.widget.StickySwitch

class LoginActivity : AppCompatActivity(), StickySwitch.OnSelectedChangeListener,
    View.OnClickListener {
    private lateinit var stickySwitch: StickySwitch
    private lateinit var tvSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        stickySwitch = findViewById(R.id.sticky_switch)
        stickySwitch.onSelectedChangeListener = this
        tvSignUp = findViewById(R.id.tvSignUp)
        tvSignUp.setOnClickListener(this)
    }

    override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {
        println(direction.name + ", " + text)
    }

    override fun onClick(v: View?) {
        when (v) {
            tvSignUp -> startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}