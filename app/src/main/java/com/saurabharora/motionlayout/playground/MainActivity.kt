package com.saurabharora.motionlayout.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tvConstraintState ->
                startActivity(Intent(this, ConstraintStateRobinhood::class.java))
            R.id.tvSimpleMotion ->
                startActivity(Intent(this, BasicMotionActivity::class.java))
            R.id.tvTwoViews ->
                startActivity(Intent(this, TwoViewsMotionActivity::class.java))
            R.id.tvttributes ->
                startActivity(Intent(this, AttributeActivity::class.java))
            R.id.tvKeyFrame ->
                startActivity(Intent(this, KeyFrameActivity::class.java))
            R.id.tvIoExample ->
                startActivity(Intent(this, GoogleIOExampleActivity::class.java))
            R.id.tvCustom ->
                startActivity(Intent(this, CustomDrivenActivity::class.java))
            R.id.tvSun ->
                startActivity(Intent(this, SunConstraintSetActivity::class.java))
            R.id.tvViewPager ->
                startActivity(Intent(this, MotionViewPagerActivity::class.java))
            R.id.tvDialer ->
                startActivity(Intent(this, DialerActivity::class.java))
            R.id.tvCarousel ->
                startActivity(Intent(this, DribbleProfileActivity::class.java))
        }
    }
}
