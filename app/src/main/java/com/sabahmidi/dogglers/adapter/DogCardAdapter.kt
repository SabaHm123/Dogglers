package com.sabahmidi.dogglers.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabahmidi.dogglers.R
import com.sabahmidi.dogglers.const.Layout
import com.sabahmidi.dogglers.data.DataSource
/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,




) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    val dataset = DataSource.dogs


    class DogCardAdapter(private val context: Context,
                        private val dataSource: ArrayList<dogs>) : DogCardAdapter() {
        private val inflater: LayoutInflater
                = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val imageView: ImageView = view!!.findViewById(R.id.ImageView)
        val textName: TextView = view!!.findViewById(R.id.textName)
        val textAge: TextView = view!!.findViewById(R.id.textAge)
        val textHobbies: TextView = view!!.findViewById(R.id.textHobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.

        // TODO Inflate the layout
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return dogHolder(inflatedView)
        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return DogCardViewHolder(null)
    }

    override fun getItemCount(): Int = 0
    val item = dataset[size]

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]
        // TODO: Set the image resource for the current dog
        holder.imageView.setImageResource(item.imageResourceId)

        // TODO: Set the text for the current dog's name
        holder.textName.text = item.name
        // TODO: Set the text for the current dog's age
        val resources = context?.resources
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}





