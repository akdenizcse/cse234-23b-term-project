LazyColumn( horizontalAlignment = Alignment.CenterHorizontally,
verticalArrangement = Arrangement.Top,
modifier = Modifier
.fillMaxWidth()
.background(Purple80), contentPadding = PaddingValues(16.dp) ) {
    item {
        Spacer(modifier = Modifier.height(39.dp))
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
                text = "About ",
                fontSize = 40.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif
            )
        }
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
                text = "Welcome to ZodiacFin, your go-to resource for all things astrology. Our mission is to provide information and advice to help you discover your zodiac sign and gain a deeper understanding of its unique characteristics and traits. \n" +
                        "Whether you're a seasoned astrology enthusiast or a newcomer to the field, our blog has something for everyone. Our experienced team of astrologers is dedicated to sharing their knowledge and insights with you, providing detailed horoscopes, compatibility guides, and much more.\n" +
                        " Join our community today and start exploring the fascinating world of astrology!",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}

