package com.oxygenupdater.models

import android.os.Parcelable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import com.fasterxml.jackson.annotation.JsonIgnore
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
@Stable
data class InAppFaq(
    val id: Long,

    val title: String?,
    val body: String?,
    val important: Boolean = false,

    /** Either `category` or `item` */
    val type: String,
) : Parcelable {

    /** To preserve expand/collapse state in LazyColumn */
    @IgnoredOnParcel
    @JsonIgnore
    val expanded = mutableStateOf(false)
}
