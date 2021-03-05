package mx.gob.secogem.bdconrooms

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Plantel::class],
    version = 1
)

abstract class PlantelesDB : RoomDatabase() {
    abstract fun plantelDao() : PlantelDao
}