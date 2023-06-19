package pl.klenczi.jcomposeflagiaplikacja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
            val albania = Panstwo(getString(R.string.country_albania), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_black), resources.getString(R.string.shape_other)), R.drawable.albania)
            val andora = Panstwo(getString(R.string.country_andora), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.orientation_vertical)), R.drawable.andora)
            val austria = Panstwo(getString(R.string.country_austria), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.austria)
            val belgia = Panstwo(getString(R.string.country_belgia), mutableSetOf(resources.getString(R.string.color_black), resources.getString(R.string.color_yellow), resources.getString(R.string.color_red), resources.getString(R.string.orientation_vertical)), R.drawable.belgia)
            val bialorus = Panstwo(getString(R.string.country_bialorus), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_green), resources.getString(R.string.orientation_horizontal)), R.drawable.bialorus)
            val bosnia = Panstwo(getString(R.string.country_bosnia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.color_white), resources.getString(R.string.shape_other)), R.drawable.bosnia)
            val bulgaria = Panstwo(getString(R.string.country_bulgaria), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_green), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.bulgaria)
            val chorwacja = Panstwo(getString(R.string.country_chorwacja), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.chorwacja)
            val cypr = Panstwo(getString(R.string.country_cypr), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_other)), R.drawable.cypr)
            val czarnogora = Panstwo(getString(R.string.country_czarnogora), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_other)), R.drawable.czarnogora)
            val czechy = Panstwo(getString(R.string.country_czechy), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.shape_other)), R.drawable.czechy)
            val dania = Panstwo(getString(R.string.country_dania), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.shape_cross)), R.drawable.dania)
            val estonia = Panstwo(getString(R.string.country_estonia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_black), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.estonia)
            val finlandia = Panstwo(getString(R.string.country_finlandia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.shape_cross)), R.drawable.finlandia)
            val francja = Panstwo(getString(R.string.country_francja), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.orientation_vertical)), R.drawable.francja)
            val gibraltar = Panstwo(getString(R.string.country_gibraltar), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.shape_other)), R.drawable.giblartar)
            val grecja = Panstwo(getString(R.string.country_grecja), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.shape_other)), R.drawable.grecja)
            val hiszpania = Panstwo(getString(R.string.country_hiszpania), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.orientation_horizontal)), R.drawable.hiszpania)
            val holandia = Panstwo(getString(R.string.country_holandia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.holandia)
            val irlandia = Panstwo(getString(R.string.country_irlandia), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white), resources.getString(R.string.color_orange), resources.getString(R.string.orientation_vertical)), R.drawable.irlandia)
            val islandia = Panstwo(getString(R.string.country_islandia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.shape_cross)), R.drawable.islandia)
            val liechtenstein = Panstwo(getString(R.string.country_liechtenstein), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.liechtenstein)
            val litwa = Panstwo(getString(R.string.country_litwa), mutableSetOf(resources.getString(R.string.color_yellow), resources.getString(R.string.color_green), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.litwa)
            val luksemburg = Panstwo(getString(R.string.country_luksemburg), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.luksemburg)
            val lotwa = Panstwo(getString(R.string.country_lotwa), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.lotwa)
            val malta = Panstwo(getString(R.string.country_malta), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_vertical)), R.drawable.malta)
            val macedonia = Panstwo(getString(R.string.country_macedonia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_other)), R.drawable.macedonia)
            val monako = Panstwo(getString(R.string.country_monako), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.monako)
            val niemcy = Panstwo(getString(R.string.country_niemcy), mutableSetOf(resources.getString(R.string.color_black), resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.orientation_horizontal)), R.drawable.niemcy)
            val norwegia = Panstwo(getString(R.string.country_norwegia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.shape_cross)), R.drawable.norwegia)
            val portugalia = Panstwo(getString(R.string.country_portugalia), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_red), resources.getString(R.string.orientation_vertical)), R.drawable.portugalia)
            val polska = Panstwo(getString(R.string.country_polska),mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.polska)
            val rosja = Panstwo(getString(R.string.country_rosja), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.rosja)
            val rumunia = Panstwo(getString(R.string.country_rumunia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.color_red), resources.getString(R.string.orientation_vertical)), R.drawable.rumunia)
            val sanmarino = Panstwo(getString(R.string.country_sanmarino), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_vertical)), R.drawable.sanmarino)
            val serbia = Panstwo(getString(R.string.country_serbia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.serbia)
            val slowacja = Panstwo(getString(R.string.country_slowacja), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.slowacja)
            val slowenia = Panstwo(getString(R.string.country_slowenia), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.slowenia)
            val szkocja = Panstwo(getString(R.string.country_szkocja), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.shape_cross)), R.drawable.szkocja)
            val szwajcaria = Panstwo(getString(R.string.country_szwajcaria), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.shape_cross)), R.drawable.szwajcaria)
            val szwecja = Panstwo(getString(R.string.country_szwecja), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_cross)), R.drawable.szwecja)
            val turcja = Panstwo(getString(R.string.country_turcja), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.shape_other)), R.drawable.turcja)
            val ukraina = Panstwo(getString(R.string.country_ukraina), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.orientation_horizontal)), R.drawable.ukraina)
            val wegry = Panstwo(getString(R.string.country_wegry), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_green), resources.getString(R.string.orientation_horizontal)), R.drawable.wegry)
            val wielkabrytania = Panstwo(getString(R.string.country_wielkabrytania), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.wielkabrytania)
            val wlochy = Panstwo(getString(R.string.country_wlochy), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_green), resources.getString(R.string.orientation_vertical)), R.drawable.wlochy)

            val argentina = Panstwo(getString(R.string.country_argentina), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.argentyna)
            val bahamy = Panstwo(getString(R.string.country_bahamy), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.bahamy)
            val barbados = Panstwo(getString(R.string.country_barbados), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.orientation_vertical)), R.drawable.barbados)
            val belize = Panstwo(getString(R.string.country_belize), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.belize)
            val boliwia = Panstwo(getString(R.string.country_boliwia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.color_green), resources.getString(R.string.orientation_horizontal)), R.drawable.boliwia)
            val brazylia = Panstwo(getString(R.string.country_brazylia), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_other)), R.drawable.brazylia)
            val chile = Panstwo(getString(R.string.country_chile), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.chile)
            val ekwador = Panstwo(getString(R.string.country_ekwador), mutableSetOf(resources.getString(R.string.color_yellow), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.ekwador)
            val gujana = Panstwo(getString(R.string.country_gujana), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.shape_other)), R.drawable.gujana)
            val jamajka = Panstwo(getString(R.string.country_jamajka), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.shape_cross)), R.drawable.jamajka)
            val kanada = Panstwo(getString(R.string.country_kanada), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_vertical)), R.drawable.kanada)
            val kolumbia = Panstwo(getString(R.string.country_kolumbia), mutableSetOf(resources.getString(R.string.color_yellow), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.kolumbia)
            val kostaryka = Panstwo(getString(R.string.country_kostaryka), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.kostaryka)
            val kuba = Panstwo(getString(R.string.country_kuba), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.kuba)
            val meksyk = Panstwo(getString(R.string.country_meksyk), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white), resources.getString(R.string.color_red), resources.getString(R.string.orientation_vertical)), R.drawable.meksyk)
            val panama = Panstwo(getString(R.string.country_panama), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.shape_other)), R.drawable.panama)
            val paragwaj = Panstwo(getString(R.string.country_paragwaj), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.paragwaj)
            val peru = Panstwo(getString(R.string.country_peru), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.orientation_vertical)), R.drawable.peru)
            val stanyzjednoczone = Panstwo(getString(R.string.country_stanyzjednoczone), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.stanyzjednoczone)
            val surinam = Panstwo(getString(R.string.country_surinam), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.surinam)
            val urugwaj = Panstwo(getString(R.string.country_urugwaj), mutableSetOf(resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal), resources.getString(R.string.shape_other)), R.drawable.urugwaj)
            val wenezuela = Panstwo(getString(R.string.country_wenezuela), mutableSetOf(resources.getString(R.string.color_yellow), resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.wenezuela)
            val antiguabarbuda = Panstwo(getString(R.string.country_antiguabarbuda), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.shape_other)), R.drawable.antiguabarbuda)
            val dominika = Panstwo(getString(R.string.country_dominika), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.shape_cross)), R.drawable.dominika)
            val dominikana = Panstwo(getString(R.string.country_dominikana), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.shape_cross)), R.drawable.dominikana)
            val grenada = Panstwo(getString(R.string.country_grenada), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.color_green), resources.getString(R.string.shape_other)), R.drawable.grenada)
            val gwatemala = Panstwo(getString(R.string.country_gwatemala), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_vertical)), R.drawable.gwatemala)
            val haiti = Panstwo(getString(R.string.country_haiti), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.orientation_horizontal)), R.drawable.haiti)
            val honduras = Panstwo(getString(R.string.country_honduras), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.honduras)
            val nikaragua = Panstwo(getString(R.string.country_nikaragua), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.orientation_horizontal)), R.drawable.nikaragua)
            val stkittsnevis = Panstwo(getString(R.string.country_stkittsnevis), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.shape_other)), R.drawable.stkittsnevis)
            val stlucia = Panstwo(getString(R.string.country_stlucia), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow), resources.getString(R.string.color_black), resources.getString(R.string.shape_other)), R.drawable.stlucia)
            val stvimcentgrenadyny = Panstwo(getString(R.string.country_stvimcentgrenadyny), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_green), resources.getString(R.string.color_yellow), resources.getString(R.string.orientation_vertical)), R.drawable.stvimcentgrenadyny)
            val salwador = Panstwo(getString(R.string.country_salwador), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.color_blue), resources.getString(R.string.orientation_horizontal)), R.drawable.salwador)

            val afganistan = Panstwo(getString(R.string.country_afghanistan), mutableSetOf(resources.getString(R.string.color_black), resources.getString(R.string.color_white)), R.drawable.afganistan)
            val arabiasaudyjska = Panstwo(getString(R.string.country_arabiasaudyjska), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white)), R.drawable.arabiasaudyjska)
            val armenia = Panstwo(getString(R.string.country_armenia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.color_orange)), R.drawable.armenia)
            val azerbejdzan = Panstwo(getString(R.string.country_azerbejdzan), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.color_green)), R.drawable.azerbejdzan)
            val bahrajn = Panstwo(getString(R.string.country_bahrajn), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.bahrajn)
            val bangladesz = Panstwo(getString(R.string.country_bangladesz), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_red)), R.drawable.bangladesz)
            val birma = Panstwo(getString(R.string.country_birma), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue), resources.getString(R.string.color_white)), R.drawable.birma)
            val bhutan = Panstwo(getString(R.string.country_bhutan), mutableSetOf(resources.getString(R.string.color_orange), resources.getString(R.string.color_yellow)), R.drawable.bhutan)
            val chinskarepublikaludowa = Panstwo(getString(R.string.country_chinskarepublikaludowa), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow)), R.drawable.chinskarepublikaludowa)
            val indie = Panstwo(getString(R.string.country_indie), mutableSetOf(resources.getString(R.string.color_orange), resources.getString(R.string.color_white), resources.getString(R.string.color_green)), R.drawable.indie)
            val indonezja = Panstwo(getString(R.string.country_indonezja), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.indonezja)
            val irak = Panstwo(getString(R.string.country_irak), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_black)), R.drawable.irak)
            val iran = Panstwo(getString(R.string.country_iran), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white), resources.getString(R.string.color_red)), R.drawable.iran)
            val izrael = Panstwo(getString(R.string.country_izrael), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white)), R.drawable.izrael)
            val japonia = Panstwo(getString(R.string.country_japonia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.japonia)
            val jemen = Panstwo(getString(R.string.country_jemen), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_black)), R.drawable.jemen)
            val jordania = Panstwo(getString(R.string.country_jordania), mutableSetOf(resources.getString(R.string.color_black), resources.getString(R.string.color_white), resources.getString(R.string.color_green), resources.getString(R.string.color_red)), R.drawable.jordania)
            val kazachstan = Panstwo(getString(R.string.country_kazachstan), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_yellow)), R.drawable.kazachstan)
            val kirgistan = Panstwo(getString(R.string.country_kirgistan), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow), resources.getString(R.string.color_blue)), R.drawable.kirgistan)
            val koreapolnocna = Panstwo(getString(R.string.country_koreapolnocna), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue)), R.drawable.koreapolnocna)
            val koreapoludniowa = Panstwo(getString(R.string.country_koreapoludniowa), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue)), R.drawable.koreapoludniowa)
            val kuwejt = Panstwo(getString(R.string.country_kuwejt), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white), resources.getString(R.string.color_red)), R.drawable.kuwejt)
            val laos = Panstwo(getString(R.string.country_laos), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red)), R.drawable.laos)
            val liban = Panstwo(getString(R.string.country_liban), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.liban)
            val malezja = Panstwo(getString(R.string.country_malezja), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue)), R.drawable.malezja)
            val maledivy = Panstwo(getString(R.string.country_maledivy), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_green)), R.drawable.maledivy)
            val mongolia = Panstwo(getString(R.string.country_mongolia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_blue)), R.drawable.mongolia)
            val nepal = Panstwo(getString(R.string.country_nepal), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.nepal)
            val oman = Panstwo(getString(R.string.country_oman), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_green)), R.drawable.oman)
            val pakistan = Panstwo(getString(R.string.country_pakistan), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_white)), R.drawable.pakistan)
            val filipiny = Panstwo(getString(R.string.country_filipiny), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_red), resources.getString(R.string.color_yellow)), R.drawable.filipiny)
            val katar = Panstwo(getString(R.string.country_katar), mutableSetOf("czerwony", resources.getString(R.string.color_white)), R.drawable.qatar)
            val singapur = Panstwo(getString(R.string.country_singapur), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white)), R.drawable.singapur)
            val srilanka = Panstwo(getString(R.string.country_srilanka), mutableSetOf(resources.getString(R.string.color_yellow), resources.getString(R.string.color_red), resources.getString(R.string.color_green)), R.drawable.srilanka)
            val syria = Panstwo(getString(R.string.country_syria), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_black)), R.drawable.syria)
            val tadzykistan = Panstwo(getString(R.string.country_tadzykistan), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_green)), R.drawable.tadzykistan)
            val tajlandia = Panstwo(getString(R.string.country_tajlandia), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_white), resources.getString(R.string.color_blue)), R.drawable.tajlandia)
            val timorwschodni = Panstwo(getString(R.string.country_timorwschodni), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_black), resources.getString(R.string.color_yellow)), R.drawable.timorwschodni)
            val turkmenistan = Panstwo(getString(R.string.country_turkmenistan), mutableSetOf(resources.getString(R.string.color_green), resources.getString(R.string.color_red)), R.drawable.turkmenistan)
            val uzbeckistan = Panstwo(getString(R.string.country_uzbeckistan), mutableSetOf(resources.getString(R.string.color_blue), resources.getString(R.string.color_white), resources.getString(R.string.color_green)), R.drawable.uzbekistan)
            val wietnam = Panstwo(getString(R.string.country_wietnam), mutableSetOf(resources.getString(R.string.color_red), resources.getString(R.string.color_yellow)), R.drawable.wietnam)
            val zjednoczoneemiratyarabskie = Panstwo(getString(R.string.country_zjednoczoneemiratyarabskie), mutableSetOf(resources.getString(R.string.color_black), resources.getString(R.string.color_white), resources.getString(R.string.color_green), resources.getString(R.string.color_red)), R.drawable.emiratyarabskie)


            val countriesList = mutableListOf(
                afganistan,
                albania,
                andora,
                antiguabarbuda,
                arabiasaudyjska,
                argentina,
                armenia,
                azerbejdzan,
                austria,
                bahamy,
                bahrajn,
                bangladesz,
                barbados,
                belgia,
                belize,
                bhutan,
                bialorus,
                birma,
                boliwia,
                bosnia,
                brazylia,
                bulgaria,
                chorwacja,
                chile,
                chinskarepublikaludowa,
                cypr,
                czarnogora,
                czechy,
                dania,
                dominika,
                dominikana,
                ekwador,
                estonia,
                filipiny,
                finlandia,
                francja,
                gibraltar,
                grecja,
                grenada,
                gujana,
                gwatemala,
                haiti,
                hiszpania,
                honduras,
                holandia,
                indie,
                indonezja,
                irak,
                iran,
                irlandia,
                islandia,
                izrael,
                jamajka,
                japonia,
                jemen,
                jordania,
                kanada,
                katar,
                kazachstan,
                kirgistan,
                kolumbia,
                koreapolnocna,
                koreapoludniowa,
                kostaryka,
                kuba,
                kuwejt,
                laos,
                liban,
                liechtenstein,
                litwa,
                luksemburg,
                lotwa,
                malezja,
                maledivy,
                malta,
                macedonia,
                meksyk,
                monako,
                mongolia,
                nepal,
                nikaragua,
                niemcy,
                norwegia,
                oman,
                pakistan,
                panama,
                paragwaj,
                peru,
                polska,
                portugalia,
                rosja,
                rumunia,
                salwador,
                sanmarino,
                serbia,
                singapur,
                slowacja,
                slowenia,
                srilanka,
                stkittsnevis,
                stlucia,
                stvimcentgrenadyny,
                stanyzjednoczone,
                surinam,
                syria,
                szkocja,
                szwajcaria,
                szwecja,
                tadzykistan,
                tajlandia,
                timorwschodni,
                turcja,
                turkmenistan,
                ukraina,
                urugwaj,
                uzbeckistan,
                wegry,
                wielkabrytania,
                wietnam,
                wenezuela,
                wlochy,
                zjednoczoneemiratyarabskie,
            )
            
            AnimateVisibility(countriesList,
                setOf(
                    resources.getString(R.string.color_white),
                    resources.getString(R.string.color_red),
                    resources.getString(R.string.color_yellow),
                    resources.getString(R.string.color_blue),
                    resources.getString(R.string.color_black),
                    resources.getString(R.string.color_orange),
                    resources.getString(R.string.color_green)
                ),
                setOf(
                    resources.getString(R.string.orientation_horizontal),
                    resources.getString(R.string.orientation_vertical),
                    resources.getString(R.string.shape_cross),
                    resources.getString(R.string.shape_other)
                )
            )
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimateVisibility(countries: MutableList<Panstwo>, propertiesColorInput: Set<String>, propertiesLayoutInput: Set<String>) {
    val animationDuration = 850
    val filterString = "Filter"
    val wynikiString = "Wyniki"
    var propertiesColor by remember {
        mutableStateOf(propertiesColorInput)
    }
    var propertiesLayout by remember {
        mutableStateOf(propertiesLayoutInput)
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
            enter = scaleIn(animationSpec = tween(animationDuration)) +
                    expandVertically(animationSpec = tween(animationDuration)),
            exit = scaleOut(animationSpec = tween(animationDuration)) +
                    shrinkVertically(animationSpec = tween(animationDuration))
        ) {
            buttonText = wynikiString
            Column(modifier = Modifier
                .fillMaxWidth(0.7f)
                .fillMaxHeight(0.85f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    propertiesColor.forEach { property ->
                        Row(
                            modifier = Modifier
                                .padding(4.dp)
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
                Spacer(modifier = Modifier.height(5.dp))
                Column {
                    propertiesLayout.forEach { property ->
                        Row(
                            modifier = Modifier
                                .padding(4.dp)
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
            enter = scaleIn(animationSpec = tween(animationDuration)) +
                    expandVertically(animationSpec = tween(animationDuration)),
            exit = scaleOut(animationSpec = tween(animationDuration)) +
                    shrinkVertically(animationSpec = tween(animationDuration)),
            visible = !visible
        ) {
            buttonText = filterString
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.9f)
                    .padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
                ) {
                val filterList by remember {
                    mutableStateOf(mutableSetOf<String>())
                }
                Text(
                    text = "Count: ${filter(countries, filterList).size}",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                LazyColumn {
                    for (i in propertiesSelected) {
                        filterList.add(i)
                    }
                    itemsIndexed(
                        filter(countries, filterList)
                    ) { index, country ->
                        Row(
                            modifier = Modifier.height(120.dp)
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
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        Button(
            onClick = {
                visible = !visible
            },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(buttonText, textAlign = TextAlign.Center)
        }
    }
}