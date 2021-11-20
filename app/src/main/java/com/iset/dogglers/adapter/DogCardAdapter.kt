package com.iset.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
    private lateinit var adapter: RecyclerView



) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    private val dogs: ArrayList<dogs>


    class DogCardAdapter(private val context: Context,
                        private val dataSource: ArrayList<dogs>) : DogCardAdapter() {
        private val inflater: LayoutInflater
                = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
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
    return dataSource.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val itemPhoto = dataSource[position]
        holder.bindDog(itemdog)
        return dataSource[position]
        // TODO: Set the image resource for the current dog
        // TODO: Set the text for the current dog's name
        // TODO: Set the text for the current dog's age
        val resources = context?.resources
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}





