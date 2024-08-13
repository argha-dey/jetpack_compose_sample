package com.example.myjetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              ScaffoldWithTopBarSample()
           // AppScreenView()
        }
    }
}




@Composable
fun AppScreenView(){

    Scaffold (
        topBar = {MyTopAppBar()},
        content = {
                paddingValues -> Surface {
            Modifier.padding(paddingValues)
            Column {
                UserName()

            }

        }


        },
        bottomBar = { BottomAppBar {

        }}

    )




}

@Composable
fun UserName(){

    TextField(value = "UserName", onValueChange ={} )
}








    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyTopAppBar() {
        TopAppBar(
            title = { Text(text = "Home") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "BackButton")
                }

            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = Color.White
            )


        )

    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ScaffoldWithTopBarSample() {
        Scaffold(
 
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Top App Bar")
                    },


                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.ArrowBack, "backIcon", tint =  Color.White,)
                        }
                    },


                    colors = TopAppBarDefaults.mediumTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        titleContentColor = Color.White,
                    ),


                    actions = {
                        IconButton(onClick = {  }) {
                            Icon(Icons.Filled.AccountCircle ,
                                contentDescription ="Account",
                                tint =  Color.White,
                            )
                        }
                        IconButton(onClick = {  }) {
                            Icon(Icons.Filled.Search ,
                                contentDescription ="Search",
                                tint =  Color.White,
                            )
                        }

                        IconButton(onClick = {  }) {
                            Icon(Icons.Filled.Notifications ,
                                contentDescription ="Notification",
                                tint =  Color.White,
                            )
                        }

                    }
                )
            },

            content = {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .background(Color(0xFFFFFFFF)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Content of the page",
                        fontSize = 30.sp,
                        color = Color.Black
                    )
                }
            },

        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
         ScaffoldWithTopBarSample()
       // AppScreenView()
    }


