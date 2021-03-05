package mx.gob.secogem.bdconrooms

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Planteles")
data class Plantel (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val descripcion : String,
    val ubicacion : String,
    val nombre_director : String,
    val telefono : String,
    val capacidad_alumnos : Int,
)