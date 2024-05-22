@file:Suppress("UNREACHABLE_CODE")
@file:OptIn(DelicateCoroutinesApi::class)

package com.sevval.myapplication.ui.theme

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sevval.myapplication.network.Horoscope
import com.sevval.myapplication.network.RetrofitInstance
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okio.IOException
import retrofit2.HttpException


@OptIn(DelicateCoroutinesApi::class)
@SuppressLint("CoroutineCreationDuringComposition", "StaticFieldLeak")
private var fact = mutableStateOf(Horoscope())
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SgnYe() {


        val context = LocalContext.current.applicationContext
        GlobalScope.launch(Dispatchers.IO) {


            val response = try {
                RetrofitInstance.api.getData()
            } catch (e: HttpException) {
                Toast.makeText(context, "http error: ${e.message}", Toast.LENGTH_SHORT)
                    .show()
                return@launch
            } catch (e: IOException) {
                Toast.makeText(context, "app error: ${e.message}", Toast.LENGTH_SHORT)
                    .show()
                return@launch
            }
            if (response.isSuccessful && response.body() != null) {
                withContext(Dispatchers.Main) {
                    fact.value = response.body()!!

                }
            }
        }
        MyUi(fact = fact)
    }

    @Composable
    fun MyUi(fact: MutableState<Horoscope>, modifier: Modifier = Modifier) {
        Column(
            modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Horoscope:", modifier.padding(bottom = 25.dp), fontSize = 26.sp)
            Text(
                text = fact.value.horoscopeText, fontSize = 26.sp,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center
            )
        }
    }






