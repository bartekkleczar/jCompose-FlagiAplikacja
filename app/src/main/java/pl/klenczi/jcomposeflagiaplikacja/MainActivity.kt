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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AnimateVisibility(countriesList, setOf("white", "red", "yellow", "blue"))
        }
    }
}

@Composable
fun AnimateVisibility(countries: List<Panstwo>, propertiesInput: Set<String>) {
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
    var buttonText by remember{
        mutableStateOf("Filter")
    }
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        AnimatedVisibility( //filter
            visible = visible,
            enter = fadeIn(animationSpec = tween(700)) +
                    expandVertically (animationSpec = tween(700)),
            exit = fadeOut(animationSpec = tween(700)) +
                    shrinkVertically (animationSpec = tween(700))
        ) {
            buttonText = wynikiString
            Card() {
                Column {
                    properties.forEach { property ->
                        Row(modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(0.5f)
                        ) {
                            val checkedState = remember { mutableStateOf(false) }

                            Checkbox(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                modifier = Modifier.padding(end = 8.dp),
                            )
                            Text(text = property)

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
            enter = fadeIn(animationSpec = tween(700)) +
                    expandVertically (animationSpec = tween(700)),
            exit = fadeOut(animationSpec = tween(700)) +
                    shrinkVertically (animationSpec = tween(700)),
            visible = !visible
        ) {
            buttonText = filterString
            Card(
                modifier = Modifier
                    .background(Color(0xf5f5f5f5)),

                ) {
                LazyColumn {
                    var filterList = mutableSetOf<String>()
                    for(i in propertiesSelected){
                        filterList.add(i)
                    }
                    itemsIndexed(
                        filter(countriesList, filterList)
                    ) { index, string ->
                        Card(

                        ){
                            Text(
                                text = string.name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 24.dp)
                            )
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
                }},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(buttonText, textAlign = TextAlign.Center,)
        }
    }
}