package olmos.mariana.animals

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mi_tarjeta.view.*


class AnimalAdapter(Animal:ArrayList<Animales>, context: Context):RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    var Animal:ArrayList<Animales>?=null
    var context:Context?=null

    init {
        this.Animal=Animal
        this.context=context
    }

    override fun getItemCount(): Int {
        return Animal!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.ViewHolder {
        val visitaAnimales:View=LayoutInflater.from(context).inflate(R.layout.mi_tarjeta,parent,false)
        val AnimalViewHolder=ViewHolder(visitaAnimales)
        visitaAnimales.tag=AnimalViewHolder
        return AnimalViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.especie!!.text=Animal!![position].especie
        holder.descripcion!!.text=Animal!![position].descripcion
        Picasso.get().load(Animal!![position].foto).into(holder.imagen)


    }

    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista){
        var imagen:ImageView?=null
        var especie:TextView?=null
        var descripcion:TextView?=null


        init {
            imagen = vista.Imagen
            especie = vista.Especies
            descripcion = vista.Descripcion
        }

    }

}


