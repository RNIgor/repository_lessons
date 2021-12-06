package example.igorek.homeworkforlessonten

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecipesListFragment : Fragment() {

    lateinit var recipesRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewRecipes = inflater.inflate(R.layout.fragment_recipes_list, container, false)

        recipesRecyclerView = viewRecipes.findViewById(R.id.recipes_recycler_view)
        val recipeList: List<Recipe> = listOf(
        Recipe("Olive", R.drawable.olive),
        Recipe("Chiken Grill", R.drawable.chiken_gril),
        Recipe("Fish", R.drawable.fish)
        )
        recipesRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recipesRecyclerView.adapter = RecipeAdapter(recipeList)
        return viewRecipes
    }


}