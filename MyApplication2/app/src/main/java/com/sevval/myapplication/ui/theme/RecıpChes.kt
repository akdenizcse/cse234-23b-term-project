package com.sevval.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RecıpChes(){

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
                    text = "Cheese Cake",
                    fontSize = 40.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
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
                    text =  "* 700 grams of labneh cheese (500 grams is fine)\n" +
                            "* 1 water glass of granulated sugar\n" +
                            "* 3 eggs\n"+
                            "* 1 packet of cream (can be dry)\n"+
                            "* 1 packet of vanilla (you can also use 1 and a half)\n"+
                            "* 2 tablespoons starch\n"+
                            "* 1 tablespoon flour\n"+
                            "Base material;\n"+"   "+
                            "* 2 packets of biscuits (if you want a thinner base, use 1 and a half packets of biscuits)\n"+
                            "* 125 grams of butter\n"+
                            "Lemon sauce;\n"+"   "+
                            "* 2 lemons\n"+
                            "*2 eggs\n"+
                            "*2 teaspoons of wheat starch\n"+
                            "* 1 tea glass of granulated sugar\n"+
                            "*1 teaspoon vanillin\n"


                )



            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "How to Make Cheese CakeRecipe?", fontSize = 30.sp,
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
                    .height(1100.dp)
                    .width(400.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text ="1-Pass the biscuits through a food processor. Knead with melted butter. Cover the bottom of the clamped mould with greaseproof paper.\n"+
                            "2-Line the bottom and sides of the mould with aluminium foil. Now press the prepared biscuit mixture into the bottom of the mould and put it in the freezer until you prepare the cream.\n"+
                            "3-Preparation of the cream; Put the labneh and sugar in a large bowl and whisk until smooth.\n"+
                            "4-Add the cream, starch, flour and vanilla, mix again, do not dilute too much, stop whisking when they are homogenised.\n"+
                            "5-Add the eggs one by one and beat at low speed for a while each time. Pour this cream into the mould.\n"+
                            "6-Set the oven to 175°. Pour water into the baking tray and place it on the lowest part of the oven.  Put the oven wire in the centre. Bake for 40 to 60 minutes.\n"+
                            "7-Leave the oven door ajar for an hour, then take it out and leave it in the fridge for at least five hours when it reaches room temperature. Preheat the oven for five to ten minutes.\n"+
                            "8-Lemon sauce; Grate the lemons with the fine side of the grater. Add sugar and knead for five minutes.\n"+
                            "9-Squeeze the juice from the lemons and whisk until the sugar dissolves. When the sugar dissolves, strain it through a strainer.\n"+
                            "10-Put the strained water into the pot.\n"+
                            "11-Add the egg, starch and vanillin and whisk well.\n"+
                            "12-Then turn on the stove and stir continuously over medium heat until it reaches boiling point.\n"+
                            "13-After removing the chese cake from the mould and taking it to the serving plate, pour the sauce before it cools down so that you can shape it easily.\n   Enjoy your meal.\n"
                )
            }

        }
    }
}