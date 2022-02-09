package wiki.scene.viewbinding.util

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import wiki.scene.viewbinding.util.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}