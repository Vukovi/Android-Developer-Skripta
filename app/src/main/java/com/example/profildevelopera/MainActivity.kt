package com.example.profildevelopera

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        // ovde pravim zarubljeni view
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.sparrowlogoempty)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 15f
        logoImg.setImageDrawable(rounded)
    }

    //    @Override
//    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
//        super.onSizeChanged(width, height, oldWidth, oldHeight);
//
//        float cornerRadius = <whatever_you_want>;
//        this.path = new Path();
//        this.path.addRoundRect(new RectF(0, 0, width, height), cornerRadius, cornerRadius, Path.Direction.CW);
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
