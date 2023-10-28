package com.utn.passlockcr

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.utn.passlockcr.ui.theme.PassLockcrTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

class Signin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassLockcrTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SingIn()
                }
            }
        }
    }
}

@Composable
fun SingIn() {
    var usuario by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.sign_in),
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            label = R.string.usuario,
            leadingIcon = R.drawable.account_circle_24px,
            value = usuario,
            onValueChange = { usuario = it },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Ascii,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth())
        EditNumberField(
            label = R.string.contrasena,
            leadingIcon = R.drawable.key_24px,
            value = contrasena,
            onValueChange = { contrasena = it },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Ascii,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth()
        )
}
}


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun EditNumberField(modifier: Modifier = Modifier, @StringRes label: Int,
                        @DrawableRes leadingIcon: Int,
                        value: String, keyboardOptions: KeyboardOptions,
                        onValueChange: (String) -> Unit){

        TextField(
            value = value,
            //leadingIcon = { Icon(painter = painterResource(id = leadingIcon), null) },
            onValueChange = onValueChange,
            modifier = modifier,
            label = { Text(stringResource(label)) },
            singleLine = true,
            keyboardOptions = keyboardOptions
        )
    }

@Preview(showBackground = true)
@Composable
fun SingInPreview3() {
    PassLockcrTheme {
        SingIn()
    }
}