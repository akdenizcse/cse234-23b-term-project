package com.sevval.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Serif
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sevval.myapplication.network.HoroscopeCharacteristics
import com.sevval.myapplication.network.Modelview
import com.sevval.myapplication.ui.theme.About
import com.sevval.myapplication.ui.theme.Black
import com.sevval.myapplication.ui.theme.Blog
import com.sevval.myapplication.ui.theme.MyApplicationTheme
import com.sevval.myapplication.ui.theme.Pink40
import com.sevval.myapplication.ui.theme.Profile
import com.sevval.myapplication.ui.theme.Purple40
import com.sevval.myapplication.ui.theme.Purple80
import com.sevval.myapplication.ui.theme.Screen
import com.sevval.myapplication.ui.theme.SgnAr
import com.sevval.myapplication.ui.theme.SgnBa
import com.sevval.myapplication.ui.theme.SgnOg
import com.sevval.myapplication.ui.theme.SgnYe
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    val vmodel: Modelview by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()

                    vmodel.getHoroscopeFromAPI("gemini")
                    vmodel.response.observe(this) {
                        it.horoscope
                        Log.d("hatamMAi", it.toString() + "dsa")

                    }
                }
            }
        }
    }


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Navigation() {
        val uriHandler = LocalUriHandler.current
        val navControl = rememberNavController()
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val coroutineScope = rememberCoroutineScope()
        val context = LocalContext.current.applicationContext

        ModalNavigationDrawer(
            drawerState = drawerState,
            gesturesEnabled = true,
            drawerContent = {
                ModalDrawerSheet {
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .height(150.dp)
                    ) {
                        Text(text = "Menu")
                    }
                    Divider()
                    NavigationDrawerItem(label = { Text(text = "Home", color = Pink40) },
                        selected = false,
                        onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navControl.navigate(Screen.HomeScreen.route) {
                                popUpTo(0)
                            }
                        })
                    NavigationDrawerItem(label = { Text(text = "About", color = Pink40) },
                        selected = false,
                        onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navControl.navigate(Screen.About.route)
                        })
                    NavigationDrawerItem(label = { Text(text = "Blog", color = Pink40) },
                        selected = false,
                        onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navControl.navigate(Screen.Blog.route)
                        })
                    NavigationDrawerItem(label = { Text(text = "Profile", color = Pink40) },
                        selected = false,
                        onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navControl.navigate(Screen.Profile.route)
                        })
                    NavigationDrawerItem(label = { Text(text = "logout", color = Pink40) },
                        selected = false,
                        onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            Toast.makeText(context, "logout", Toast.LENGTH_SHORT).show()
                        })
                }
            },
        ) {
            Scaffold(
                topBar = {
                    val coroutineScope = rememberCoroutineScope()
                    TopAppBar(title = { Text(text = "") },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Pink40,
                            titleContentColor = Color.White,
                            navigationIconContentColor = Color.White
                        ),
                        navigationIcon = {
                            IconButton(onClick = {
                                coroutineScope.launch {
                                    drawerState.open()
                                }
                            }) {
                                Icon(
                                    Icons.Rounded.Menu, contentDescription = "menuButton"
                                )
                            }
                        })
                }
            ) {
                NavHost(navController = navControl, startDestination = "Log ın") {
                    composable(route = "Log ın") { Logın(navControl) }
                    composable(Screen.Profile.route) { Profile() }
                    composable(Screen.About.route) { About() }
                    composable(Screen.Blog.route) { Blog() }
                    composable(Screen.HomeScreen.route) { HomeScreen(navControl) }
                    composable(route = "SgnBa") {
                        var character = HoroscopeCharacteristics(
                            "Nept",
                            "sada",
                            "Variable",
                            "2, 6",
                            "Friday",
                            "Akuamarin",
                            "Turquoise, lime green",
                            " Moon",
                            "Fishes",
                            "Fig and willow , water lily, fulia",
                            "Pearl",
                            "Platinum"
                        )

                        SgnBa("pisces", character)
                    }
                    composable(route = "SgnOg") {
                        var character = HoroscopeCharacteristics(
                            "Saturn",
                            "Soil",
                            " Pioneer",
                            "2, 8",
                            "Saturday",
                            "Grena",
                            "Dark green, brown",
                            "The Devil",
                            "Goats and other horned animals",
                            "Carnation, ivy, pine, poplar, elm",
                            "Black diamond, amber",
                            "Lead"
                        )
                        SgnBa("capricorn", character)
                    }
                    composable(route = "SgnAr") {
                        var character = HoroscopeCharacteristics(
                            "Mars",
                            "Fire",
                            " Pioneer",
                            "1,9",
                            "Tuesday",
                            "Ruby",
                            "Red",
                            "Moon",
                            "Sheep",
                            "Geranium, Honeysuckle, Pars Lily",
                            "Diamond",
                            "Iron"
                        )

                        SgnBa("aries", character)
                    }
                    composable(route = "SgnYe") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("cancer", character)

                    }
                    composable(route = "SgnAqua") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("aquarius", character)

                    }
                    composable(route = "SgnLeo") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("leo", character)

                    }
                    composable(route = "SgnGemini") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("gemini", character)

                    }
                    composable(route = "SgnSagtt") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("sagittarius", character)

                    }
                    composable(route = "SgnScorp") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("scorpio", character)

                    }
                    composable(route = "SgnTaurus") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("taurus", character)

                    }
                    composable(route = "SgnVrgo") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("virgo", character)

                    }
                    composable(route = "SgnLbra") {
                        var character = HoroscopeCharacteristics(
                            "Moon",
                            "Water",
                            "Pioneer",
                            "3,7",
                            "Monday",
                            "Pearl",
                            "White, teal, silver",
                            " Moon",
                            "Shellfish",
                            "Hezaren flower, water lily, kenger grass",
                            " Moonstone, amber,",
                            "Silver"
                        )

                        SgnBa("libra", character)

                    }
                    composable(route = "Sıgn up") {
                        Sıgnup(navControl)
                    }

                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationTheme {

        }
    }
}