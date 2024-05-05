package com.sevval.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
fun SgnYe(){

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
                    text = "Cancer ",
                    fontSize = 40.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Cancer General Characteristics ", fontSize =30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Serif
            )

            Box(
                modifier = Modifier
                    .border(3.dp, Color.White)
                    .background(PurpleGrey40)
                    .padding(20.dp)
                    .height(1500.dp)
                    .width(400.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(
                    text =
                    " Cancer Woman General Characteristics\n" +
                            "\n" +
                            "Cancer woman has a pleasant temperament. She is homely, warm-blooded, honest and well-intentioned. It is also possible to say that she is fond of romance and adventure. Cancer woman is especially attached to her home, family, habits and traditions. In general, it draws a maternal portrait, loves the home environment and everything about the home.\n" +
                            "\n" +
                            "She is very sensitive emotionally and her intuition is strong. She can easily recognise the intentions of those around her. Cancer woman can be very easily broken and hurt. She always looks for goodwill and compassion in the people around her.\n" +
                            "\n" +
                            "Cancer woman is generous, but not wasteful. She loves to save and save a lot. She wants to be financially strong to feel safe. Cancer has deep feelings and thoughts. He absolutely does not like to talk about himself, but he enjoys having an opinion on issues related to others.\n" +
                            "\n" +
                            "Cancer woman does not like to be criticised and has difficulty accepting her negative aspects. He is extremely loyal to his partner in bilateral relationships, but he is also jealous, but the main thing for him is love.\n" +
                            "Cancer Man General Characteristics\n" +
                            "\n" +
                            "Cancer man draws attention with his kind, honest, dignified and proud structure. His emotional structure is quite sensitive. Love and respect are indispensable cornerstones for him. He values the people around him and tries to help them. Instead of trying to take advantage of their weaknesses, he tries to support them.\n" +
                            "\n" +
                            "Cancer man has a sharp and practical intelligence. His ability to analyse is highly developed, he can easily analyse events, he loves everything about water, he is good with alcohol. In addition, due to its highly emotional structure, it loves when it loves and does not give up easily. He is extremely loyal to his partners in their relationships.\n" +
                            "\n" +
                            "Cancer men attach great importance to money, but this is due to the fact that he wants to feel financially secure and to be cautious in case his relatives fall into a difficult situation.\n" +
                            "\n",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Horoscope Characteristics", fontSize = 30.sp,
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
                    text =  "* Ruling Planet:Moon\n" +
                            "* Element: Water\n" +
                            "* Attribute:  Pioneer\n"+
                            "* Lucky Numbers: 3,7\n"+
                            "* Day: Monday\n"+
                            "* Lucky Stone: Pearl\n"+
                            "* Colour: White, teal, silver\n"+
                            "* Tarot card: Moon\n"+
                            "* Animal: Shellfish \n"+
                            "* Plant: Hezaren flower, water lily, kenger grass\n"+
                            "* Precious Stone: Moonstone, amber, \n"+
                            "* Precious Mineral:  Silver",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}





