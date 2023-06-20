package pl.klenczi.jcomposeflagiaplikacja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.LocalContentColor
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val r = resources
            val europe = r.getString(R.string.continent_europe)
            val asia = r.getString(R.string.continent_asia)
            val america = r.getString(R.string.continent_america)
            val africa = r.getString(R.string.continent_africa)
            val oceania = r.getString(R.string.continent_oceania)

            val red = r.getString(R.string.color_red)
            val blue = r.getString(R.string.color_blue)
            val yellow = r.getString(R.string.color_yellow)
            val green = r.getString(R.string.color_green)
            val black = r.getString(R.string.color_black)
            val white = r.getString(R.string.color_white)
            val orange = r.getString(R.string.color_orange)

            val vertical = r.getString(R.string.orientation_vertical)
            val horizontal = r.getString(R.string.orientation_horizontal)
            val cross = r.getString(R.string.shape_cross)
            val other = r.getString(R.string.shape_other)

            val albania = Panstwo(getString(R.string.country_albania), mutableSetOf(europe), mutableSetOf(red, black, other), R.drawable.albania)
            val andora = Panstwo(getString(R.string.country_andora), mutableSetOf(europe), mutableSetOf(blue, yellow, vertical), R.drawable.andora)
            val austria = Panstwo(getString(R.string.country_austria), mutableSetOf(europe), mutableSetOf(red, white, horizontal), R.drawable.austria)
            val belgia = Panstwo(getString(R.string.country_belgia), mutableSetOf(europe), mutableSetOf(black, yellow, red, vertical), R.drawable.belgia)
            val bialorus = Panstwo(getString(R.string.country_bialorus), mutableSetOf(europe), mutableSetOf(red, green, horizontal), R.drawable.bialorus)
            val bosnia = Panstwo(getString(R.string.country_bosnia), mutableSetOf(europe), mutableSetOf(blue, yellow, white, other), R.drawable.bosnia)
            val bulgaria = Panstwo(getString(R.string.country_bulgaria), mutableSetOf(europe), mutableSetOf(white, green, red, horizontal), R.drawable.bulgaria)
            val chorwacja = Panstwo(getString(R.string.country_chorwacja), mutableSetOf(europe), mutableSetOf(red, white, blue, horizontal), R.drawable.chorwacja)
            val cypr = Panstwo(getString(R.string.country_cypr), mutableSetOf(europe), mutableSetOf(white, yellow, other), R.drawable.cypr)
            val czarnogora = Panstwo(getString(R.string.country_czarnogora), mutableSetOf(europe), mutableSetOf(red, yellow, other), R.drawable.czarnogora)
            val czechy = Panstwo(getString(R.string.country_czechy), mutableSetOf(europe), mutableSetOf(white, red, other), R.drawable.czechy)
            val dania = Panstwo(getString(R.string.country_dania), mutableSetOf(europe), mutableSetOf(red, white, cross), R.drawable.dania)
            val estonia = Panstwo(getString(R.string.country_estonia), mutableSetOf(europe), mutableSetOf(blue, black, white, horizontal), R.drawable.estonia)
            val finlandia = Panstwo(getString(R.string.country_finlandia), mutableSetOf(europe), mutableSetOf(blue, white, cross), R.drawable.finlandia)
            val francja = Panstwo(getString(R.string.country_francja), mutableSetOf(europe), mutableSetOf(blue, white, red, vertical), R.drawable.francja)
            val gibraltar = Panstwo(getString(R.string.country_gibraltar), mutableSetOf(europe), mutableSetOf(white, red, other), R.drawable.giblartar)
            val grecja = Panstwo(getString(R.string.country_grecja), mutableSetOf(europe), mutableSetOf(blue, white, other), R.drawable.grecja)
            val hiszpania = Panstwo(getString(R.string.country_hiszpania), mutableSetOf(europe), mutableSetOf(red, yellow, horizontal), R.drawable.hiszpania)
            val holandia = Panstwo(getString(R.string.country_holandia), mutableSetOf(europe), mutableSetOf(red, white, blue, horizontal), R.drawable.holandia)
            val irlandia = Panstwo(getString(R.string.country_irlandia), mutableSetOf(europe), mutableSetOf(green, white, orange, vertical), R.drawable.irlandia)
            val islandia = Panstwo(getString(R.string.country_islandia), mutableSetOf(europe), mutableSetOf(blue, red, white, cross), R.drawable.islandia)
            val liechtenstein = Panstwo(getString(R.string.country_liechtenstein), mutableSetOf(europe), mutableSetOf(blue, red, horizontal), R.drawable.liechtenstein)
            val litwa = Panstwo(getString(R.string.country_litwa), mutableSetOf(europe), mutableSetOf(yellow, green, red, horizontal), R.drawable.litwa)
            val luksemburg = Panstwo(getString(R.string.country_luksemburg), mutableSetOf(europe), mutableSetOf(red, white, blue, horizontal), R.drawable.luksemburg)
            val lotwa = Panstwo(getString(R.string.country_lotwa), mutableSetOf(europe), mutableSetOf(red, white, horizontal), R.drawable.lotwa)
            val malta = Panstwo(getString(R.string.country_malta), mutableSetOf(europe), mutableSetOf(red, white, vertical), R.drawable.malta)
            val macedonia = Panstwo(getString(R.string.country_macedonia), mutableSetOf(europe), mutableSetOf(red, yellow, other), R.drawable.macedonia)
            val monako = Panstwo(getString(R.string.country_monako), mutableSetOf(europe), mutableSetOf(red, white, horizontal), R.drawable.monako)
            val niemcy = Panstwo(getString(R.string.country_niemcy), mutableSetOf(europe), mutableSetOf(black, red, yellow, horizontal), R.drawable.niemcy)
            val norwegia = Panstwo(getString(R.string.country_norwegia), mutableSetOf(europe), mutableSetOf(red, white, blue, cross), R.drawable.norwegia)
            val portugalia = Panstwo(getString(R.string.country_portugalia), mutableSetOf(europe), mutableSetOf(green, red, vertical), R.drawable.portugalia)
            val polska = Panstwo(getString(R.string.country_polska),mutableSetOf(europe), mutableSetOf(white, red, horizontal), R.drawable.polska)
            val rosja = Panstwo(getString(R.string.country_rosja), mutableSetOf(europe), mutableSetOf(white, blue, red, horizontal), R.drawable.rosja)
            val rumunia = Panstwo(getString(R.string.country_rumunia), mutableSetOf(europe), mutableSetOf(blue, yellow, red, vertical), R.drawable.rumunia)
            val sanmarino = Panstwo(getString(R.string.country_sanmarino), mutableSetOf(europe), mutableSetOf(white, blue, vertical), R.drawable.sanmarino)
            val serbia = Panstwo(getString(R.string.country_serbia), mutableSetOf(europe), mutableSetOf(red, blue, white, horizontal), R.drawable.serbia)
            val slowacja = Panstwo(getString(R.string.country_slowacja), mutableSetOf(europe), mutableSetOf(white, blue, red, horizontal), R.drawable.slowacja)
            val slowenia = Panstwo(getString(R.string.country_slowenia), mutableSetOf(europe), mutableSetOf(white, blue, red, horizontal), R.drawable.slowenia)
            val szkocja = Panstwo(getString(R.string.country_szkocja), mutableSetOf(europe), mutableSetOf(blue, white, cross), R.drawable.szkocja)
            val szwajcaria = Panstwo(getString(R.string.country_szwajcaria), mutableSetOf(europe), mutableSetOf(red, white, cross), R.drawable.szwajcaria)
            val szwecja = Panstwo(getString(R.string.country_szwecja), mutableSetOf(europe), mutableSetOf(blue, yellow, cross), R.drawable.szwecja)
            val turcja = Panstwo(getString(R.string.country_turcja), mutableSetOf(europe), mutableSetOf(red, white, other), R.drawable.turcja)
            val ukraina = Panstwo(getString(R.string.country_ukraina), mutableSetOf(europe), mutableSetOf(blue, yellow, horizontal), R.drawable.ukraina)
            val wegry = Panstwo(getString(R.string.country_wegry), mutableSetOf(europe), mutableSetOf(red, white, green, horizontal), R.drawable.wegry)
            val wielkabrytania = Panstwo(getString(R.string.country_wielkabrytania), mutableSetOf(europe), mutableSetOf(red, white, blue, horizontal), R.drawable.wielkabrytania)
            val wlochy = Panstwo(getString(R.string.country_wlochy), mutableSetOf(europe), mutableSetOf(red, white, green, vertical), R.drawable.wlochy)

            val argentina = Panstwo(getString(R.string.country_argentina), mutableSetOf(america), mutableSetOf(blue, white, horizontal), R.drawable.argentyna)
            val bahamy = Panstwo(getString(R.string.country_bahamy), mutableSetOf(america), mutableSetOf(blue, yellow, black, horizontal, other), R.drawable.bahamy)
            val barbados = Panstwo(getString(R.string.country_barbados), mutableSetOf(america), mutableSetOf(blue, yellow, black, vertical), R.drawable.barbados)
            val belize = Panstwo(getString(R.string.country_belize), mutableSetOf(america), mutableSetOf(red, blue, horizontal, other), R.drawable.belize)
            val boliwia = Panstwo(getString(R.string.country_boliwia), mutableSetOf(america), mutableSetOf(red, yellow, green, horizontal), R.drawable.boliwia)
            val brazylia = Panstwo(getString(R.string.country_brazylia), mutableSetOf(america), mutableSetOf(green, yellow, other), R.drawable.brazylia)
            val chile = Panstwo(getString(R.string.country_chile), mutableSetOf(america), mutableSetOf(red, white, blue, horizontal, other), R.drawable.chile)
            val ekwador = Panstwo(getString(R.string.country_ekwador), mutableSetOf(america), mutableSetOf(yellow, blue, red, horizontal), R.drawable.ekwador)
            val gujana = Panstwo(getString(R.string.country_gujana), mutableSetOf(america), mutableSetOf(green, yellow, black, other), R.drawable.gujana)
            val jamajka = Panstwo(getString(R.string.country_jamajka), mutableSetOf(america), mutableSetOf(green, yellow, black, cross), R.drawable.jamajka)
            val kanada = Panstwo(getString(R.string.country_kanada), mutableSetOf(america), mutableSetOf(red, white, vertical), R.drawable.kanada)
            val kolumbia = Panstwo(getString(R.string.country_kolumbia), mutableSetOf(america), mutableSetOf(yellow, blue, red, horizontal), R.drawable.kolumbia)
            val kostaryka = Panstwo(getString(R.string.country_kostaryka), mutableSetOf(america), mutableSetOf(blue, white, red, horizontal), R.drawable.kostaryka)
            val kuba = Panstwo(getString(R.string.country_kuba), mutableSetOf(america), mutableSetOf(red, blue, white, horizontal, other), R.drawable.kuba)
            val meksyk = Panstwo(getString(R.string.country_meksyk), mutableSetOf(america), mutableSetOf(green, white, red, vertical), R.drawable.meksyk)
            val panama = Panstwo(getString(R.string.country_panama), mutableSetOf(america), mutableSetOf(red, white, blue, other), R.drawable.panama)
            val paragwaj = Panstwo(getString(R.string.country_paragwaj), mutableSetOf(america), mutableSetOf(red, white, blue, horizontal), R.drawable.paragwaj)
            val peru = Panstwo(getString(R.string.country_peru), mutableSetOf(america), mutableSetOf(red, white, vertical), R.drawable.peru)
            val stanyzjednoczone = Panstwo(getString(R.string.country_stanyzjednoczone), mutableSetOf(america), mutableSetOf(red, white, blue, horizontal, other), R.drawable.stanyzjednoczone)
            val surinam = Panstwo(getString(R.string.country_surinam), mutableSetOf(america), mutableSetOf(green, yellow, red, horizontal), R.drawable.surinam)
            val urugwaj = Panstwo(getString(R.string.country_urugwaj), mutableSetOf(america), mutableSetOf(white, blue, horizontal, other), R.drawable.urugwaj)
            val wenezuela = Panstwo(getString(R.string.country_wenezuela), mutableSetOf(america), mutableSetOf(yellow, blue, red, horizontal), R.drawable.wenezuela)
            val antiguabarbuda = Panstwo(getString(R.string.country_antiguabarbuda), mutableSetOf(america), mutableSetOf(red, blue, other), R.drawable.antiguabarbuda)
            val dominika = Panstwo(getString(R.string.country_dominika), mutableSetOf(america), mutableSetOf(green, yellow, cross), R.drawable.dominika)
            val dominikana = Panstwo(getString(R.string.country_dominikana), mutableSetOf(america), mutableSetOf(red, white, blue, cross), R.drawable.dominikana)
            val grenada = Panstwo(getString(R.string.country_grenada), mutableSetOf(america), mutableSetOf(red, yellow, green, other), R.drawable.grenada)
            val gwatemala = Panstwo(getString(R.string.country_gwatemala), mutableSetOf(america), mutableSetOf(blue, white, blue, vertical), R.drawable.gwatemala)
            val haiti = Panstwo(getString(R.string.country_haiti), mutableSetOf(america), mutableSetOf(blue, red, horizontal), R.drawable.haiti)
            val honduras = Panstwo(getString(R.string.country_honduras), mutableSetOf(america), mutableSetOf(blue, white, horizontal), R.drawable.honduras)
            val nikaragua = Panstwo(getString(R.string.country_nikaragua), mutableSetOf(america), mutableSetOf(blue, white, horizontal), R.drawable.nikaragua)
            val stkittsnevis = Panstwo(getString(R.string.country_stkittsnevis), mutableSetOf(america), mutableSetOf(green, yellow, black, other), R.drawable.stkittsnevis)
            val stlucia = Panstwo(getString(R.string.country_stlucia), mutableSetOf(america), mutableSetOf(blue, yellow, black, other), R.drawable.stlucia)
            val stvimcentgrenadyny = Panstwo(getString(R.string.country_stvimcentgrenadyny), mutableSetOf(america), mutableSetOf(blue, green, yellow, vertical), R.drawable.stvimcentgrenadyny)
            val salwador = Panstwo(getString(R.string.country_salwador), mutableSetOf(america), mutableSetOf(blue, white, blue, horizontal), R.drawable.salwador)

            val afganistan = Panstwo(getString(R.string.country_afghanistan), mutableSetOf(asia), mutableSetOf(black, white, other), R.drawable.afganistan)
            val arabiasaudyjska = Panstwo(getString(R.string.country_arabiasaudyjska), mutableSetOf(asia), mutableSetOf(green, white, other), R.drawable.arabiasaudyjska)
            val armenia = Panstwo(getString(R.string.country_armenia), mutableSetOf(asia), mutableSetOf(red, blue, orange, horizontal), R.drawable.armenia)
            val azerbejdzan = Panstwo(getString(R.string.country_azerbejdzan), mutableSetOf(asia), mutableSetOf(blue, red, green, white, horizontal), R.drawable.azerbejdzan)
            val bahrajn = Panstwo(getString(R.string.country_bahrajn), mutableSetOf(asia), mutableSetOf(red, white, vertical), R.drawable.bahrajn)
            val bangladesz = Panstwo(getString(R.string.country_bangladesz), mutableSetOf(asia), mutableSetOf(green, red, other), R.drawable.bangladesz)
            val birma = Panstwo(getString(R.string.country_birma), mutableSetOf(asia), mutableSetOf(red, blue, white, yellow, horizontal), R.drawable.birma)
            val bhutan = Panstwo(getString(R.string.country_bhutan), mutableSetOf(asia), mutableSetOf(orange, yellow, white, other), R.drawable.bhutan)
            val chinskarepublikaludowa = Panstwo(getString(R.string.country_chinskarepublikaludowa), mutableSetOf(asia), mutableSetOf(red, yellow, other), R.drawable.chinskarepublikaludowa)
            val indie = Panstwo(getString(R.string.country_indie), mutableSetOf(asia), mutableSetOf(orange, white, green, horizontal), R.drawable.indie)
            val indonezja = Panstwo(getString(R.string.country_indonezja), mutableSetOf(asia), mutableSetOf(red, white, horizontal), R.drawable.indonezja)
            val irak = Panstwo(getString(R.string.country_irak), mutableSetOf(asia), mutableSetOf(red, white, black, green, horizontal), R.drawable.irak)
            val iran = Panstwo(getString(R.string.country_iran), mutableSetOf(asia), mutableSetOf(green, white, red, horizontal), R.drawable.iran)
            val izrael = Panstwo(getString(R.string.country_izrael), mutableSetOf(asia), mutableSetOf(blue, white, horizontal), R.drawable.izrael)
            val japonia = Panstwo(getString(R.string.country_japonia), mutableSetOf(asia), mutableSetOf(red, white, other), R.drawable.japonia)
            val jemen = Panstwo(getString(R.string.country_jemen), mutableSetOf(asia), mutableSetOf(red, white, black, horizontal), R.drawable.jemen)
            val jordania = Panstwo(getString(R.string.country_jordania), mutableSetOf(asia), mutableSetOf(black, white, green, red, horizontal), R.drawable.jordania)
            val kambodza = Panstwo(getString(R.string.country_kambodza), mutableSetOf(asia), mutableSetOf(blue, white, red, horizontal), R.drawable.kambodza)
            val kazachstan = Panstwo(getString(R.string.country_kazachstan), mutableSetOf(asia), mutableSetOf(blue, yellow, other), R.drawable.kazachstan)
            val kirgistan = Panstwo(getString(R.string.country_kirgistan), mutableSetOf(asia), mutableSetOf(red, yellow, other), R.drawable.kirgistan)
            val koreapolnocna = Panstwo(getString(R.string.country_koreapolnocna), mutableSetOf(asia), mutableSetOf(red, white, blue, horizontal), R.drawable.koreapolnocna)
            val koreapoludniowa = Panstwo(getString(R.string.country_koreapoludniowa), mutableSetOf(asia), mutableSetOf(red, white, black, blue, other), R.drawable.koreapoludniowa)
            val kuwejt = Panstwo(getString(R.string.country_kuwejt), mutableSetOf(asia), mutableSetOf(green, white, red, black, horizontal), R.drawable.kuwejt)
            val laos = Panstwo(getString(R.string.country_laos), mutableSetOf(asia), mutableSetOf(blue, red, white, horizontal), R.drawable.laos)
            val liban = Panstwo(getString(R.string.country_liban), mutableSetOf(asia), mutableSetOf(red, white, green, horizontal), R.drawable.liban)
            val malezja = Panstwo(getString(R.string.country_malezja), mutableSetOf(asia), mutableSetOf(red, white, blue, horizontal, other), R.drawable.malezja)
            val maledivy = Panstwo(getString(R.string.country_maledivy), mutableSetOf(asia), mutableSetOf(red, white, green, other), R.drawable.maledivy)
            val mongolia = Panstwo(getString(R.string.country_mongolia), mutableSetOf(asia), mutableSetOf(red, blue, yellow, vertical), R.drawable.mongolia)
            val nepal = Panstwo(getString(R.string.country_nepal), mutableSetOf(asia), mutableSetOf(red, white, other), R.drawable.nepal)
            val oman = Panstwo(getString(R.string.country_oman), mutableSetOf(asia), mutableSetOf(red, white, green, horizontal), R.drawable.oman)
            val pakistan = Panstwo(getString(R.string.country_pakistan), mutableSetOf(asia), mutableSetOf(green, white, vertical), R.drawable.pakistan)
            val filipiny = Panstwo(getString(R.string.country_filipiny), mutableSetOf(asia), mutableSetOf(blue, red, yellow, horizontal), R.drawable.filipiny)
            val katar = Panstwo(getString(R.string.country_katar), mutableSetOf(asia), mutableSetOf(red, white, vertical), R.drawable.qatar)
            val singapur = Panstwo(getString(R.string.country_singapur), mutableSetOf(asia), mutableSetOf(red, white, horizontal), R.drawable.singapur)
            val srilanka = Panstwo(getString(R.string.country_srilanka), mutableSetOf(asia), mutableSetOf(yellow, red, green, orange, other), R.drawable.srilanka)
            val syria = Panstwo(getString(R.string.country_syria), mutableSetOf(asia), mutableSetOf(red, white, black, horizontal), R.drawable.syria)
            val tadzykistan = Panstwo(getString(R.string.country_tadzykistan), mutableSetOf(asia), mutableSetOf(red, white, green, horizontal), R.drawable.tadzykistan)
            val tajlandia = Panstwo(getString(R.string.country_tajlandia), mutableSetOf(asia), mutableSetOf(red, white, blue, horizontal), R.drawable.tajlandia)
            val timorwschodni = Panstwo(getString(R.string.country_timorwschodni), mutableSetOf(asia), mutableSetOf(red, black, yellow, white, other), R.drawable.timorwschodni)
            val turkmenistan = Panstwo(getString(R.string.country_turkmenistan), mutableSetOf(asia), mutableSetOf(green, red, white, other), R.drawable.turkmenistan)
            val uzbeckistan = Panstwo(getString(R.string.country_uzbeckistan), mutableSetOf(asia), mutableSetOf(blue, white, green, horizontal), R.drawable.uzbekistan)
            val wietnam = Panstwo(getString(R.string.country_wietnam), mutableSetOf(asia), mutableSetOf(red, yellow, other), R.drawable.wietnam)
            val zjednoczoneemiratyarabskie = Panstwo(getString(R.string.country_zjednoczoneemiratyarabskie), mutableSetOf(asia), mutableSetOf(black, white, green, red, horizontal), R.drawable.emiratyarabskie)

            val algeria = Panstwo(r.getString(R.string.country_algeria), mutableSetOf(africa), mutableSetOf(red, white, green, vertical), R.drawable.algeria)
            val angola = Panstwo(r.getString(R.string.country_angola), mutableSetOf(africa), mutableSetOf(red, black, yellow, horizontal), R.drawable.angola)
            val benin = Panstwo(r.getString(R.string.country_benin), mutableSetOf(africa), mutableSetOf(green, yellow, red, other), R.drawable.benin)
            val botswana = Panstwo(r.getString(R.string.country_botswana), mutableSetOf(africa), mutableSetOf(blue, black, white, horizontal), R.drawable.botswana)
            val burkinaFaso = Panstwo(r.getString(R.string.country_burkina_faso), mutableSetOf(africa), mutableSetOf(red, green, yellow, horizontal), R.drawable.burkina_faso)
            val burundi = Panstwo(r.getString(R.string.country_burundi), mutableSetOf(africa), mutableSetOf(red, green, white, other), R.drawable.burundi)
            val chad = Panstwo(r.getString(R.string.country_chad), mutableSetOf(africa), mutableSetOf(blue, yellow, red, vertical), R.drawable.chad)
            val democraticRepublicOfCongo = Panstwo(r.getString(R.string.country_democratic_republic_of_congo), mutableSetOf(africa), mutableSetOf(blue, yellow, red, other), R.drawable.democratic_republic_of_congo)
            val djibouti = Panstwo(r.getString(R.string.country_djibouti), mutableSetOf(africa), mutableSetOf(blue, white, green, red, horizontal), R.drawable.djibouti)
            val egypt = Panstwo(r.getString(R.string.country_egypt), mutableSetOf(africa), mutableSetOf(red, white, black, yellow, horizontal), R.drawable.egypt)
            val ivoryCoast = Panstwo(r.getString(R.string.country_ivory_coast), mutableSetOf(africa), mutableSetOf(orange, white, green, vertical), R.drawable.ivory_coast)
            val eritrea = Panstwo(r.getString(R.string.country_eritrea), mutableSetOf(africa), mutableSetOf(red, green, blue, yellow, other), R.drawable.eritrea)
            val eswatini = Panstwo(r.getString(R.string.country_eswatini), mutableSetOf(africa), mutableSetOf(blue, yellow, red, white, black, horizontal), R.drawable.eswatini)
            val ethiopia = Panstwo(r.getString(R.string.country_ethiopia), mutableSetOf(africa), mutableSetOf(green, yellow, red, blue, horizontal), R.drawable.ethiopia)
            val gabon = Panstwo(r.getString(R.string.country_gabon), mutableSetOf(africa), mutableSetOf(green, yellow, blue, horizontal), R.drawable.gabon)
            val gambia = Panstwo(r.getString(R.string.country_gambia), mutableSetOf(africa), mutableSetOf(red, blue, green, white, horizontal), R.drawable.gambia)
            val ghana = Panstwo(r.getString(R.string.country_ghana), mutableSetOf(africa), mutableSetOf(red, yellow, green, black, horizontal), R.drawable.ghana)
            val guinea = Panstwo(r.getString(R.string.country_guinea), mutableSetOf(africa), mutableSetOf(red, yellow, green, vertical), R.drawable.guinea)
            val guineaBissau = Panstwo(r.getString(R.string.country_guinea_bissau), mutableSetOf(africa), mutableSetOf(red, yellow, green, black, other), R.drawable.guinea_bissau)
            val equatorialGuinea = Panstwo(r.getString(R.string.country_equatorial_guinea), mutableSetOf(africa), mutableSetOf(red, white, green, blue, horizontal), R.drawable.equatorial_guinea)
            val cameroon = Panstwo(r.getString(R.string.country_cameroon), mutableSetOf(africa), mutableSetOf(green, red, yellow, vertical), R.drawable.cameroon)
            val kenya = Panstwo(r.getString(R.string.country_kenya), mutableSetOf(africa), mutableSetOf(black, red, green, white, horizontal), R.drawable.kenya)
            val comoros = Panstwo(r.getString(R.string.country_comoros), mutableSetOf(africa), mutableSetOf(blue, yellow, white, blue, green, horizontal), R.drawable.comoros)
            val lesotho = Panstwo(r.getString(R.string.country_lesotho), mutableSetOf(africa), mutableSetOf(blue, white, green, black, horizontal), R.drawable.lesotho)
            val liberia = Panstwo(r.getString(R.string.country_liberia), mutableSetOf(africa), mutableSetOf(red, white, blue, horizontal), R.drawable.liberia)
            val libya = Panstwo(r.getString(R.string.country_libya), mutableSetOf(africa), mutableSetOf(red, black, green, white, horizontal), R.drawable.libya)
            val madagascar = Panstwo(r.getString(R.string.country_madagascar), mutableSetOf(africa), mutableSetOf(white, red, green, other), R.drawable.madagascar)
            val malawi = Panstwo(r.getString(R.string.country_malawi), mutableSetOf(africa), mutableSetOf(black, red, green, horizontal), R.drawable.malawi)
            val mali = Panstwo(r.getString(R.string.country_mali), mutableSetOf(africa), mutableSetOf(green, yellow, red, vertical), R.drawable.mali)
            val morocco = Panstwo(r.getString(R.string.country_morocco), mutableSetOf(africa), mutableSetOf(red, green, other), R.drawable.morocco)
            val mauritania = Panstwo(r.getString(R.string.country_mauritania), mutableSetOf(africa), mutableSetOf(green, yellow, red, horizontal), R.drawable.mauritania)
            val mauritius = Panstwo(r.getString(R.string.country_mauritius), mutableSetOf(africa), mutableSetOf(red, blue, yellow, green, horizontal), R.drawable.mauritius)
            val mozambique = Panstwo(r.getString(R.string.country_mozambique), mutableSetOf(africa), mutableSetOf(green, black, yellow, white, red, horizontal), R.drawable.mozambique)
            val namibia = Panstwo(r.getString(R.string.country_namibia), mutableSetOf(africa), mutableSetOf(blue, red, green, white, other), R.drawable.namibia)
            val niger = Panstwo(r.getString(R.string.country_niger), mutableSetOf(africa), mutableSetOf(orange, white, green, horizontal), R.drawable.niger)
            val nigeria = Panstwo(r.getString(R.string.country_nigeria), mutableSetOf(africa), mutableSetOf(green, white, vertical), R.drawable.nigeria)
            val southAfrica = Panstwo(r.getString(R.string.country_south_africa), mutableSetOf(africa), mutableSetOf(black, yellow, green, blue, white, other), R.drawable.south_africa)
            val centralAfricanRepublic = Panstwo(r.getString(R.string.country_central_african_republic), mutableSetOf(africa), mutableSetOf(blue, white, green, yellow, horizontal), R.drawable.central_african_republic)
            val capeVerde = Panstwo(r.getString(R.string.country_cape_verde), mutableSetOf(africa), mutableSetOf(blue, white, red, horizontal), R.drawable.cape_verde)
            val rwanda = Panstwo(r.getString(R.string.country_rwanda), mutableSetOf(africa), mutableSetOf(blue, yellow, green, horizontal), R.drawable.rwanda)
            val senegal = Panstwo(r.getString(R.string.country_senegal), mutableSetOf(africa), mutableSetOf(green, yellow, red, vertical), R.drawable.senegal)
            val seychelles = Panstwo(r.getString(R.string.country_seychelles), mutableSetOf(africa), mutableSetOf(blue, yellow, red, white, other), R.drawable.seychelles)
            val sierraLeone = Panstwo(r.getString(R.string.country_sierra_leone), mutableSetOf(africa), mutableSetOf(green, white, blue, horizontal), R.drawable.sierra_leone)
            val somalia = Panstwo(r.getString(R.string.country_somalia), mutableSetOf(africa), mutableSetOf(blue, white, other), R.drawable.somalia)
            val sudan = Panstwo(r.getString(R.string.country_sudan), mutableSetOf(africa), mutableSetOf(red, white, black, green, horizontal), R.drawable.sudan)
            val southSudan = Panstwo(r.getString(R.string.country_south_sudan), mutableSetOf(africa), mutableSetOf(black, red, green, blue, white, horizontal), R.drawable.south_sudan)
            val tanzania = Panstwo(r.getString(R.string.country_tanzania), mutableSetOf(africa), mutableSetOf(green, yellow, black, blue, other), R.drawable.tanzania)
            val togo = Panstwo(r.getString(R.string.country_togo), mutableSetOf(africa), mutableSetOf(green, yellow, red, horizontal), R.drawable.togo)
            val tunisia = Panstwo(r.getString(R.string.country_tunisia), mutableSetOf(africa), mutableSetOf(red, white, other), R.drawable.tunisia)
            val uganda = Panstwo(r.getString(R.string.country_uganda), mutableSetOf(africa), mutableSetOf(black, yellow, red, white, horizontal), R.drawable.uganda)
            val zambia = Panstwo(r.getString(R.string.country_zambia), mutableSetOf(africa), mutableSetOf(green, orange, black, red, other), R.drawable.zambia)
            val zimbabwe = Panstwo(r.getString(R.string.country_zimbabwe), mutableSetOf(africa), mutableSetOf(green, yellow, red, white, black, horizontal), R.drawable.zimbabwe)

            val australia = Panstwo(getString(R.string.country_australia), mutableSetOf(oceania), mutableSetOf(red, white, blue), R.drawable.australia)
            val mikronezja = Panstwo(getString(R.string.country_mikronezja), mutableSetOf(oceania), mutableSetOf(blue, white), R.drawable.mikronezja)
            val fidzi = Panstwo(getString(R.string.country_fidzi), mutableSetOf(oceania), mutableSetOf(blue, yellow), R.drawable.fidzi)
            val kiribati = Panstwo(getString(R.string.country_kiribati), mutableSetOf(oceania), mutableSetOf(red, white), R.drawable.kiribati)
            val republikaMarshalla = Panstwo(getString(R.string.country_republikamarshalla), mutableSetOf(oceania), mutableSetOf(blue, white), R.drawable.republikamarshalla)
            val nauru = Panstwo(getString(R.string.country_nauru), mutableSetOf(oceania), mutableSetOf(blue, yellow), R.drawable.nauru)
            val nowaZelandia = Panstwo(getString(R.string.country_nowazelandia), mutableSetOf(oceania), mutableSetOf(red, white, blue), R.drawable.nowazelandia)
            val palau = Panstwo(getString(R.string.country_palau), mutableSetOf(oceania), mutableSetOf(blue, yellow), R.drawable.palau)
            val papuaNowaGwinea = Panstwo(getString(R.string.country_papuanowagwinea), mutableSetOf(oceania), mutableSetOf(red, black, yellow), R.drawable.papuanowagwinea)
            val samoa = Panstwo(getString(R.string.country_samoa), mutableSetOf(oceania), mutableSetOf(red, blue), R.drawable.samoa)
            val wyspySalomona = Panstwo(getString(R.string.country_wyspysalomona), mutableSetOf(oceania), mutableSetOf(blue, green, yellow), R.drawable.wyspysalomona)
            val tonga = Panstwo(getString(R.string.country_tonga), mutableSetOf(oceania), mutableSetOf(red, white), R.drawable.tonga)
            val tuvalu = Panstwo(getString(R.string.country_tuvalu), mutableSetOf(oceania), mutableSetOf(blue, yellow), R.drawable.tuvalu)
            val vanuatu = Panstwo(getString(R.string.country_vanuatu), mutableSetOf(oceania), mutableSetOf(red, green, black), R.drawable.vanuatu)

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
                kambodza,
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
                algeria,
                angola,
                benin,
                botswana,
                burkinaFaso,
                burundi,
                chad,
                democraticRepublicOfCongo,
                djibouti,
                egypt,
                ivoryCoast,
                eritrea,
                eswatini,
                ethiopia,
                gabon,
                gambia,
                ghana,
                guinea,
                guineaBissau,
                equatorialGuinea,
                cameroon,
                kenya,
                comoros,
                lesotho,
                liberia,
                libya,
                madagascar,
                malawi,
                mali,
                morocco,
                mauritania,
                mauritius,
                namibia,
                niger,
                nigeria,
                southAfrica,
                centralAfricanRepublic,
                capeVerde,
                rwanda,
                senegal,
                seychelles,
                sierraLeone,
                somalia,
                sudan,
                southSudan,
                tanzania,
                togo,
                tunisia,
                uganda,
                zambia,
                zimbabwe,
                mozambique,
                australia,
                mikronezja,
                fidzi,
                kiribati,
                republikaMarshalla,
                nauru,
                nowaZelandia,
                palau,
                papuaNowaGwinea,
                samoa,
                wyspySalomona,
                tonga,
                tuvalu,
                vanuatu
            )

            Main(countriesList,
                setOf(
                    white,
                    red,
                    yellow,
                    blue,
                    black,
                    orange,
                    green
                ),
                setOf(
                    horizontal,
                    vertical,
                    cross,
                    other
                ),
                mapOf(
                    "filters" to r.getString(R.string.buttonText_filtry),
                    "results" to r.getString(R.string.buttonText_wyniki),
                    "count" to r.getString(R.string.text_count)
                ),
                setOf(
                    asia,
                    america,
                    africa,
                    europe,
                    oceania
                )
            )
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Main(
    countries: MutableList<Panstwo>,
    propertiesColorInput: Set<String>,
    propertiesLayoutInput: Set<String>,
    texts: Map<String, String>,
    continents: Set<String>
    ) {
    val animationDuration = 850
    val filtersString = texts["filters"] ?: "filters"
    val resultsString = texts["results"] ?: "results"
    val propertiesColor by remember {
        mutableStateOf(propertiesColorInput)
    }
    val propertiesLayout by remember {
        mutableStateOf(propertiesLayoutInput)
    }
    val continentsSelected = remember {
        mutableStateListOf<String>()
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
            buttonText = resultsString
            Column(modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(1.0f)
                .padding(bottom = 20.dp),
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
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color.Black,
                                    uncheckedColor = LocalContentColor.current
                                ),
                            )
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 12.dp),
                                text = property,
                                fontSize = 18.sp,
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
                //pacer(modifier = Modifier.height(5.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        propertiesLayout.forEach { property ->
                            Row(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .padding(bottom = 10.dp)
                                    .fillMaxWidth(0.4f)
                            ) {
                                val checkedState = remember { mutableStateOf(false) }

                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = { checkedState.value = it },
                                    modifier = Modifier.padding(end = 8.dp),
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = Color.Black,
                                        uncheckedColor = LocalContentColor.current
                                    ),
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(vertical = 12.dp),
                                    text = property,
                                    fontSize = 18.sp,
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
                    Column {
                        continents.forEach { continent ->
                            Row(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .fillMaxWidth(0.9f)
                            ) {
                                val checkedState = remember { mutableStateOf(false) }

                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = { checkedState.value = it },
                                    modifier = Modifier.padding(end = 8.dp),
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = Color.Black,
                                        uncheckedColor = LocalContentColor.current
                                    ),
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(vertical = 12.dp),
                                    text = continent,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center,
                                )

                                LaunchedEffect(checkedState.value) {
                                    if (checkedState.value) {
                                        continentsSelected.add(continent)
                                    } else {
                                        continentsSelected.remove(continent)
                                    }
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
            buttonText = filtersString
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
                for (i in propertiesSelected) {
                    filterList.add(i)
                }

                val continentsList by remember {
                    mutableStateOf(mutableSetOf<String>())
                }
                for (i in continentsSelected) {
                    continentsList.add(i)
                }
                Text(
                    text = "${texts["count"] ?: "Count"}: ${filter(countries, filterList, continentsList).size}",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                LazyColumn {

                    itemsIndexed(
                        filter(countries, filterList, continentsList)
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
                .fillMaxWidth(0.7f),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(
                buttonText,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,)
        }
    }
}