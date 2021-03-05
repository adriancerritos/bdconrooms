package mx.gob.secogem.bdconrooms

import android.app.Application
import androidx.room.Room

class PlantelApp:Application() {
    val room = Room.databaseBuilder(this, PlantelesDB::class.java,"plantel")
        .build()
}