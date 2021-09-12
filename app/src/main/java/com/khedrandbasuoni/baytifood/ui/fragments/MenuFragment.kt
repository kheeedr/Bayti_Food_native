package com.khedrandbasuoni.baytifood.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.khedrandbasuoni.baytifood.R
import com.khedrandbasuoni.baytifood.databinding.FragmentMenuBinding
import com.khedrandbasuoni.baytifood.pojo.MenuSection
import com.khedrandbasuoni.baytifood.ui.adpter.MenuSectionsAdapter
import java.util.ArrayList

class MenuFragment : Fragment() {
    lateinit var b: FragmentMenuBinding
    private lateinit var menuSectionsAdapter: MenuSectionsAdapter
    private var menuSections: ArrayList<MenuSection> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        b = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        fillMenuSections()

        menuSectionsAdapter = MenuSectionsAdapter(requireContext())
        b.rvTypeOrderMenu.adapter = menuSectionsAdapter
        menuSectionsAdapter.list = menuSections
        menuSectionsAdapter.notifyItemRangeInserted(0, menuSections.size)

        b.scrollMenu.setOnScrollChangeListener { _, _, scrollY, _, _ ->
            run {
                if (scrollY == 0) {
                    b.layoutMainTvMenu.translationZ = 0f
                    b.layoutMainTvMenu.elevation = 0f
                } else if (scrollY > 0) {
                    b.layoutMainTvMenu.translationZ =
                        resources.getDimensionPixelSize(R.dimen._5sdp).toFloat()
                    b.layoutMainTvMenu.elevation =
                        resources.getDimensionPixelSize(R.dimen._3sdp).toFloat()
                }

            }
        }
        return b.root
    }

    private fun fillMenuSections() {
        menuSections.apply {
            add(MenuSection("Food", 120, R.drawable.ic_food_menu_item))
            add(MenuSection("Beverages", 354, R.drawable.img_beverages_menu_section))
            add(MenuSection("Promotions", 81, R.drawable.img_promotions_menu_section))
            add(MenuSection("Desserts", 95, R.drawable.img_desserts_menu_section))
            add(MenuSection("Food", 120, R.drawable.ic_food_menu_item))
            add(MenuSection("Beverages", 354, R.drawable.img_beverages_menu_section))
            add(MenuSection("Promotions", 81, R.drawable.img_promotions_menu_section))
            add(MenuSection("Desserts", 95, R.drawable.img_desserts_menu_section))
            add(MenuSection("Food", 120, R.drawable.ic_food_menu_item))
            add(MenuSection("Beverages", 354, R.drawable.img_beverages_menu_section))
            add(MenuSection("Promotions", 81, R.drawable.img_promotions_menu_section))
            add(MenuSection("Desserts", 95, R.drawable.img_desserts_menu_section))
        }
    }
}