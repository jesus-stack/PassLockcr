@file:OptIn(ExperimentalMaterial3Api::class)

package com.utn.passlockcr

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.utn.passlockcr.ui.theme.navigation.PassLockNavHost


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PasslockApp(navController: NavHostController = rememberNavController()) {
    PassLockNavHost(navController = navController)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PassLockTopAppBar(
    title: String,
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        modifier = modifier,
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    //Icon(
                      //  imageVector = Icons.Filled.ArrowBack,
                      //  contentDescription = R.string.back_button
                    //)
                }
            }
        }
    )
}