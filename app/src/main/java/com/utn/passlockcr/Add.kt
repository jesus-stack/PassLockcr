package com.utn.passlockcr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.utn.passlockcr.ui.theme.PassLockcrTheme

class Add : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassLockcrTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Main()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main( modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(height = 330.dp))

        TextField(
            value ="" ,
            onValueChange = {},
            placeholder = { Text(text = stringResource(id = R.string.nombreAplicacion))}
            )
        Spacer(modifier = Modifier.height(height = 50.dp))
        TextField(
            value ="" ,
            onValueChange = {},
            placeholder = { Text(text = stringResource(id = R.string.usuario))}
        )
        Spacer(modifier = Modifier.height(height = 50.dp))
        TextField(
            value ="" ,
            onValueChange = {},
            placeholder = { Text(text = stringResource(id = R.string.contrasena))}
        )
        Spacer(modifier = Modifier.height(height = 130.dp))
        Button(onClick = { /*TODO*/ }) {
            Row {
                Icon(
                    Icons.Rounded.Add, contentDescription ="",
                    Modifier.height(height = 50.dp))
                Text(text = stringResource(id = R.string.title_activity_add),
                    fontSize = 30.sp)
            }
        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    PassLockcrTheme {
        Main()
    }
}