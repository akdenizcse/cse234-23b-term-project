package com.sevval.myapplication.ui.theme

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScrollModifierNode
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RecıpKar() {
    LazyColumn( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .background(Purple80), contentPadding = PaddingValues(16.dp) ) {
        item{
            Box(
                modifier = Modifier
                    .background(PurpleGrey40)
                    .border(3.dp, Color.White)
                    .padding(20.dp)
                    .height(50.dp)
                    .width(330.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text = "Karnı Yarık",
                    fontSize = 40.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "History of the recipe", fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Serif
            )

            Box(
                modifier = Modifier
                    .border(3.dp, Color.White)
                    .background(PurpleGrey40)
                    .padding(20.dp)
                    .height(500.dp)
                    .width(400.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text =
                    "The most beautiful form of aubergine, the most loved of vegetables, is karnıyarık. Inseparable with rice, the minced meat in that thin line between karnıyarık and imambayıldı. An indispensable dish for main courses, karnıyarık is a dish that everyone loves. I tried to explain to you in my recipe that you can make the practical and delicious karnıyarık dish in the oven as well as frying it.\n" +
                            "If you are wondering how to make karnıyarık, which will suit your guests and your dinners the most, you can examine the recipe and watch the video. Don't forget to try this recipe, which we prefer the most with its practicality, and add it to your notebook. Bon appetit in advance to those who will try.\n" +
                            "\n"
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Ingredients", fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Serif
            )
            Box(
                modifier = Modifier
                    .border(3.dp, Color.White)
                    .background(PurpleGrey40)
                    .padding(20.dp)
                    .height(500.dp)
                    .width(400.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text =  "* 6 small aubergines (if large, you can cut in half)\n" +
                            "* 3 chilli peppers\n" +
                            "        "+
                            "For the minced meat mixture;\n"+"   "+
                            "* 2 medium sized onions\n"+
                              "* 2 tomatoes\n"+
                              "* 2 chilli peppers\n"+
                              "* 2 cloves of garlic\n"+
                              "* Oil, salt, black pepper, red pepper\n"+
                              "* 200 g minced meat\n"+
                              "* 1 tea glass of hot water\n"+"  "
                    +"For Sauce\n"+"      "+
                            "* 2 medium sized onions\n"+
                              "* 2 tomatoes\n"


                )



            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "How to Make Karnıyarık Recipe?", fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Serif
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .border(3.dp, Color.White)
                    .background(PurpleGrey40)
                    .padding(20.dp)
                    .height(800.dp)
                    .width(400.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text ="1-Peel the aubergines with stripes and soak them in salted water for half an hour to prevent oil absorption.\n"+
                            "2-After washing them thoroughly, drain the water with a towel and fry them in a little oil. Fry 3 chillies in oil.\n"+
                            "3-Then fry the chopped onions in the same pan, add the minced meat and fry for a while more, add the peppers and garlic and fry for 2 more minutes.\n"+
                            "4-Add 2 diced tomatoes, salt, spices and mix.\n"+
                            "5-Add a tea glass of water and boil for 5 minutes.\n"+
                            "6-Place the aubergines on the tray by cutting the middle of the aubergines and press the aubergines through these cuts to make room for the filling and fill the aubergines with the filling.\n"+
                            "7-Place the cherry tomatoes or 1 tomato cut in half on the aubergines you have filled, so that they are equal in size, and put one of the fried peppers on each aubergine.\n"+
                            "8-In a separate place, mash 1 spoon of tomato paste in 1 cup of hot water and pour it between the aubergines. Do not pour on the minced meat so that it does not come out.\n"+
                            "9-Daha sonra 170 derece de ısıttığınız fırına sürerek 20-25 dk pişirin. Dilerseniz bu işlemi pilav tenceresi gibi bir tencerede ocakta yapabilirsiniz. Aynı sürede tencerede de  pişecektir."
                )
            }

        }
    }
}
