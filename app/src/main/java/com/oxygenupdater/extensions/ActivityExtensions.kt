@file:Suppress("NOTHING_TO_INLINE")

package com.oxygenupdater.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.annotation.IntRange
import com.oxygenupdater.compose.activities.MainActivity
import com.oxygenupdater.compose.activities.MainActivity.Companion.PAGE_SETTINGS
import com.oxygenupdater.compose.activities.MainActivity.Companion.PAGE_UPDATE
import com.oxygenupdater.compose.activities.NewsItemActivity
import com.oxygenupdater.compose.activities.OnboardingActivity

inline fun <reified T : Activity> Context.startActivity() = startActivity(
    Intent(this, T::class.java)
)

inline fun Activity.startOnboardingActivity(
    @IntRange(PAGE_UPDATE.toLong(), PAGE_SETTINGS.toLong()) startPage: Int,
) = startActivity(
    Intent(this, OnboardingActivity::class.java).putExtra(
        MainActivity.INTENT_START_PAGE, startPage
    )
)

inline fun Activity.startMainActivity(
    @IntRange(PAGE_UPDATE.toLong(), PAGE_SETTINGS.toLong()) startPage: Int,
) = startActivity(
    Intent(this, MainActivity::class.java).putExtra(
        MainActivity.INTENT_START_PAGE, startPage
    )
)

inline fun Activity.startNewsItemActivity(id: Long) = startActivity(
    Intent(this, NewsItemActivity::class.java).putExtra(
        NewsItemActivity.INTENT_NEWS_ITEM_ID, id
    )
)
