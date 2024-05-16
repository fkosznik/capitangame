package com.example.capitangame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.capitangame.ui.theme.CapitangameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapitangameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()

                }
            }
        }
    }

    @Composable
    fun CaptainGame(){
        //val treasureFund= remember { mutableStateOf(0) }
        var treasureFund by remember { mutableStateOf(0) }
        val direction =  remember { mutableStateOf("North") }
        val stormOrTreasure = remember { mutableStateOf("") }

        Column {
            Text(text = "treasure fund: ${treasureFund}")
            Text(text = "current direction: ${direction.value}")
            Text(text = "${stormOrTreasure.value}")
            Button(onClick = { direction.value = "east"
                if (Random.nextBoolean()) {
                    treasureFund += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }

            })
            {
                Text("sail east")
                
            }
            Button(onClick = { direction.value = "north"
                if (Random.nextBoolean()) {
                    treasureFund += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }

            })
            {
                Text("sail north")

            }
            Button(onClick = { direction.value = "west"
                if (Random.nextBoolean()) {
                    treasureFund += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }

            })
            {
                Text("sail wast")

            }
            Button(onClick = { direction.value = "south"
                if (Random.nextBoolean()) {
                    treasureFund += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }

            })
            {
                Text("sail south")

            }

        }




    }





}

