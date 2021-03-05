package mx.gob.secogem.bdconrooms

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PlantelDao {
    @Query("SELECT * FROM Planteles")
    fun getAll(): LiveData<List<Plantel>>

    @Query("SELECT * FROM Planteles WHERE id = :id")
    suspend fun getById(id : Int) : Plantel

    @Update
    suspend fun update(plantel : Plantel)

    @Insert
    suspend fun insert(planteles : List<Plantel>)

    @Delete
    suspend fun delete(plantel : Plantel)

}