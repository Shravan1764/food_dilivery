package com.example.fooddilivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.fooddilivery.R
import com.example.fooddilivery.adapter.popularadapter
import com.example.fooddilivery.bottomsheetfrag
import com.example.fooddilivery.databinding.FragmentBottomsheetfragBinding
import com.example.fooddilivery.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    private  lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.textView12.setOnClickListener {
            val bottomdialog = bottomsheetfrag()
            bottomdialog.show(parentFragmentManager, "BottomSheetDialog")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imglist = ArrayList<SlideModel>()
        imglist.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imglist.add(SlideModel(R.drawable.poster2, ScaleTypes.FIT))
        imglist.add(SlideModel(R.drawable.poster3, ScaleTypes.FIT))

        val imgSlider = binding.imageSlider
        imgSlider.setImageList(imglist)
        imgSlider.setImageList(imglist, ScaleTypes.FIT)

        imgSlider.setItemClickListener(object :ItemClickListener {

            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
              //  val itemposition = imglist[position]
                val item  = "Selected Image $position"
                Toast.makeText(requireContext(), item, Toast.LENGTH_SHORT).show()
            }
        })

        val item = listOf<String>("Burger","Momos","Chowmin")
        val price = listOf<String>("$5","$10","$15")
        val img = listOf<Int>(R.drawable.burger,R.drawable.banner2,R.drawable.banner3)
        val adapter = popularadapter(item,price,img,requireContext())
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerview.adapter = adapter

    }
}

