package example.igorek.homeworkforlessonten

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val recipeImageView: ImageView =itemView.findViewById(R.id.recipe_image_view)
    private val nameTextView: TextView =itemView.findViewById(R.id.name_text_view)

    fun bind(recipe:Recipe){
        nameTextView.text=recipe.name
        recipeImageView.setImageResource(recipe.image)
    }
}