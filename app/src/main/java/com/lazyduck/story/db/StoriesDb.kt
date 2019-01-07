package com.lazyduck.story.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lazyduck.story.vo.Story

/**
 * @author datto
 */
@Database(
    entities = [Story::class], version = 3, exportSchema = false
)
abstract class StoriesDb : RoomDatabase() {
    abstract fun storyDao(): StoryDao
}