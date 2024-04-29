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
fun SgnBa() {
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
                    text = "Pisces",
                    fontSize = 40.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Pisces General Characteristics", fontSize = 30.sp,
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
                    "Pisces Woman General Characteristics\n" +
                            "Pisces woman attracts attention with her ambitious, ambitious, attractive, sympathetic and good-natured behaviour. Emotional and romantic. It has a homely and homebound structure. He feels peaceful and comfortable in his home.\n" +
                            "\n" +
                            "Pisces woman's intuition is strong. He loves everything beautiful and is very fond of his comfort. He wants to attract attention in society and is proud of himself. He is fine-spirited and fond of art.\n" +
                            "\n" +
                            "He has a jealous nature and wants to be the best in everything. He wants to achieve everything he wants and shows his best effort for this. It attracts attention with its cheerful and active behaviour in society. Clothes and clothing, cares about being well-groomed.\n" +
                            "\n" +
                            "Pisces woman draws a woman type admired for her attractive and pleasant temperament. It is beautiful and elegant. He cares about love and has deep emotional feelings. He always wants to reach his dream love. If he loves and believes that he is loved, he will be a loyal and passionate lover. love is everything for him.\n" +
                            "\n" +
                            "Pisces woman is very possessive and jealous of the man she loves and is prone to marriage. He is attached to his children and his wife.\n" +
                            "\n" +
                            "Balık Burcu Erkeği Genel Özellikleri\n" +
                            "\n" +
                            "Balık burcu erkeği nazik, uyumlu,iyimser ve hayalperest yapısıyla dikkati çeker. Umursamaz tavırları olaylardan fazla etkilenmemesine neden olur. Düzenden ve sorumluluk almaktan hoşlanmaz. Başına buyruk yaşamaktan keyif alır.\n" +
                            "\n" +
                            "Balık burcu erkeği iş konusunda pratikliği sayesinde başarılı olur. Art niyetli değildir. İnsanlara kolayca güvenir.\n" +
                            "\n" +
                            "Balık burcu erkeği hayranlık duyduğu kadınlara aşık olur .Duygusal ve anlayışlı bir yapısı vardır.Sevdiği kadını mutlu etmek için türlü romantizm oyunlarına baş vuracaktır. Sanatçı ruhludur ve güzelliğe çok önem verir.Aşk onun için çok önemlidir. Aradığı kişiyi bulduğuna inanırsa sadık bir eş olur, yoksa çeşitli maceralar peşinde koşmaya devam edecektir.\n" +
                            "\n" +
                            "Balık burcu erkeği kişiliğini ve derin duygularını anlayan biriyle evlenip ömrünün sonuna kadar mutlu olur. Eşine ve çocuklarına düşkün, sadık ve düşünceli olacaktır."
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
                    text =  "* Ruling Planet: Neptune\n" +
                            "* Element: Water\n" +
                            "* Attribute:  Variable\n"+
                            "* Lucky Numbers: 2, 6\n"+
                            "* Day: Friday\n"+
                            "* Lucky Stone: Akuamarin\n"+
                            "* Colour: Turquoise, lime green\n"+
                            "* Tarot card: Moon\n"+
                            "* Animal: Fishes \n"+
                            "* Plant: Fig and willow , water lily, fulia\n"+
                            "* Precious Stone: Pearl \n"+
                            "* Precious Mineral:  Platinum"


                )



            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
