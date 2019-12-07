package olmos.mariana.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Animal=ArrayList<Animales>()
        Animal.add(Animales("Tigre","El tigre blanco y su bebé","https://www.anipedia.net/imagenes/tigre-blanco-1.jpg"))
        Animal.add(Animales("Leon","Leones de melena larga","https://ichef.bbci.co.uk/news/660/cpsprodpb/1644F/production/_98351219_gettyimages-494581208.jpg"))
        Animal.add(Animales("Pantera","Pantera negra","https://ep00.epimg.net/elpais/imagenes/2015/07/20/ciencia/1437404097_668402_1437405025_noticia_normal.jpg"))
        Animal.add(Animales("Perro","Los perros son los mejores amigos del hombre", "https://misanimales.com/wp-content/uploads/2018/12/pastor-holandes-comportamiento.jpg"))
        Animal.add(Animales("Gato", "Amor de gato", "https://ichef.bbci.co.uk/news/660/cpsprodpb/8536/production/_103520143_gettyimages-908714708.jpg"))
        Animal.add(Animales("Perico","Los pericos cantan muy hermoso","https://www.anipedia.net/imagenes/periquitos-800x375.jpg"))

        vistaRecycler.adapter=AnimalAdapter(Animal, this)
        //vistaRecycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        vistaRecycler.layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)


    }
}
