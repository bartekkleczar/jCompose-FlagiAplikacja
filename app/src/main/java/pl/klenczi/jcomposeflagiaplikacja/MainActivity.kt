package pl.klenczi.jcomposeflagiaplikacja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimateVisibility(countriesList, setOf("white", "red", "yellow", "blue", "black"))
        }
    }
}

@Composable
fun AnimateVisibility(countries: List<Panstwo>, propertiesInput: Set<String>) {
    val animationDuration = 500
    val filterString = "Filter"
    val wynikiString = "Wyniki"
    var properties by remember {
        mutableStateOf(propertiesInput)
    }
    val propertiesSelected = remember {
        mutableStateListOf<String>()
    }
    var visible by remember {
        mutableStateOf(true)
    }
    var buttonText by remember {
        mutableStateOf("Filter")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        AnimatedVisibility( //filter
            visible = visible,
            enter = fadeIn(animationSpec = tween(animationDuration)) +
                    expandVertically(animationSpec = tween(animationDuration)),
            exit = fadeOut(animationSpec = tween(animationDuration + 200)) +
                    shrinkVertically(animationSpec = tween(animationDuration + 200))
        ) {
            buttonText = wynikiString
            Card(modifier = Modifier
                .fillMaxWidth(0.85f)
                .fillMaxHeight(0.85f)
            ) {
                Column {
                    properties.forEach { property ->
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(0.5f)
                        ) {
                            val checkedState = remember { mutableStateOf(false) }

                            Checkbox(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                modifier = Modifier.padding(end = 8.dp),
                            )
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 15.dp),
                                text = property,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                            )

                            LaunchedEffect(checkedState.value) {
                                if (checkedState.value) {
                                    propertiesSelected.add(property)
                                } else {
                                    propertiesSelected.remove(property)
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Column {
                    setOf<String>("horizontal", "vertical", "cross", "other").forEach { property ->
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(0.5f)
                        ) {
                            val checkedState = remember { mutableStateOf(false) }

                            Checkbox(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                modifier = Modifier.padding(end = 8.dp),
                            )
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 15.dp),
                                text = property,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                            )

                            LaunchedEffect(checkedState.value) {
                                if (checkedState.value) {
                                    propertiesSelected.add(property)
                                } else {
                                    propertiesSelected.remove(property)
                                }
                            }
                        }
                    }
                }
            }
        }
        AnimatedVisibility( //wyniki
            enter = fadeIn(animationSpec = tween(animationDuration + 200)) +
                    expandVertically(animationSpec = tween(animationDuration + 200)),
            exit = fadeOut(animationSpec = tween(animationDuration)) +
                    shrinkVertically(animationSpec = tween(animationDuration)),
            visible = !visible
        ) {
            buttonText = filterString
            Card(
                modifier = Modifier
                    .background(Color(0xf5f5f5f5))
                    .fillMaxWidth(0.95f)
                    .fillMaxHeight(0.9f)
                ) {
                LazyColumn {
                    var filterList = mutableSetOf<String>()
                    for (i in propertiesSelected) {
                        filterList.add(i)
                    }
                    itemsIndexed(
                        filter(countriesList, filterList)
                    ) { index, country ->
                        Row(
                            modifier = Modifier.height(100.dp)
                        ) {
                            Image(
                                painter = painterResource(country.image),
                                contentDescription = country.name,
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(100.dp)
                                    .padding(start = 15.dp)
                            )
                            Text(
                                text = country.name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 28.dp)
                            )
                        }
                    }
                }
            }
        }
    }
    Button(
        onClick = {
            visible = !visible
            propertiesSelected.forEach { country ->
                println("Wybrany kraj: $country")
            }
        },
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(buttonText, textAlign = TextAlign.Center)
    }
}