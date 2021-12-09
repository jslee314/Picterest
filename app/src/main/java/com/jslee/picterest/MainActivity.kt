package com.jslee.picterest

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jslee.picterest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(android.R.style.Theme)

        val selectedTheme = "Capricorn"
        when(selectedTheme) {
            "Capricorn" -> setTheme(R.style.Theme_Capricorn)
            "Aquarius" -> setTheme(R.style.Theme_Aquarius)
            "Pisces" -> setTheme(R.style.Theme_Pisces)
            else -> setTheme(R.style.Theme_Aries)
        }


        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)




        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}