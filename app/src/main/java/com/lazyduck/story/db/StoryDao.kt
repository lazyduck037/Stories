package com.lazyduck.story.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lazyduck.story.vo.Story

/**
 * @author datto
 */
@Dao
interface StoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(story: Story)

    @Query("SELECT * FROM story WHERE id = :login")
    fun findByLogin(login: String): LiveData<Story>
}