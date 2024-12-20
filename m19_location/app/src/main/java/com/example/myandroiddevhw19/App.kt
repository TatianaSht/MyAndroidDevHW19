package com.example.myandroiddevhw19

import android.app.Application
import androidx.room.Room
import com.example.myandroiddevhw19.data.db.AppDatabase
import com.example.myandroiddevhw19.data.db.MIGRATION_1_2
import com.yandex.mapkit.MapKitFactory
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()

        MapKitFactory.setApiKey("d566e6f6-c4dc-4a39-a641-0a7bca490858")

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "db"
        )
            .addMigrations(MIGRATION_1_2)
            .build()
    }
}