package mx.gob.secogem.bdconrooms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val app = applicationContext as PlantelApp

        lifecycleScope.launch{
            val planteles = app.room.plantelDao().getAll()
            Log.d("TAG","onCreate: 8 planteles")
        }

    }
}