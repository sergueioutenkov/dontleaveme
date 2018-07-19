package com.serguei.dontleaveme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serguei.dontleaveme.ui.main.MainFragment

class DontLeaveMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dont_leave_me_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

}
