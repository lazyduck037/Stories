package com.lazyduck.story.vo

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

/**
 * @author datto
 */
@Entity(primaryKeys = ["id"])
data class Story (
    @field:SerializedName("id")
    val id: Long,
    @field:SerializedName("image")
    val image: String?,
    @field:SerializedName("name")
    val name: String?,
    @field:SerializedName("description")
    val description: String?
)