package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This is where our code goes
        setContent {
            //code goes here
            UnitConverter()
        }
    }
}


//Composable's are simply put special functions
@Composable
fun UnitConverter() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        // All the UI element are stacked below eachother. So one on top of the other
        //Helper text (Place holder) for what user should enter == value
        //Enter Value is what the user gives you
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "Enter Value", onValueChange ={} )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Meters") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Feet") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Millimeters") /*TODO*/ }, onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Meters") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Feet") /*TODO*/ }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Millimeters") /*TODO*/ }, onClick = { /*TODO*/ })
                }
            }
//            val context = LocalContext.current
//            //All the UI elements will be next to each other
//            Button(onClick = { Toast.makeText(context, "Thanks for clicking", Toast.LENGTH_LONG).show() }) {
//                Text(text = "Click ME!")
//            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result:")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
        UnitConverter()
}